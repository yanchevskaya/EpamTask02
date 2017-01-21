import stationary.Set;
import stationary.Stationery;


/**
 * Created by Lisica on 17.01.2017.
 */
public class WorkPlace {
    private Set set;

     WorkPlace(Set set) {
        this.set = set;
    }

     int sumOfStationery() {
        int sum = 0;

        for (Stationery st : set.getSet()) {
            if (null == st)
                break;
            sum += st.getPrice();
        }

        return sum;
    }

    public String consistStationery() {
        return set.toString();

        }

    }


