import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("M&Ds", 200);
    }

    @Test
    public void canGetName(){
        assertEquals("M&Ds", park.getName());
    }



}
