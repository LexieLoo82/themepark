import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;


    @Before
    public void before(){
        playground = new Playground("Play park", 30);
        visitor = new Visitor(120, 13, 4.50);
    }


    @Test
    public void canGetName(){
    assertEquals("Play park", playground.getName());
    }

    @Test
    public void hasAgeLimit(){
        assertEquals(false, playground.isAllowedToVisit(visitor));
    }


}
