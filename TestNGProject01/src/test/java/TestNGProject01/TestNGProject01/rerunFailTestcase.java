package TestNGProject01.TestNGProject01;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class rerunFailTestcase implements IRetryAnalyzer{

	int counter=0;
	int maxRetry=3;

	@Override
	public boolean retry(ITestResult result) {

		if(counter<maxRetry)
		{
			counter++;
			return true;
		}
		return false;
	}

}
