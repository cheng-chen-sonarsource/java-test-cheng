package com.cheng;

import java.util.regex.Pattern;

public class BuggyCheng 
{









    










    public int getSomeLove(int love)
    {
        love = 20220525;    //assgnment of function argument before using        
        int love2 = 202222
        love = love2;    //self-assignment

        Pattern.compile("(?=a)b"); // Noncompliant, the same character can't be equal to 'a' and 'b' at the same time



        
        return love;
    }

    protected void infinitLoops()
    {
        int k = 12;
        boolean b = true;
        while (b) { // Noncompliant; b never written to in loop
        k++;
        }
    }
    
    private void buggyFunction()
    {
        int target = -5;
        int num = 3;
        num = num + target;
        num = num + target;

        


        target -= num;  // Noncompliant; target = -3. Is that really what's meant?
        target =+ num; // Noncompliant; target = 3
    }
}
