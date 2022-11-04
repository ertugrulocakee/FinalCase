package LogResults;

import Logs.Log;
import org.testng.ITestContext ;
import org.testng.ITestListener ;
import org.testng.ITestResult ;


public class TestResultLogger implements ITestListener {

    Log log = new Log();

    @Override
    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult arg0) {

        String testName = arg0.getName();

        log.error(testName+" "+"is Fail! --- "+arg0.getThrowable().getMessage());

    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestStart(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSuccess(ITestResult arg0) {

        String testName = arg0.getName();
        log.info(testName+" "+"is Successfull!");

    }

}
