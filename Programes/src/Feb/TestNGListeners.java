package Feb;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Tc on finish results are"+result.getName());
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("Tc on start results are"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Tc on TestFailedButWithinSuccessPercentage results are"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Tc on TestFailure results are"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Tc on TestSkipped results are"+result.getName());		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Tc on TestStart results are"+result.getName());	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Tc on TestSuccess results are"+result.getName());			
	}

}
