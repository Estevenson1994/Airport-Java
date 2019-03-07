import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AirportFeatureTest {

    private Airport airport;
    private Plane plane;
    private Weather weather;


    @Mock
    private Weather mockedWeather;


    @Before
    public void beforeEachFeatureTest() {
        mockedWeather = mock(Weather.class);
        this.airport = new Airport(mockedWeather, 10);
        this.plane = new Plane();
    }

    @Test
    public void planeCanTakeOffFromAirport() throws WeatherException, AirportFullException {
        when(mockedWeather.isStormy()).thenReturn(false);
        airport.takeOff(plane);
        assertFalse(plane.landed);
        assertFalse(airport.hasPlane(plane));
    }

    @Test
    public void planeCanLandAtAirport() throws WeatherException, AirportFullException {
        when(mockedWeather.isStormy()).thenReturn(false);
        airport.takeOff(plane);
        airport.land(plane);
        assertTrue(plane.landed);
        assertTrue(airport.hasPlane(plane));
    }
}