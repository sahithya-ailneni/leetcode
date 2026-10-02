class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int extraCandies) {
        int max=c[0];
        ArrayList<Boolean> b=new ArrayList<>();
        for(int i=0;i<c.length;i++){
            if(c[i]>max) max=c[i];
        }
        for(int i=0;i<c.length;i++){
            int e=c[i]+extraCandies;
            if(e>=max) {
                b.add(true);
            }
            else{
                b.add(false);
            }
        }
        return b;
    }
}