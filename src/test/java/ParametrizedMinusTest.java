import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * @author Vladimir Tsypaev
 */

@RunWith(Parameterized.class)
public class ParametrizedMinusTest {

    private int a;
    private int b;
    private int expected;
    private Calculator calculator = new Calculator();

    public ParametrizedMinusTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:({0}-{1})={2})")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {6,2,4},
                {0,1,-1},
                {-2,-2,0},
                {-2,2,-4},
                {7,2,5}
        });
    }

    @Test
    public void shouldReturnMinus(){
        assertEquals(expected, calculator.minus(a,b));
    }
}
