package testNG_Topics;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.testng.AssertJUnit;

public class GroupTestExample {
	
	String message = ".com";
    MessageUtil messageUtil = new MessageUtil(message);
    
    @Test(groups = {"smokeTest", "regression"})
    public void testPrintMessge() {    
        message = ".com";
        AssertJUnit.assertEquals(message, messageUtil.printMessage() );
    }
    
    @Test(groups = "smokeTest")
    public void testSalutationMessage() {
        message = "techcircleschool" + message;
        AssertJUnit.assertEquals(message, messageUtil.salutationMessage());
    }
    
    @Test(groups = {"regression", "functionTest", "smokeTest"})
    public void testingExitMessage() {
        message = "www." + "techcircletutorial" + ".com";
        AssertJUnit.assertEquals(message, messageUtil.exitMessage());

    }
	
	
	
}
