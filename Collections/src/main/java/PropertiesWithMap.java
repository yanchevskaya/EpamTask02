import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;


/**
 * Created by Lizhen on 03.02.2017.
 */
public final class PropertiesWithMap {

    private static Map <String, String> myMap = new HashMap();
    private static ResourceBundle rb;


    public static void main(String[] args) {


PropertiesWithMap.getPropertyToMap("St.Petersburg");
PropertiesWithMap.getPropertyToMap("Rubtsovsk");
     System.out.println(PropertiesWithMap.mapConsist());
    }


    public static void getPropertyToMap(String anything){
        rb = ResourceBundle.getBundle("lp");
      myMap.put(anything, rb.getString(anything));
}

    public static String mapConsist(){
        return myMap.toString();
    }
}
