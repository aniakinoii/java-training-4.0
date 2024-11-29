package example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleTest {

    @BeforeClass
    public void setup() {
        System.out.println("setup()");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("tearDown()");
    }

    @Test
    public void test1() {
        System.out.println("test1()");
    }
}
