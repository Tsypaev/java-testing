import org.junit.Test;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * @author Vladimir Tsypaev
 */
public class NumberOfCallsTest {

    private Calculator calculator = mock(Calculator.class);

    @Test
    public void shouldTestExactCountOfCallsTimes(){
        callManyMethods();
        verify(calculator,times(3)).sum(anyInt(),anyInt());
        verify(calculator,times(2)).minus(anyInt(),anyInt());
        verify(calculator,times(1)).div(anyInt(),anyInt());
        verify(calculator,times(4)).multiply(anyInt(),anyInt());
    }

    @Test
    public void shouldTestAtLeastOnceCountOfCallsTimes(){
        callManyMethods();
        verify(calculator,atLeastOnce()).sum(anyInt(),anyInt());
        verify(calculator,atLeastOnce()).minus(anyInt(),anyInt());
        verify(calculator,atLeastOnce()).div(anyInt(),anyInt());
        verify(calculator,atLeastOnce()).multiply(anyInt(),anyInt());
    }

    @Test
    public void shouldTestCountOfCallsTimes(){
        verify(calculator,never()).sum(anyInt(),anyInt());
        verify(calculator,never()).minus(anyInt(),anyInt());
        verify(calculator,never()).div(anyInt(),anyInt());
        verify(calculator,never()).multiply(anyInt(),anyInt());
    }

    private void callManyMethods() {
        calculator.sum(1,1);
        calculator.sum(1,1);
        calculator.sum(1,1);
        calculator.minus(1,1);
        calculator.minus(1,1);
        calculator.div(1,1);
        calculator.multiply(1,1);
        calculator.multiply(1,1);
        calculator.multiply(1,1);
        calculator.multiply(1,1);
    }
}
