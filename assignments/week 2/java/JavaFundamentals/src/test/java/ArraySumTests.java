import com.revature.testing.ArraySum;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArraySumTests {

    static ArraySum as;

    @BeforeClass
    public static void setUp(){
        as = new ArraySum();
    }

    // Write a few tests to make sure the code works

    @Test
    public void additionPositiveTest(){

        int[] array = {1,2,3,4,5};

        Assert.assertEquals(15, as.arraySum(array));

    }

}