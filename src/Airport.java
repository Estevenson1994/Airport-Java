import java.util.ArrayList;
import java.util.List;

public class Airport {

    public List<Plane> planes;
    public Weather weather;
    public int capacity;

    public Airport(Weather weather, int capacity) {
        this.planes = new ArrayList<>();
        this.weather = weather;
        this.capacity = capacity;
    }

    public Plane land(Plane plane) throws WeatherException, AirportFullException {
        if (weather.isStormy()) {
            throw new WeatherException("Weather is stormy, cannot land");
        }
        else if (numberofPlanes() >= capacity) {
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

    private int numberofPlanes() {
        return planes.size();
    }



}
