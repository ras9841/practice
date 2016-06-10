/*
 * File: PermCheck.java
 * Language: Java 8
 */

import java.util.HashMap;
import java.lang.Character;
import java.lang.Integer;

public class PermCheck
{
    private HashMap<Character, Integer> dict; 
   
    public PermCheck() 
    {
        this.dict = new HashMap<>();
    };

    public boolean test(String w1, String w2)
    {
        // Check for same length
        if (w1.length() != w2.length()) return false;
        
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
            else { dict.replace(c, dict.get(c)-1); }
        }
        int remainder = dict.values().stream().mapToInt(Integer::intValue).sum(); 
        return remainder == 0 ? true : false;
    }
}
