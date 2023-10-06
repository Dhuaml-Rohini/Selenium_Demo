package TestNprogramsPRACTICE;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsTEST {
  @Test
  public void Test() {
	  System.out.println("@Test:this is normal test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod:this will execute before Testmethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod: This will execute after  testmethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass: this will execute before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass:this will execute after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" @BeforeTest:this will execute before the every testmethod");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest:this will execute after every testmethod");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite:this will execute before the suit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" @AfterSuite:this will execute after the suite");
  }

}
