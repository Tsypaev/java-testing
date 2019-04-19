import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author Vladimir Tsypaev
 */
public class MockExactValueTest {

    private static final int ANSWER = 3;
    private Calculator calculator = mock(Calculator.class);

    @Before
    public void setUp() {
        when(calculator.sum(1,1)).thenReturn(3);
        when(calculator.minus(1,1)).thenReturn(3);
        when(calculator.div(1,1)).thenReturn(3);
        when(calculator.multiply(1,1)).thenReturn(3);
    }

    @Test
    public void shouldReturnMockValue(){
        assertEquals(calculator.sum(1,1), ANSWER);
        assertEquals(calculator.minus(1,1),ANSWER);
        assertEquals(calculator.div(1,1),ANSWER);
        assertEquals(calculator.multiply(1,1),ANSWER);
    }
}
