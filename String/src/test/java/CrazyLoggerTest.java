import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lisica on 24.01.2017.
 */
public class CrazyLoggerTest {

    @Test
    public void find()  {
           CrazyLogger logger = new CrazyLogger();
            logger.add("Alalala");
            logger.add("simple");
            logger.add("beautiful");
           assertEquals("beautiful", logger.find("beautiful"));
    }

    }