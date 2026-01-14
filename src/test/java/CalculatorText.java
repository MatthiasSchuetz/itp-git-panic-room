import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void add_works() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    void divide_works() {
        assertEquals(5, Calculator.divide(10, 2));
    }

    @Test
    void add_works2() {
        assertEquals(27, Calculator.add(7, 20));
    }
}
