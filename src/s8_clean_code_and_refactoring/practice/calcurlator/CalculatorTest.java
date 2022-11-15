package practice.calcurlator;

class CalculatorTest {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static final char Equals = '=';
//    @Test
//    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char opera = ADDITION;
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, opera);
//        assertEquals(expected, result);
    }

//    @Test
//    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        char opera = SUBTRACTION;
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, opera);
//        assertEquals(expected, result);
    }

//    @Test
//    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int firstOpera = 2;
        int secondOperand = 2;
        char opera = MULTIPLICATION;
        int expected = 4;

        int result = Calculator.calculate(firstOpera, secondOperand, opera);
//        assertEquals(expected, result);
    }

//    @Test
//    @DisplayName("Testing division")
    void testCalculateDiv() {
        int firstOpera = 6;
        int secondOperand = 3;
        char opera = DIVISION;
        int expected = 2;

        int result = Calculator.calculate(firstOpera, secondOperand, opera);
//        assertEquals(expected, result);
    }

//    @Test
//    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int firstOpera = 2;
        int secondOperand = 0;
        char opera = DIVISION;

//        assertThrows(RuntimeException.class,
//                ()-> {Calculator.calculate(firstOpera, secondOperand, opera);});
    }

//    @Test
//    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int firstOpera = 2;
        int secondOperand = 0;
        char opera = Equals;

//        assertThrows(RuntimeException.class,
//                ()-> {Calculator.calculate(firstOpera, secondOperand, opera);});
    }
}