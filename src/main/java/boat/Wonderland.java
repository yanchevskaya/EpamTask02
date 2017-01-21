package boat;
import java.lang.annotation.*;

/**
 * Created by Lisica on 21.01.2017.
 */
@Target(ElementType.TYPE)
//@Documented
@Retention(RetentionPolicy.RUNTIME)

public @interface Wonderland {
    int a();
    String wonderland () default " ";
}
