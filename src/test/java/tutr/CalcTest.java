package tutr;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Unit test for simple App.
 */
public class CalcTest
{@Test
    public void testadd()
    {
        Calc math=new Calc();
        assertEquals( math.add(11, 5), 16 );
    }
    @Test
    public void addsubtract()
    {
        Calc math=new Calc();
        assertEquals( math.subtract(5, 2), 3 );
    }
}
