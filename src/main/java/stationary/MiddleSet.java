package stationary;

import stationary.Calculator;
import stationary.Clips;
import stationary.Set;
import stationary.Stationery;

/**
 * Created by Lisica on 18.01.2017.
 */
public class MiddleSet extends Set {
    private static final int SET = 5;
    private Stationery calculator = new Calculator("Casio", 500);
    private Stationery clips = new Clips("Attache", 270);

    public MiddleSet(){
        super(SET);
        add(calculator);
        add(clips);
    }
     MiddleSet(int a){
        super(a);
        add(calculator);
        add(clips);
    }

}
