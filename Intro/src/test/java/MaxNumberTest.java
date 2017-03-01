import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class MaxNumberTest {

    @Test
    public void maxNumberTestFirst(){
        int[] u = {1, 45, 6, 734, 54, 76, 876, 123, 546, 7, 345, 55, 67, 36, 73, 90, 34, 44};
        assertThat(MaxNumber.maxNumber(u), is (931));
    }

    @Test
    public void maxNumberTestSecond(){
        int[] u = {1, 45, 6, 734, 54, 76, 876, 123, 546, 7, 345, 55, 67, 36, 73, 90, 34, 44};
        assertThat(MaxNumber.maxNumber2(u), is (931));
    }

    @Test
    public void maxNumberTestFirstFalse(){
        int[] u = {1, 45, 6, 734, 54, 76, 876, 123, 546, 7, 345, 55, 67, 36, 73, 90, 34, 44};
        assertFalse(MaxNumber.maxNumber2(u)==1000);
    }

    @Test
    public void maxNumberTestSecondFalse(){
        int[] u = {1, -45, 6, 734, 54, 76, 876, 123, 546, 7, 345, 55, -67, 36, 73, -90, 34, -44};
        assertFalse(MaxNumber.maxNumber2(u)==5);
    }


}
