class Solution {
    public int lengthOfLastWord(String s) {
       s=s.trim();
      int  lstlength=0;
       for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)!=' '){
            lstlength++;
        }
        else if(lstlength>0){
            break;
        }
       }
       return lstlength;

        
    }
}