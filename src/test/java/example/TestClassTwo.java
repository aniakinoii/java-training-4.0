package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
Create another test class 'TestClassTwo' with 2 parametrised test methods
5.1 The first method has to accept parameters from testng.xml
5.2 The second method has to accept parameters from a dataprovider
 */
public class TestClassTwo {

    @Test
    @Parameters({"deviceKind"})
    public void regressionTest(String deviceKind) {
        System.out.println("Executing test for device: " + deviceKind);
    }

    @DataProvider(name = "data-provider")
    public Object[][] deviceKindDataProvider() {
        return new Object[][]{{"Pluto"}, {"Fontina"}};
    }

    @Test(dataProvider = "data-provider")
    public void e2eTest(String deviceKind) {
        System.out.println("Executing test for device: " + deviceKind);
    }
}
