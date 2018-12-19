import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall icecreamStall;
    Visitor visitor;


    @Before
    public void before(){
        icecreamStall = new IceCreamStall("Icecream Shop", "Dave", 3);
        visitor = new Visitor(120, 13, 4.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Icecream Shop", icecreamStall.getName());
    }

    @Test
    public void hasAgeLimit(){
        assertEquals(true, icecreamStall.isAllowedToVisit(visitor));
    }
}
