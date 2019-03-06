import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;

public class AirportTest {

    private Airport airport;

    @Mock
    private Plane mockedPlane;

    @Before
    public void beforeEachTestMethod() {
        this.airport = new Airport();
        mockedPlane = mock(Plane.class);
    }

    @Test
    public void testPlaneCanLandInAirport() {
         Assert.assertEquals(mockedPlane, airport.land(mockedPlane));
    }

    @Test
    public void testPlaneCanTakeOff() {
        Assert.assertEquals(mockedPlane, airport.takeOff(mockedPlane));
    }

    @Test
    public void testAirportConfirmsPlaneHasLanded() {
        airport.land(mockedPlane);
        Assert.assertTrue(airport.hasPlane(mockedPlane));
    }


    @Test
    public void testAirportConfirmsPlaneHasTakenOff() {
        airport.land(mockedPlane);
        airport.takeOff(mockedPlane);
        Assert.assertFalse(airport.hasPlane(mockedPlane));
    }
}