import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;

public class ExampleExceptionTest {

    /**
     * Test data for positive test.
     *
     * @return test data array
     */
    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {2, 2, 4},
                {2, 3, 6},
                {10, 3, 30},
                {8, 5, 40}
        };
    }

    /**
     * Test data for exception test.
     *
     * @return test data array
     */
    @DataProvider(name = "negativeData")
    public static Object[][] negativeData() {
        return new Object[][]{
                {-2, 2},
                {2, -2},
                {0, 5},
                {-1, -2}
        };
    }

    @Test(dataProvider = "data")
    public void testRectangleArea(int a, int b, int c) {
        // TODO put your code here
        assertEquals(ExampleException.rectangleArea(a, b), c, "Area is not as expected");
    }

    @Test(dataProvider = "negativeData")
    public void testRectangleAreaNegative(int a, int b) {
        // TODO put your code here

        IllegalArgumentException thrown = expectThrows("Wrong input data",
                IllegalArgumentException.class,
                () -> ExampleException.rectangleArea(a, b)
        );
        assertEquals(thrown.getMessage(), "input value is below zero!");
    }
}