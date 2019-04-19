import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Vladimir Tsypaev
 */
public class MockAnyValueTest {

    private static final int ANSWER = 2;
    private Calculator calculator = mock(Calculator.class);

    @Before
    public void setUp() {
        when(calculator.sum(anyInt(),anyInt())).thenReturn(ANSWER);
        when(calculator.minus(anyInt(),anyInt())).thenReturn(ANSWER);
        when(calculator.div(anyInt(),anyInt())).thenReturn(ANSWER);
        when(calculator.multiply(anyInt(),anyInt())).thenReturn(ANSWER);
    }

    @Test
    public void shouldReturnMockValue(){
        assertEquals(calculator.sum(1,2),2);
        assertEquals(calculator.minus(4,5),2);
        assertEquals(calculator.div(7,8),2);
        assertEquals(calculator.multiply(10,11),2);
    }

}
