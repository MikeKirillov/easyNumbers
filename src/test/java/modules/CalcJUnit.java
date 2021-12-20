package modules;

import JavaCore.Module25.CalcLog4j;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcJUnit {
    @Test
    public void getSum() {
        assertEquals(14, CalcLog4j.getSum(7, 7));
    }

    @Test
    public void getSub() {
        assertEquals(14, CalcLog4j.getSub(16, 2));
    }

    @Test
    public void getMult() {
        assertEquals(14, CalcLog4j.getMult(2, 7));
    }

    @Test
    public void getDivide() {
        assertEquals(7, CalcLog4j.getDivide(14, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionExeption() {
        CalcLog4j.getDivide(14, 0);
    }
}
