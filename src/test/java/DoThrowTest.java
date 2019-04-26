import org.junit.Test;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

public class DoThrowTest {

    private static final int DIGIT = 2;
    private Calculator calculator = mock(Calculator.class);

    @Test(expected = RuntimeException.class)
    public void sumThrowException(){
        doThrow(RuntimeException.class).when(calculator.sum(anyInt(),anyInt()));
        calculator.sum(DIGIT, DIGIT);
    }

    @Test(expected = RuntimeException.class)
    public void minusThrowException(){
        doThrow(RuntimeException.class).when(calculator.minus(anyInt(),anyInt()));
        calculator.minus(DIGIT, DIGIT);
    }

    @Test(expected = RuntimeException.class)
    public void multiplyThrowException(){
        doThrow(RuntimeException.class).when(calculator.multiply(anyInt(),anyInt()));
        calculator.multiply(DIGIT, DIGIT);
    }

    @Test(expected = RuntimeException.class)
    public void divThrowException(){
        doThrow(RuntimeException.class).when(calculator.div(anyInt(),anyInt()));
        calculator.div(DIGIT, DIGIT);
    }
}
