import java.util.*;

/**
 * Created by Lizhen on 03.02.2017.
 */
public class ReadProperties {

     static String valueOfProperties(String nameOfProperty, String key) throws NoProperty, NoKey {
        ResourceBundle bundle;
        String value;
        try {
            bundle = ResourceBundle.getBundle(nameOfProperty);
        } catch (MissingResourceException e) {
            throw new NoProperty();
        }
        try {
            value = bundle.getString(key);
        } catch (MissingResourceException e) {
           throw new NoKey();

        }
        return value;
    }
}


