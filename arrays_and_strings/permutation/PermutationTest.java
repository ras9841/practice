/*
 *  File: PermutationTest.java
 *  Lanuage: Java 8
 */

/**
 * PermutationTest runs a series of test to validate PermCheck.java's test 
 * method.
 *
 * Usage: java -ea PermutationTest
 *
 * Note: "-ea" flag required to allow the assertions run.
 *
 * @author Allen Sanford (ras9841@rit.edu)
 * @version 1.0
 * @since 06/09/16
 */
public class PermutationTest 
{
    public static void main(String[] args) 
    {
        /**
         * The main method executes nine tests in order to determine if 
         * two strings are permutations of each other.
         *
         * @param args commandline args (not used)
         */
        if (args.length > 0) { printUsage(); }

        PermCheck pc = PermCheck.getInstance();

        //TC0: null strings
        assert !pc.test(null, null): "\nFaled test case 0";

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

        //TC7: numbers
        assert pc.test("1234", "4321"): "\nFaled test case 7";
        
        //TC8: symbols
        assert pc.test("!@#$%", "%!$@#"): "\nFaled test case 8";
        
        //TC9: mixed
        assert pc.test("aA1!", "1!aA"): "\nFaled test case 9";
        
        System.out.println("All tests passed.");
    }

    public static void printUsage()
    {
    /**
     * Prints class usage message to standard output.
     */
        System.out.println("Usage: java -ea PermutationTest");
        System.exit(0);
    }
}
