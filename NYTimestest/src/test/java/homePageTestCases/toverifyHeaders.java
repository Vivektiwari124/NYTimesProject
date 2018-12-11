package homePageTestCases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.App.Pages.HomePage;
import com.Diaspark.app.basePackage;

public class toverifyHeaders extends basePackage {

	/*@Test
	public void toVerifyHeader() {
		homePage h= new homePage();
		h.toVerifyHeaderContent(driver);
		
	}*/
	
	@Test
	public void toVerifylogin()  {
		HomePage h= new HomePage();
		h.toVerifyLogin(driver);
		
	}
	
	
	
	
	
	
}
