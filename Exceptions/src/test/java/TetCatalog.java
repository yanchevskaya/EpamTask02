import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Lizhen on 03.02.2017.
 */
public class TetCatalog {

    @Test
    public void tedtCreatingFile() throws PathNotExists, FileIsAlreadyExists {
        File file = new File("Autumn");
        Catalog.createTextFile("Autumn");
        assertTrue(file.exists());
    }

    @Test
    public void testDeleteFile() throws FileDoesNotExist {
        File file = new File("Autumn");
        Catalog.deleteTextFile("Autumn");
        assertFalse(file.exists());
    }
}
