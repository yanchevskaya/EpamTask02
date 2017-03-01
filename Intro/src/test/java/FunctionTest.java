import org.junit.Test;

/**
 * Created by Lizhen on 27.02.2017.
 */
public class FunctionTest {

    @Test
    public void functionTest(){
        Function function = new Function();
        function.function(12, 108, 7);
    }

    @Test
    public void functionTestNegative(){
        Function function = new Function();
        function.function(127, 10, 5);
    }

    @Test
    public void functionTestEq(){
        Function function = new Function();
        function.function(10, 10, 5);
    }
}
