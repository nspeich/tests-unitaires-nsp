import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        String input = "3 7 +";
        double result = Calculator.evaluateRPN(input);
        assertEquals(10.0, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        String input = "10 4 -";
        double result = Calculator.evaluateRPN(input);
        assertEquals(6.0, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        String input = "2 3 *";
        double result = Calculator.evaluateRPN(input);
        assertEquals(6.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnknownOperator() {
        String input = "3 4 ^";
        Calculator.evaluateRPN(input);
    }
}
