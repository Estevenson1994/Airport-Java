import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest {

    private Plane plane;

    @Before
    public void beforeEachPlaneTestMethod() {
        this.plane = new Plane();
    }

    @Test
    public void planeIsIntiallyNotLanded() {
        assertFalse(plane.landed);
    }

    @Test
    public void planeCanTakeOff() {
        plane.land();
        plane.takeOff();
        assertFalse(plane.landed);
    }

    @Test
    public void planeCanLand() {
        plane.land();
        assertTrue(plane.landed);
    }
}