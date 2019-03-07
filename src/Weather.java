import java.util.Random;

public class Weather {

    Random num = new Random();

    public Boolean isStormy() {
        return num.nextInt(5) > 3;
    }

    public Boolean isStormy(int num) {

        return num > 3;
    }


}
