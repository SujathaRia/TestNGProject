package Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass {
	
	
	@Test(dependsOnMethods="test2")
public void test1() {
	System.out.println("Inside home loan test 1");
}
	
	
	@Test(groups = {"sanity","Regression"})
	public void test2() {
		System.out.println("Inside home loan test 2");
	}

	
}
