import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Round and Round", 15);
        visitor = new Visitor(120, 13, 4.50);
    }

    @Test
    public void canGetName(){
        assertEquals("Round and Round", rollerCoaster.getName());
    }

    @Test
    public void hasSecurityMeasures(){
        assertEquals(false, rollerCoaster.isAllowedToVisit(visitor));
    }


}
