import org.junit.Test;
import stationary.Pen;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Lisica on 16.01.2017.
 */
public class TestPen {

    @Test
    public void testInk(){
        Pen penTwo = new Pen("Parker", "plastic", 2, 12, 200);
        penTwo.setInk("blue");
        Pen penNine = new Pen ("Parker","plastic",2, 12, 200);
        penNine.setInk("red");
        Pen penTen = new Pen("Parker", "plastic", 2, 12, 200);
        penTen.setInk("blue");
        Pen penOne = new Pen("Parker", "plastic", 2, 12, 200);
        assertTrue(penTwo.equals(penTen));
        assertTrue(penTen.equals(penTwo));
        assertFalse(penTwo.equals(penNine));
        assertFalse(penNine.equals(penTwo));
        assertFalse(penOne.equals(penNine));
        assertFalse(penNine.equals(penOne));
    }

    @Test
    public void testMaterial() {
        Pen penOne = new Pen("Parker", "plastic",2, 12, 200);
        Pen penFive = new Pen ("Parkerk", "metall", 2, 12, 200);
        assertFalse(penOne.equals(penFive));
        assertFalse(penFive.equals(penOne));
    }

    @Test
    public void testWide() {
        Pen penOne = new Pen("Parker", "plastic", 2, 12, 200);
        Pen penSix = new Pen("Parker", "plastic", 3, 12, 200);
        assertFalse(penOne.equals(penSix));
        assertFalse(penSix.equals(penOne));
    }

    @Test
    public void testLength() {
        Pen penOne = new Pen("Parker", "plastic", 2, 12, 200);
        Pen penSeven = new Pen ("Parker", "plastic",2, 13, 200);
        assertFalse(penOne.equals(penSeven));
        assertFalse(penSeven.equals(penOne));
    }

    @Test
    public void testPrice() {
        Pen penThree = new Pen("Parker", 200);
        Pen penThreea = new Pen("Parker", 200);
        Pen penEight = new Pen ("Parker", 500);
        assertFalse(penThree.equals(penEight));
        assertFalse(penEight.equals(penThree));
        assertTrue(penThree.equals(penThreea));
        assertTrue(penThreea.equals(penThree));
    }

    @Test
    public void testColor(){
        Pen penThree = new Pen("Parker", 200);
        Pen penTwo = new Pen("Parker", 200);
        penTwo.setColor("gray");
        Pen penOne = new Pen("Parker", 200);
        penOne.setColor("green");
        Pen penFour = new Pen("Parker", 200);
        penFour.setColor("green");

        assertFalse(penOne.equals(penTwo));
        assertFalse(penTwo.equals(penOne));
        assertFalse(penOne.equals(penThree));
        assertFalse(penThree.equals(penOne));
        assertTrue(penOne.equals(penFour));
        assertTrue(penFour.equals(penOne));

    }

    @Test
    public void testName(){
        Pen penThree = new Pen("Parker", 200);
        Pen penTwo = new Pen("Alice", 200);
        Pen penOne = new Pen("Parker", 200);
        Pen penFour = new Pen();

        assertFalse(penOne.equals(penTwo));
        assertFalse(penTwo.equals(penOne));
        assertTrue(penOne.equals(penThree));
        assertTrue(penThree.equals(penOne));
        assertFalse(penOne.equals(penFour));
        assertFalse(penFour.equals(penOne));
    }

    @Test
    public void testString(){
        Pen pen = new Pen("Parker", 300);
       assertEquals("stationary.Pen@producerName: Parker, material: unknown, color unknown, " +
               "size unknown, ink: unknown, price 300", pen.toString());
   }

}
