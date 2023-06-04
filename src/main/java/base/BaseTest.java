package base;

import listeners.SuiteListeners;
import listeners.TestListeners;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

@Listeners({SuiteListeners.class, TestListeners.class})
public class BaseTest {
    protected SoftAssert softAssert;
    protected final String smoke = "smoke";
    protected final String regression = "regression";

    @BeforeMethod(alwaysRun = true, description = "Master precondition")
    public void setUpBase() {
        softAssert = new SoftAssert();
    }
}
