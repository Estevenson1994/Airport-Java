import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AirportTest {

    private Airport airport;

    @Mock
    private Plane mockedPlane;
    private Weather mockedWeather;


    @Before
    public void beforeEachTestMethod() {
        mockedPlane = mock(Plane.class);
        mockedWeather = mock(Weather.class);
        this.airport = new Airport(mockedWeather);
    }

    @Test
    public void testPlaneCanLandInAirport() throws WeatherException {
         Assert.assertEquals(mockedPlane, airport.land(mockedPlane));
    }

    @Test
    public void testPlaneCanTakeOff() throws WeatherException {
        when(mockedWeather.isStormy()).thenReturn(false);
        Assert.assertEquals(mockedPlane, airport.takeOff(mockedPlane));
    }

    @Test
    public void testAirportConfirmsPlaneHasLanded() throws WeatherException {
        airport.land(mockedPlane);
        Assert.assertTrue(airport.hasPlane(mockedPlane));
    }


    @Test
    public void testAirportConfirmsPlaneHasTakenOff() throws WeatherException {
        airport.land(mockedPlane);
        when(mockedWeather.isStormy()).thenReturn(false);
        airport.takeOff(mockedPlane);
        Assert.assertFalse(airport.hasPlane(mockedPlane));
    }


    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testPlaneCannotTakeOffWhenStormy() throws WeatherException {
        airport.land(mockedPlane);
        when(mockedWeather.isStormy()).thenReturn(true);
        thrown.expect(WeatherException.class);
        thrown.expectMessage("Weather is stormy, cannot take off");
        airport.takeOff(mockedPlane);
    }


    @Test
    public void testPlaneCannotLandWhenStormy() throws WeatherException {
        when(mockedWeather.isStormy()).thenReturn(true);
        thrown.expect(WeatherException.class);
        thrown.expectMessage("Weather is stormy, cannot land");
        airport.land(mockedPlane);
    }
}