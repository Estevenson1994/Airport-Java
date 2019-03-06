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
    public void planeIsInitiallyLanded() {
        assertTrue(plane.landed);
    }
}