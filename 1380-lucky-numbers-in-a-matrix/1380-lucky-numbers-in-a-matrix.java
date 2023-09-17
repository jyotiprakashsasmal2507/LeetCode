class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
      int rows = matrix.length;
        int columns = matrix[0].length;
        ArrayList<Integer>arr = new ArrayList<Integer>();
         for (int i=0; i<rows; i++){
             int max = Integer.MAX_VALUE;
             int index = -1;
            for (int j=0; j<columns; j++){
                if(matrix[i][j] < max){
                    max = matrix[i][j];
                    index = j;
                }
            }
             boolean flag = true;
             for(int k=0; k<rows; k++){
                 if(matrix[k][index] >max ) flag = false;
             }
             if(flag) arr.add(max);
        }

        return arr;
    }
    }
