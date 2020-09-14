package demo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("From Listener : " +result.getMethod() + " started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("From Listener : " +result.getMethod() + " succeeded");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("From Listener : " +result.getMethod() + " failed");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("From Listener : " +result.getMethod() + " skipped");
    }
}
