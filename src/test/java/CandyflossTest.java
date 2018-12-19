import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyflossTest {

    CandyflossStall candyflossStall;
    Visitor visitor;


    @Before
    public void before(){
        candyflossStall = new CandyflossStall("Fluffies", "Dave Fluff", 4);
        visitor = new Visitor(120, 13, 4.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Fluffies", candyflossStall.getName());
    }

    @Test
    public void hasAgeLimit(){
        assertEquals(true, candyflossStall.isAllowedToVisit(visitor));
    }
}
