package example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
Create a test class named 'TestClassOne' with several test groups
4.1. Create several groups of tests
4.2 Group precondition and teardown methods, excluding one of them from test execution
 */
public class TestClassOne {

    @BeforeClass(groups = "ALLOCATE_RESOURCES")
    public void setup() {
        System.out.println("setup()");
    }

    @AfterClass(groups = "RELEASE_REGRESSION_TEST_RESOURCES")
    public void releaseResourcesRegressionTest() {
        System.out.println("releaseResourcesRegressionTest()");
    }

    @AfterClass(groups = "RELEASE_E2E_TEST_RESOURCES")
    public void releaseResourcesE2ETest() {
        System.out.println("releaseResourcesE2ETest()");
    }

    @Test(groups = "REGRESSION")
    public void regressionTest1() {
        System.out.println("regressionTest1()");
    }

    @Test(groups = "REGRESSION")
    public void regressionTest2() {
        System.out.println("regressionTest2()");
    }

    @Test(groups = "E2E")
    public void e2eTest1() {
        System.out.println("e2eTest1()");
    }
}
