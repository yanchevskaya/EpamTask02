package boat;

/**
 * Created by Lisica on 20.01.2017.
 */
@Wonderland(a=0, wonderland = "pudding")
public class AtomBoat {
    private String name;
    private double distance;
    private Engine engine;
    int count = 0;
    Wonderland boat;

    public AtomBoat(String name, double distance) {
        this.distance = distance;
        this.name = name;
        engine = new Engine();
    }


    private class Engine {
        double hours;
        int count = 10;

            double move(double speed) {

            hours = distance / speed;
            System.out.println("Boat " + name + "is going with the speed " + speed + " m/h");
            return hours;
        }


    }


    public double spendHours(double speed) {
        return engine.move(speed);
    }

}

