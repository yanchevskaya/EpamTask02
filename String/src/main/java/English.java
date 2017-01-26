import java.util.ListResourceBundle;

/**
 * Created by Lisica on 24.01.2017.
 */
public class English extends ListResourceBundle{

    @Override
    protected Object[][] getContents() {
            return new Object[][]{
                    {"prop.key1", "value01"},
                    {"prop.key2", "value02"},
            };
        }
    }

