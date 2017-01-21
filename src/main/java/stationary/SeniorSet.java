package stationary;

import stationary.Corrector;
import stationary.Folder;
import stationary.MiddleSet;
import stationary.Stationery;

/**
 * Created by Lisica on 18.01.2017.
 */
public class SeniorSet extends MiddleSet {
    private static final int SET = 7;
    private Stationery folder = new Folder("Attache", 300);
    private Stationery corrector = new Corrector("SimpleName", 280);

    public SeniorSet(){
        super(SET);
        add(folder);
        add(corrector);
    }

}
