import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class AirportTest {

    private Airport airport;

    @Mock
    private Plane mockedPlane;

    @Before
    public void beforeEachTestMethod() {
        this.airport = new Airport();
    }

    @Test
    public void testPlaneCanLandInAirport() {
         Assert.assertSame(mockedPlane, airport.land(mockedPlane));
    }

    @Test
    public void testPlaneCanTakeOff() {
        Assert.assertSame(mockedPlane, airport.takeOff(mockedPlane));
    }

}