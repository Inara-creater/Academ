import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void beforeCalc() {
        this.calc = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(10, calc.add(5,5));
    }

    @Test
    public void sub() {
        assertEquals(15, calc.sub (20, 5));
    }

    @Test
    public void mul() {
        assertEquals(81, calc.mul(9,9) );
    }

    @Test
    public void div() {
        assertEquals(25, calc.div(625,25));
    }

    @Test
    public void mixedOptions () {
        assertEquals(calc.add(3,5), calc.div(24, 3 ));
        assertEquals(calc.sub(91, 9), calc.mul(9, 10) );
    }

}