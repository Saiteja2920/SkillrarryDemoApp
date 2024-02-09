package genericLibraries;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Suite Execution Starts");
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+ "Execution Starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+" Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+ " Fail");
		System.out.println("Failed due to: "+result.getThrowable());
		WebDriverUtility web = new WebDriverUtility();
		web.captureScreenshot(BaseClass.sdriver, BaseClass.sjutil, result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+ " Skipped");
		System.out.println("Skipped due to: "+ result.getThrowable());
	}

	@Override          
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Suite Execution Terminates");
	}

}