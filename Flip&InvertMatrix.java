//Sasha's solution for Flip and Invert Matrix

import java.util.*;

class Solution {
    public int[][] solve(int[][] matrix) {
        //Get horizontal length of matrix
        int lengthOfMatrix = matrix.length;
        //If matrix is completely empty, just return matrix
        if(lengthOfMatrix == 0){return matrix;}

        //Get vertical height of matrix
        int heightOfMatrix = matrix[0].length;
        
        //Make a temp array to write our reverse and flipped numbers into
        int[][] tempArray = new int[lengthOfMatrix][heightOfMatrix];

        //For the entire length of the matrix, loop till end reached
        for(int h = 0; h < matrix.length; h++){

            int j = heightOfMatrix;

            //For the entire height of the matrix, loop till end reached
            for (int i = 0; i < heightOfMatrix; i++) {
                //Flips numbers
                tempArray[h][j - 1] = matrix[h][i];

                //Flips numbers from 1 to 0 and vice versa
                if(tempArray[h][j - 1] == 1){
                    tempArray[h][j - 1] = 0;
                }
                else{
                    tempArray[h][j - 1] = 1;
                }  
                j--;
            }
        }
        return tempArray;
    }
}
