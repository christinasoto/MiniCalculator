
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
    }

}

