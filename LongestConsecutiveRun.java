//Longest Consecutive Run of 1s in Binary by Sasha
import java.util.*;

class Solution {
    public int solve(int n) {
        
        String result = Integer.toBinaryString(n);
        int counterReturn = 0;
        int tempCounter = 0;

        for(int i = 0; i < result.length(); i++){

            if(result.charAt(i) == '1'){tempCounter ++;}
            else{tempCounter = 0;}
            if(tempCounter > counterReturn){counterReturn = tempCounter;}

        }

        return counterReturn;

    }
}
