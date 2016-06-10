/*
 *  File: PermutationTest.java
 *  Lanuage: Java 8
 */

public class PermutationTest
{
    public static void main(String[] args)
    {
        PermCheck pc = PermCheck.getInstance();

        //TC1: empty strings 
        assert pc.test("", ""): "\nFaled test case 1";
        
        //TC2: valid permutation
        assert pc.test("slab", "labs"): "\nFaled test case 2";

        //TC3: invalid permutation
        assert !pc.test("slab", "rock"): "\nFaled test case 3";

        //TC4: case test
        assert pc.test("slab", "SLAB"): "\nFaled test case 4";
        
        //TC5: length test
        assert !pc.test("slab", "slabs"): "\nFaled test case 5";

        //TC6: repeated letters
        assert !pc.test("slab", "lass"): "\nFaled test case 6";

        System.out.println("All tests passed.");
    }

}
