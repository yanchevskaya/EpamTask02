import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class MaxNumberTest {

    @Test
    public void maxNumberTestFirst(){
        MaxNumber mn = new MaxNumber();
        int[] u = {1, 45, 6, 734, 54, 76, 876, 123, 546, 7, 345, 55, 67, 36, 73, 90, 34, 44};
        assertThat(mn.maxNumber(u), is (931));
    }

    @Test
    public void maxNumberTestSecond(){
        MaxNumber mn = new MaxNumber();
        int[] u = {1, 45, 6, 734, 54, 76, 876, 123, 546, 7, 345, 55, 67, 36, 73, 90, 34, 44};
        assertThat(mn.maxNumber2(u), is (931));
    }

    @Test
    public void maxNumberTestFirstFalse(){
        MaxNumber mn = new MaxNumber();
        int[] u = {1, 45, 6, 734, 54, 76, 876, 123, 546, 7, 345, 55, 67, 36, 73, 90, 34, 44};
        assertFalse(mn.maxNumber2(u)==1000);
    }

    @Test
    public void maxNumberTestSecondFalse(){
        MaxNumber mn = new MaxNumber();
        int[] u = {1, -45, 6, 734, 54, 76, 876, 123, 546, 7, 345, 55, -67, 36, 73, -90, 34, -44};
        assertFalse(mn.maxNumber2(u)==5);
    }


}
