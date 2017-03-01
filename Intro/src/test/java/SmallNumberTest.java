import org.junit.Test;

public class SmallNumberTest {

    @Test
    public void smallestNumberTest(){
       SmallNumber.smallNumber(0.03);
    }

    @Test
    public void smallestNumberTest2(){
        SmallNumber.smallNumber(1);
    }

    @Test
    public void smallestNumberTest3(){
       SmallNumber.smallNumber(-1);
    }
}
