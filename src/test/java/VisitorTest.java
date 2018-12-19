import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(170, 20, 40.50);
    }

    @Test
    public void canGetHeight(){
        assertEquals(170, visitor.getHeight(), 1);
    }

    @Test
    public void canGetMoney(){
        assertEquals(40.50, visitor.getMoney(), 1);
    }


    @Test
    public void canGetAge(){
        assertEquals(20, visitor.getAge(), 1);
    }


}
