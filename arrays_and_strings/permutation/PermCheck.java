/*
 * File: PermCheck.java
 * Language: Java 8
 */

import java.util.HashMap;
import java.lang.Character;
import java.lang.Integer;

public class PermCheck
{
    private static PermCheck tst = new PermCheck();
    private static HashMap<Character, Integer> dict; 
   
    private PermCheck() {};

    public static PermCheck getInstance()
    {
        return tst;
    }

    public static boolean test(String w1, String w2)
    {
        dict = new HashMap<>();
        
        // Remove case sensitivity
        w1 = w1.toLowerCase();
        w2 = w2.toLowerCase();

        // Check for same length
        if (w1.length() != w2.length()) { return false; }

        // Check for same string
        if (w1.equals(w2)) { return true; }

        // Add the first word to the map
        for (Character c : w1.toCharArray())
        {
            if (dict.containsKey(c)) { dict.replace(c, dict.get(c)+1); }
            else { dict.put(c, (Integer)1); }
        }
       
        // Check for same letters and letter frequency
        for (Character c : w2.toCharArray())
        {
            if (!dict.containsKey(c)) { return false; }
            else if (dict.get(c).equals((Integer) 0)) { return false; }
            else 
            { 
                int val = dict.get(c).intValue();
                dict.replace(c, (Integer)(val-1)) ;
            }
        }
        int remain = dict.values().stream().mapToInt(Integer::intValue).sum(); 
        return remain == 0 ? true : false;
    }
}
