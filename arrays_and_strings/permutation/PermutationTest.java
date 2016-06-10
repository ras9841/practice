/*
 *  File: PermutationTest.java
 *  Lanuage: Java 8
 */

public class PermutationTest
{
    public static PermCheck test = new PermCheck();
    
    public static void main(String[] args)
    {
        //TC1: empty strings 
        assert test.test("", ""): "\nFaled test case 1";
        
        //TC2: valid permutation
        assert test.test("slab", "labs"): "\nFaled test case 2";

        //TC3: invalid permutation
        assert !test.test("slab", "rock"): "\nFaled test case 3";

        //TC4: case test
        assert test.test("slab", "SLAB"): "\nFaled test case 4";
        
        //TC5: length test
        assert !test.test("slab", "slabs"): "\nFaled test case 5";

        //TC6: repeated letters
        assert !test.test("slab", "lass"): "\nFaled test case 6";

        System.out.println("All tests passed.");
    }

}
