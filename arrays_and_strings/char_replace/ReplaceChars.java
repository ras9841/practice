/*
 * File: ReplaceChars.java
 * Language: Java 8
 */

/**
 * The ReplaceChars class contains a replace() method that replaces all spaces
 * in a string with a set of fill characters and a main() method that tests it.
 *
 * Usage: java -eq ReplaceChars
 *
 * Note: "-ea" flag required for assertions to function properly.
 *
 * @author Allen Sanford (ras841@rit.edu)
 * @version 1.0
 * @since 06/09/16
 */
public class ReplaceChars 
{
    public static void main(String[] args)
    {
    /**
     * Runs several test cases to check that the replace function works 
     * properly.
     *
     * @param args commandline arguments (not used)
     */
        if (args.length != 0) { printUsage(); }
        
        char[] fill = new char[] {'%','2', '0'};
        String word;


        //TC1:  empty string
        word = "";
        assert "".equals(replace(word, fill));
     
        //TC2:  no space
        word = "hello";
        assert "hello".equals(replace(word, fill));

        //TC3:  one space
        word = "hello, world";
        assert "hello,%20world".equals(replace(word, fill));

        //TC4:  many spaces, one time
        word = "hello,   world";
        assert "hello,%20%20%20world".equals(replace(word, fill));

        //TC5:  many spaces, many times
        word = "hello, fine  world";
        assert "hello,%20fine%20%20world".equals(replace(word, fill));
        
        System.out.println("All tests passed.");
    }
    
    public static String replace(String word, char[] fill)
    {
    /**
     * Takes a string and replaces each space with a specified set of 
     * characters.
     *
     * @param word base string to check for spaces
     * @param fill character array substituted in for a space character
     * @return a new string with the spaces replaced
     */
        char[] chars = word.toCharArray();
        int char_len = chars.length, num_space = 0, f_size = fill.length;

        // Check for empty string
        if (char_len == 0) { return ""; }

        for (char c : chars)
        {
            if (c == ' ') { num_space++; }
        }

        // Check for no fill or no spaces
        if (num_space*f_size == 0) { return word; }
        
        int new_len = char_len + (f_size-1)*num_space;
        char[] new_str = new char[new_len];
        char c;
        for (int i=0, j=0; i<char_len; i++,j++)
        {
            c = chars[i]; 
            if (c == ' ') 
            { 
                for (int k=0; k<f_size; k++,j++) 
                { 
                    // Insert fill characters
                    new_str[j] = fill[k]; 
                }
                j--;
            }
            else
            {
                new_str[j] = c;
            }
        }
        
        return new String(new_str);
    }
    
    public static void printUsage()
    {
        System.out.println("Usage: java -ea ReplaceChars");
        System.exit(0);
    }
}
