import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;

public class AirportTest {

    private Airport airport;

    @Mock
    private Plane mockedPlane;

    @Test
    public void testPlaneCanLandInAirport() {
        this.airport = new Airport();
         Assert.assertSame(mockedPlane, airport.land(mockedPlane));

    }

}