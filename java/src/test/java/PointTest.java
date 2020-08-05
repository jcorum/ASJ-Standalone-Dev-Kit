import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceFromOrigin() {
        assertEquals(5,new Point(3,4).distanceFromOrigin(),.00001);
        assertEquals(13,new Point(5,-12).distanceFromOrigin(),.00001);
        assertEquals(25,new Point(-7,24).distanceFromOrigin(),.00001);
        assertEquals(Math.sqrt(2),new Point(-1,-1).distanceFromOrigin(),.00001);
        assertEquals(5,new Point(0,5).distanceFromOrigin(),.00001);
        assertEquals(6,new Point(-6,0).distanceFromOrigin(),.00001);
        assertEquals(0,new Point(0,0).distanceFromOrigin(),.00001);



    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getQuadrant() {
        assertEquals("in quadrant 1",new Point(3,4).getQuadrant());
        assertEquals("in quadrant 2",new Point(-4.5,6).getQuadrant());
        assertEquals("in quadrant 3",new Point(-1,-1).getQuadrant());
        assertEquals("in quadrant 4",new Point(19,-3.2215).getQuadrant());
        assertEquals("on axis",new Point(0,-7).getQuadrant());
        assertEquals("on axis",new Point(12,0).getQuadrant());
        assertEquals("at the origin",new Point(0,0).getQuadrant());

    }
}
