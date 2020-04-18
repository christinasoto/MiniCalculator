import jdk.jfr.StackTrace;

public class UnitTests {
    //need unit tests for multiply, divide and calculate
    public static void main(String args[]) {
        MiniCalculator test = new MiniCalculator();
        test.multiply(5);
        if (test.calculate() != 5)
            System.out.println("\n\t Failed to correctly multiply");
        else System.out.println("\n\t Successfully multiplied");
        test.divide(2);
        if (test.calculate() != 2)
            System.out.println("\n\t Failed to correctly divide");
        else
            System.out.println("\n\t Successfully divided");
    }

}

