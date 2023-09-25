class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
          StringBuilder combined= new StringBuilder();
        for(String s: word1){
            combined.append(s);
        }
        StringBuilder combined1= new StringBuilder();
        for(String s: word2){
            combined1.append(s);
        }
        return combined.compareTo(combined1)==0;
   
    }
}