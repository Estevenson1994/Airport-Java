import java.util.ArrayList;
import java.util.List;

public class Airport {

    public List<Plane> planes;
    public Weather weather;

    public Airport(Weather weather) {
        this.planes = new ArrayList<>();
        this.weather = weather;
    }

    public Plane land(Plane plane) throws WeatherException, AirportFullException {
        if (weather.isStormy()) {
            throw new WeatherException("Weather is stormy, cannot land");
        }
        else if (planes.size() >= 10) {
           throw new AirportFullException("Airport is full, cannot land");
        }
        else {
            plane.land();
            planes.add(plane);
            return plane;
        }
    }


    public Plane takeOff(Plane plane) throws WeatherException {
        if (weather.isStormy()) {
            throw new WeatherException("Weather is stormy, cannot take off");
        }
        else {
            plane.takeOff();
            planes.remove(plane);
            return plane;
        }
    }

    public Boolean hasPlane(Plane plane) {
        return planes.contains(plane);
    }



}
