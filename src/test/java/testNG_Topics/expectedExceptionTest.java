package testNG_Topics;

import org.testng.annotations.Test;

public class expectedExceptionTest {

	String message = "TechCircle";
	MessageUtil messageUtil = new MessageUtil(message);
	@Test(expectedExceptions = ArithmeticException.class)
	public void testPrintMessage() {
		messageUtil.printMessageExceptionMessage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
