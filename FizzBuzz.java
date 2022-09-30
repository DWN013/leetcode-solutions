import java.util.*;

/*
 * Given an integer n, return a list of integers from 1 to n 
 * as strings except for multiples of 3 use “Fizz” 
 * instead of the integer and for the multiples of 5 use “Buzz”. 
 * For integers which are multiples of both 3 and 5 use “FizzBuzz”.
 */

class Solution {
    public String[] solve(int n) {
        
        String[] numList = new String[n];

        for (int i = 1; i <= n; i++){
            if(i%3 == 0 && i%5 == 0){
                numList[i-1] = "FizzBuzz";
            }
            else if(i%5 == 0){
                numList[i-1] = "Buzz";
            }
            else if(i%3 == 0){
                numList[i-1] = "Fizz";
            }
            else{
                numList[i-1] = Integer.toString(i);
            }
        }

        return numList;
    }
}
