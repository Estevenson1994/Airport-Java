import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirportFeatureTest {

    private Airport airport;
    private Plane plane;

    @Before
    public void beforeEachFeatureTest() {
        this.airport = new Airport();
        this.plane = new Plane();
    }

    @Test
    public void planeCanTakeOffFromAirport() {
        airport.takeOff(plane);
        assertFalse(plane.landed);
        assertFalse(airport.hasPlane(plane));
    }

    @Test
    public void planeCanLandAtAirport() {
        airport.takeOff(plane);
        airport.land(plane);
        assertTrue(plane.landed);
        assertTrue(airport.hasPlane(plane));
    }
}