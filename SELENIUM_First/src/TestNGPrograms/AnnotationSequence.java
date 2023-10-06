package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationSequence {
  @Test
  public void firsttest() {
	  System.out.println("first test");
  }
  
  @Test
  public void secondtest() {
	  System.out.println("second test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("The @BeforeMethod method in TestNG will execute before each test method.");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod method in TestNG will run after each test method is executed.");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("The @BeforeClass method in TestNG will run before the first method invokes of the current class.");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("The @AfterClass method in TestNG will execute after all the test methods of the current class execute.");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("The @BeforeTest method in TestNG runs before the execution of all the test methods that are inside that folder.");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("The @AfterTest method in TestNG executes after the execution of all the test methods that are inside that folder.");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("The @BeforeSuite method in TestNG runs before the execution of all other test methods.");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("The @AfterSuite method in TestNG runs after the execution of all other test methods.");
  }

}
