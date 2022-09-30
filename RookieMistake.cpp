//Sasha's C++ solution for "Rookie Mistake"

bool solve(string s) {
    
    int lengthOfString = s.length();

    char rightSide = s[lengthOfString];
    char leftSide = s[0];

    int i = 0;

    //While the left side is not B keep going right until is R is reached
    while(leftSide != 'B'){
        leftSide = s[i];
        if(leftSide == 'R'){
            return true;
        }
        i++;
    }

    i = lengthOfString;

    //While the right side is not B keep going left until is R is reached
    while(rightSide != 'B'){
        rightSide = s[i];
        if(rightSide == 'R'){
            return true;
        }
        i--;
    }

    return false;
}
