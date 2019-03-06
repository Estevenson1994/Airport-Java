public class Plane {

    public Boolean landed;

    public Plane() {
        this.landed = true;
    }

    public void takeOff() {
        this.landed = false;
    }
}
