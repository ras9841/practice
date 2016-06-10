public class ReplaceChars 
{
    public static void main(String[] args)
    {
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
        
        char[] chars = word.toCharArray();
        int char_len = chars.length, num_space = 0, f_size = fill.length;


        if (char_len == 0) { return ""; }

        for (char c : chars)
        {
            if (c == ' ') { num_space++; }
        }

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
