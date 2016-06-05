/*
 * File: UniqueChars.java
 * Language: Java 8
 */

import java.util.HashMap;
import java.lang.Character;

/**
 * The UniqueChars program determines is a string specified at runtime contains
 * all unique characters. The results and calculation times for two methods, (1)
 * HashMap-based and (2) Array-based, are displayed to standard output.
 *
 * @author Allen Sanford (ras9841@rit.edu)
 * @version 1.0
 * @since 06/05/16
 */
public class UniqueChars {
    public static void main(String[] args) {
        /**
         * The main method executes the map and array functions and writes their
         * results to standard output.
         *
         * @param args  commandline args where the 1st is the word to test.
         */
        if (args.length != 1) printUsage();
        
        String word = args[0];
        if (word.length() > 256) printNo();

        long t1 = System.currentTimeMillis();
        mapMethod(word);
        long t2 = System.currentTimeMillis();
        arrayMethod(word);
        long t3 = System.currentTimeMillis();

        System.out.println("Map Method: " + (t2-t1) +"ms");
        System.out.println("Array Method: " + (t3-t2)+"ms");
    }

    public static void mapMethod(String word) {
        /**
         * Uses Java's native HashMap to determine whether there are repeated 
         * characters (stored as keys) in the word.
         *
         * @param word  word to analyze
         */
        HashMap<Character, String> chars = new HashMap<>(word.length());
        Boolean flag = true;
        for (char c : word.toCharArray()) {
            if (chars.containsKey(c)) { 
                printNo();
                flag = false;
                break;
            }
            else { chars.put((Character)c, null); }
        }
        if (flag) printYes();
    }

    public static void arrayMethod(String word) {
        /**
         * Uses a binary array to determine whether there are repeated 
         * characters in the word.
         *
         * @param word  word to analyze
         */
        int [] chars = new int[256];
        Boolean flag = true;
        for (char c : word.toCharArray()) {
            if (chars[(int)c] == 0) {
                chars[(int)c] = 1;
            }
            else {
                printNo();
                flag = false;
                break;
            }
        }
        if (flag) printYes();
    }
    
    public static void printUsage() {
        System.out.println("Please use one input argument.");
        System.exit(0);
    }
    public static void printNo() {
        System.out.println("Some characters are repeated.");
    }
    public static void printYes() {
        System.out.println("All characters are unique.");
    }

} 
