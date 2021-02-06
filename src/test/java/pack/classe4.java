package pack;


import org.testng.annotations.Test;

public class classe4 extends Base{

	
	
	@Test
	public void Test4() {
		// TODO Auto-generated method stub
		
		String actualTitle = driver.getTitle();
		System.out.println("ActualTitle is " + actualTitle);
		String url = driver.getCurrentUrl();
		System.out.println("ActualTitle is " + url);
		
	}
}
