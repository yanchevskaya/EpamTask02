import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Properties;


/**
 * Created by Lisica on 24.01.2017.
 */
public class Internationalization {
    private ResourceBundle bundle;


    Internationalization(Locale locale) {
        bundle = ResourceBundle.getBundle("prop", locale);
    }

    public String getAnswer(String key) {
        return bundle.getString(key);
    }

}


//    private ResourceBundle rb;
//
//    public Internationalization(Locale locale){
//        rb = ResourceBundle.getBundle("ChoseLocale", locale);
//    }
//
//    Locale rus = new Locale ("rus");
//    Locale gb = new Locale ("en", "GB");
//
//
//
//    String key = "rus";
//


