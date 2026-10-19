class CalculatorTest {

    void addsTwoNumbers() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);

        if (result != 5) {
            throw new AssertionError("Expected 5, got " + result);
        }
    }

    void divideByZeroThrowsException() {
        Calculator calc = new Calculator();

        try {
            calc.divide(10, 0);
            throw new AssertionError("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            // Expected exception
        }
    }

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.addsTwoNumbers();
        test.divideByZeroThrowsException();

        System.out.println("All tests passed!");
    }
}