package com.cheng;

import com.cheng.BuggyCheng;

// Add a comment line
// Added another line

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        BuggyCheng cheng = new BuggyCheng();
        int love = cheng.getSomeLove(19820401);

        assert cheng == cheng;  // always-true assert

        VulnerableCheng anotherCheng = new VulnerableCheng();
        try{
            anotherCheng.fishyConnection();  // calls a vulnerable function
            anotherCheng.nosqlInjection(null, null);
        }
        catch (Exception e) {
            System.out.println("I catched you...");
        }
        finally{
            System.out.println("this is the end of the world.");
        }
        
        System.out.println( "Hello World! I got some love:" + love);

        try{
            anotherCheng.fishyConnection();  // calls a vulnerable function
            anotherCheng.nosqlInjection(null, null);
        }
        catch (Exception e) {
            System.out.println("I catched you...");
        }
    }
}
