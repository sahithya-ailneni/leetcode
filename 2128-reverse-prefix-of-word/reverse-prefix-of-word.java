class Solution {
    public String reversePrefix(String word, char ch) {
        int j=-1;
        String s="";;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c==ch) {j=i;
            break;}
        }
        for(int i=j;i>=0;i--){
            s+=word.charAt(i);
        }
        for(int i=j+1;i<word.length();i++){
            s+=word.charAt(i);
        }
        return s;
    }
}