package TestNGPrograms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ITestListener implements in ListenerDemo class
public class ListenerDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Every test cases starts then display their details here:"+result.getName());
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success of test cases and its details are : "+result.getName());  
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("failure of test cases and its details are:"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped of test cases and its details are:"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("failed test cases with success percentage and its details are:"+result.getName());
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		System.out.println("failure test cases due to timeout and its details are:"+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("An onStart() method is executed on the start of any test method.");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("An onFinish() is invoked when any test case finishes its execution.");
	}

}
