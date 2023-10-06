package TestNGPrograms;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameterTest {
  @Test
  @Parameters("message")
  public void optionalmess(@Optional("optinal parameter selected")String message) {
	  System.out.println(message);
  }
  
  
}
