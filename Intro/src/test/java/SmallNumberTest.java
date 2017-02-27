import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lizhen on 27.02.2017.
 */
public class SmallNumberTest {

    @Test
    public void smallestNumberTest(){
       SmallNumber sn = new SmallNumber();
       sn.smallNumber(0.03);
    }

    @Test
    public void smallestNumberTest2(){
        SmallNumber sn = new SmallNumber();
        sn.smallNumber(1);
    }

    @Test
    public void smallestNumberTest3(){
        SmallNumber sn = new SmallNumber();
        sn.smallNumber(-1);
    }
}
