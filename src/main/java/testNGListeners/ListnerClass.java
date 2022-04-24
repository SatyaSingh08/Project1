package testNGListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass implements ITestListener {

    public void onTestStart(ITestResult result)
    {
        System.out.println("On Test Start Message --- > "+result.getName());
    }

    public void onFinish(ITestContext context){
        System.out.println("On Finish Message --- > "+context.getName());
    }

    public void onStart(ITestContext context) {
        System.out.println("On Start Message --- > "+context.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("On Test Success --- > "+result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("On Test Failure --- > "+result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("On Test Skipped --- > "+result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("On Test Failed Within Success Percentage  --- > "+result.getName());
    }

    public  void onTestFailedWithTimeout(ITestResult result) {
        onTestFailure(result);
    }







}
