/**
 * Holds the unit tests that test the multiply, divide and calculate methods then informs the
 * user whether they were successful or failed.
 *
 * JDK version: 8.0.0
 *
 * @author Christina Soto
 *  * @version 8.0.0
 *  * @since 04-18-2020
 */

public class UnitTests {
    //need unit tests for multiply, divide and calculate
    public static void main(String args[]) {

        MiniCalculator test = new MiniCalculator();

        test.multiply(10);
        if (test.calculate() != 10)
            System.out.println("\n FAILED TO MULTIPLY");
        else System.out.println("\n SUCCESSFULLY MULTIPLIED");

        test.divide(5);
        if (test.calculate() != 2)
            System.out.println("\n FAILED TO DIVIDE");
        else
            System.out.println("\n SUCCESSFULLY DIVIDED");

        test.calculate();
        if(test.calculate() != 0)
        System.out.println("\n OPERATIONS CORRECTLY CALCULATED");
        else
            System.out.println("\n OPERATIONS NOT CORRECTLY CALCULATED");

    }
}

