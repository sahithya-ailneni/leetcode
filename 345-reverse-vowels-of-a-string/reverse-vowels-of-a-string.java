class Solution {
    public String reverseVowels(String s) {
        char c2[]=s.toCharArray();
       int i=0;
       int j=c2.length-1;
       while(i<j){
        char c=Character.toUpperCase(c2[i]);
        char c1=Character.toUpperCase(c2[j]);
        if(c!='A' && c!='E'&&c!='I' && c!='O' && c!='U'){
            i++;
            continue;
        }
         if(c1!='A' && c1!='E'&&c1!='I' && c1!='O' && c1!='U'){
            j--;
            continue;
        }
         char temp=c2[i];
         c2[i]=c2[j];
         c2[j]=temp;
         i++;
         j--;
       }
       return new String(c2);

    }
}