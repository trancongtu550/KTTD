package TH_237;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenertest implements ITestListener {
	@Override
	public void onStart (ITestContext arg0) {
		System.out.println("start testin !!");
		
	}
	
	@Override
	public void onFinish (ITestContext arg0) {
		System.out.println("test success !!");
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage (ITestResult arg0) {
		
	}
	
	@Override
	public void onTestFailure (ITestResult arg0) {
		System.out.println("Test fail !!");
	}
	
	@Override
	public void onTestSkipped (ITestResult arg0) {
		
	}
	
	@Override
	public void onTestStart (ITestResult arg0) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Next test !!");
	}
}