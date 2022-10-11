import com.revature.testing.Calculator;
import com.revature.testing.DivideByZeroException;
import org.junit.*;

public class CalculatorTest {

    // Below here we'll introduce methods to begin testing our object

    // To test our calculator we're going to need a tesing object
    static Calculator calc;

    // Right now this value is null, we could directly instantiate but we're use dependency injection to handle this

    // What I'm going to do to create a new calc object is use a before class annotation to create the calc object before
    // any of the test methods are run

    // To run something before the entire class I'll use the @BeforeClass annotation
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("This runs before the entire class but only once");
        calc = new Calculator();
    }

    //I'll add some additional methods to see how they stack out when we run the test suite

    @Before
    public void beforeEach(){
        System.out.println("This runs before each test");
    }

    @After
    public void afterEach(){
        System.out.println("This runs after each test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("This runs once but after everything");
    }


    //Let's create some test cases

    // This is a positive test, which means we should be checking for the right solution
    @Test
    public void positiveAdditionTest(){
        // assertEquals(expected, actual);
        System.out.println("Testing Positive Addition Test");
        Assert.assertEquals(4, calc.addNumbers(2,2));
    }

    // We'll also create a negative addition test to verify we're not getting the WRONG output

    @Test
    public void negativeAdditionTest(){
        System.out.println("Testing Negative Addition Test");
        Assert.assertNotEquals(7, calc.addNumbers(2,3));
    }

    // How do we test to see if an exception arises?
    @Test(expected = DivideByZeroException.class)
    public void testDivideByZero(){
        calc.divideNumbers(2,0);
    }

    @Test(expected = ArithmeticException.class)
    public void testIntDivideByZero(){
        calc.division(2,0);
    }

    @Test
    public void TDDSubtraction(){
        Assert.assertEquals(3, calc.subtractNumbers(6,3));
    }

    @Test
    public void negativeTDDSubtraction(){
        Assert.assertNotEquals(3, calc.subtractNumbers(27,5));
    }



}
