import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import java.util.Random;

public class WeatherTest {

    private Weather weather;


    @Before
    public void beforeEachWeatherTest() {
        this.weather = new Weather();
    }

    @Test
    public void testWeatherIsStormy() {
        Assert.assertTrue(weather.isStormy(4));
    }


    @Test
    public void testWeatherIsSunny() {
        Assert.assertFalse(weather.isStormy(3));
    }

}