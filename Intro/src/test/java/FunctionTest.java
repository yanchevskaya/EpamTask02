import org.junit.Test;

public class FunctionTest {

    @Test
    public void functionTest(){
        Function.function(12, 108, 7);
    }

    @Test
    public void functionTestNegative(){
        Function.function(127, 10, 5);
    }

    @Test
    public void functionTestEq(){
        Function.function(10, 10, 5);
    }
}
