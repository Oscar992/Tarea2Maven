package base;

import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected SoftAssert softAssert;

    @BeforeMethod(alwaysRun = true, description = "Master precondition")
    public void setUpBase() {
        softAssert = new SoftAssert();
    }
}
