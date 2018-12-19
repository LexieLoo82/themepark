import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;


    @Before
    public void before(){
        dodgems = new Dodgems("Dodgems", 20);
    }

    @Test
    public void cangetCapacity(){
        assertEquals(20, dodgems.getCapacity());
    }


    @Test
    public void cangetName(){
        assertEquals("Dodgems", dodgems.getName());
    }


}
