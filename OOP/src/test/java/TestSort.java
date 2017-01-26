import org.junit.Test;
import stationary.SeniorSet;
import stationary.Set;
import static org.junit.Assert.assertEquals;

/**
 * Created by Lisica on 19.01.2017.
 */
public class TestSort {

    @Test
    public void sortTestByPrice(){
        Set set = new SeniorSet();
        set.sortByPrice();
        assertEquals("stationary.SeniorSet\n" +
                "stationary.Pencil@producerName: Traktor,  price 20\n" +
                "stationary.Eraser@producerName: Elephant,  price 20\n" +
                "stationary.Pen@producerName: Parker, material: unknown, color unknown, size unknown, ink: unknown, price 120\n" +
                "stationary.Clips@producerName: Attache,  price 270\n" +
                "stationary.Corrector@producerName: SimpleName,  price 280\n" +
                "stationary.Folder@producerName: Attache,  price 300\n" +
                "stationary.Calculator@producerName: Casio,  price 500\n", set.toString());
    }

    @Test
    public void sortTestByName(){
        Set set = new SeniorSet();
        set.sortByName();
        assertEquals("stationary.SeniorSet\n" +
               "stationary.Clips@producerName: Attache,  price 270\n" +
               "stationary.Folder@producerName: Attache,  price 300\n" +
               "stationary.Calculator@producerName: Casio,  price 500\n" +
               "stationary.Eraser@producerName: Elephant,  price 20\n" +
               "stationary.Pen@producerName: Parker, material: unknown, color unknown, size unknown, ink: unknown, price 120\n" +
               "stationary.Corrector@producerName: SimpleName,  price 280\n" +
               "stationary.Pencil@producerName: Traktor,  price 20\n",set.toString());
    }

    @Test
    public void sortTestPriceName(){
        Set set = new SeniorSet();
        set.sortByPriceName();
        assertEquals("stationary.SeniorSet\n" +
               "stationary.Eraser@producerName: Elephant,  price 20\n" +
               "stationary.Pencil@producerName: Traktor,  price 20\n" +
               "stationary.Pen@producerName: Parker, material: unknown, color unknown, size unknown, ink: unknown, price 120\n" +
               "stationary.Clips@producerName: Attache,  price 270\n" +
               "stationary.Corrector@producerName: SimpleName,  price 280\n" +
               "stationary.Folder@producerName: Attache,  price 300\n" +
               "stationary.Calculator@producerName: Casio,  price 500\n",set.toString());
    }


}
