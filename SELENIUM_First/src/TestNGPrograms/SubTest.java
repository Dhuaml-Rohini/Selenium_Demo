package TestNGPrograms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubTest {
  @Test
  @Parameters({"val2","val2"})
  public void Addition(int v1,int v2) {
	  int sum=v1+v2;
	  System.out.println(sum);
  }
  @Test
  public void Substraction(int v1,int v2) {
	  int diff=v1-v2;
	  System.out.println(diff);
  }
  
}
