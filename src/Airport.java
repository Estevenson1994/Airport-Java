import java.util.ArrayList;
import java.util.List;

public class Airport {

    public List<Plane> planes;

    public Airport() {
        this.planes = new ArrayList<>();
    }

    public Plane land(Plane plane) {
        plane.land();
        planes.add(plane);
        return plane;
    }


    public Plane takeOff(Plane plane) {
        plane.takeOff();
        planes.remove(plane);
        return plane;
    }

    public Boolean hasPlane(Plane plane) {
        return planes.contains(plane);
    }


}
