/*
 *  File: PermutationTest.java
 *  Lanuage: Java 8
 */

public class PermutationTest
{
    public static PermCheck test = new PermCheck();
    
    public static void main(String[] args)
    {
        //TC1:  valid permutation
        assert test.test("slab", "labs"): "\nFaled test case 1";

        System.out.println("All tests passed.");
    }

}
