import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Lizhen on 03.02.2017.
 */
public class TestProperties {

    @Test(expected=NoProperty.class)
    public void testPropertyException()throws NoProperty, NoKey{
        ReadProperties.valueOfProperties("annn", "caddy");
    }

    @Test(expected=NoKey.class)
    public void testKeyException()throws NoProperty, NoKey{
        ReadProperties.valueOfProperties("ann", "caddy");
}

    @Test
    public void testWithoutException()throws NoProperty, NoKey{
        assertEquals(ReadProperties.valueOfProperties("ann", "cady"), "james");
    }
}
