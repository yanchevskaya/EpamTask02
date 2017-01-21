package stationary;

import java.util.Comparator;

/**
 * Created by Lisica on 19.01.2017.
 */
public class SortByPrice implements Comparator<Stationery> {

    @Override
    public int compare(Stationery s1, Stationery s2) {
        return s1.getPrice() - s2.getPrice();
    }
}
