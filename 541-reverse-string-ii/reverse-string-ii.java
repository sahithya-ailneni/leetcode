class Solution {
    public String reverseStr(String s, int k) {
        String st = "";

        for (int i = 0; i < s.length(); i += 2 * k) {

            // reverse first k characters
            int end = Math.min(i + k, s.length()) - 1;

            for (int j = end; j >= i; j--) {
                st += s.charAt(j);
            }

            // add remaining characters until 2k
            for (int j = i + k; j < Math.min(i + 2 * k, s.length()); j++) {
                st += s.charAt(j);
            }
        }

        return st;
    }
}