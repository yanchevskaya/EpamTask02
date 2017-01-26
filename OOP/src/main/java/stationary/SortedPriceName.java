package stationary;

import java.util.Comparator;

/**
 * Created by Lisica on 19.01.2017.
 */
public class SortedPriceName implements Comparator<Stationery>{

    @Override
    public int compare(Stationery s1, Stationery s2) {
        int result;

        result =  s1.getPrice() - s2.getPrice();
        if (result!=0) return result;

        result = s1.getProducerName().compareTo(s2.getProducerName());

        return result;

            }
}
