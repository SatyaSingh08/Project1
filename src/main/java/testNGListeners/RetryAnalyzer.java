package testNGListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private int counter = 0;
    private int limit = 5;

    @Override
    public boolean retry(ITestResult result) {
        if(counter<limit){
            counter++;
            return true;
        }
        return false;
    }
}
