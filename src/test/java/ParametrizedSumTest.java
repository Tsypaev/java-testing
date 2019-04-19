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
public class ParametrizedSumTest {


    private int a;
    private int b;
    private int expected;
    private Calculator calculator = new Calculator();

    public ParametrizedSumTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:({0}+{1})={2})")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {6,2,8},
                {0,1,1},
                {-2,-2,-4},
                {-2,2,0},
                {7,2,9}
        });
    }

    @Test
    public void shouldReturnMinus(){
        assertEquals(expected, calculator.sum(a,b));
    }


}
