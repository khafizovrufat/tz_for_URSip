import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class MainClassTest {

    @Test
    public void theResultShouldBeFour(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Assert.assertEquals("004", MainClass.generateNum(integerList));
    }

    @Test
    public void theResultShouldBeTwo(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        Assert.assertEquals("002", MainClass.generateNum(integerList));
    }

    @Test
    public void theResultShouldBeOne(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        Assert.assertEquals("001", MainClass.generateNum(integerList));
    }
}
