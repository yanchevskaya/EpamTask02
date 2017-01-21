import boat.AtomBoat;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



/**
 * Created by Lisica on 20.01.2017.
 */
public class TestBoat {

    @Test
    public void testBoat() {
        AtomBoat ab = new AtomBoat("Beda", 660);
        assertThat(ab.spendHours(120), is(5.5));

    }
}

