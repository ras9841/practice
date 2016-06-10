/*
 * File: PermCheck.java
 * Language: Java 8
 */

/* Imports */
import java.util.HashMap;
import java.lang.Character;
import java.lang.Integer;

/**
 * PermCheck is a singleton class that encapsulates the test method.
 *
 * @author Allen Sanford (ras9841@rit.edu)
 * @version 1.0
 * @since 06/09/16
 */
public class PermCheck
{
    private static PermCheck tst = new PermCheck();
    private static HashMap<Character, Integer> dict; 
   
    private PermCheck() {};

    public static PermCheck getInstance()
    {
    /**
     * getInstance returns the only instance of the PermCheck class.
     *
     * @return only PermCheck object.
     */
        return tst;
    }

    public static boolean test(String w1, String w2)
    {
    /**
     * test determines if two strings are permutations of one another. The 
     * analysis is not case sensitive, but is sensitive to whitespace.
     *
     * @param w1 first string to analyze
     * @param w2 second string to analyze
     * @return true is w1 and w2 are permutations, false if not
     */
        dict = new HashMap<>();
        
        // Check for null strings
        if (w1 == null || w2 == null) { return false; }

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
