package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utility.Logs;

public class TestListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        Logs.info("onTestStart");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Logs.info("onTestSuccess");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Logs.info("onTestFailure");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Logs.info("onTestSkipped");
    }

    @Override
    public void onStart(ITestContext context) {
        Logs.info("onStart");
    }

    @Override
    public void onFinish(ITestContext context) {
        Logs.info("onFinish");
    }
}
