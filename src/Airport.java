public class Airport {

    public Plane land(Plane plane) {
        plane.land();
        return plane;
    }


    public Plane takeOff(Plane plane) {
        plane.takeOff();
        return plane;
    }
}
