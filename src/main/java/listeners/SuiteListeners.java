package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import utility.Logs;

public class SuiteListeners implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        Logs.info("onStart");
    }

    @Override
    public void onFinish(ISuite suite) {
        Logs.info("onFinish");
    }
}
