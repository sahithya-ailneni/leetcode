class Solution {
    public boolean isFascinating(int n) {
        boolean[] digits = new boolean[10];
        for(int multi = 1; multi <= 3; multi++) {
            int c = n * multi;
            while(c > 0) {
                if(digits[c % 10]) return false;
                digits[c % 10] = true;
                c /= 10;
            }
        }
        return !digits[0]; 
    }
}