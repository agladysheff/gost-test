package agladyshev;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    private Factorial factorial = new Factorial();

    @Test
    public void testFactorioal(){
        assertEquals(1, factorial.foo(7,7));
        assertEquals(10,factorial.foo(5,2));
        assertEquals(1,factorial.foo(6,0));
        assertEquals(161700,factorial.foo(100,97));
    }
}
