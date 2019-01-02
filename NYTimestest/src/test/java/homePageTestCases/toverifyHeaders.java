package homePageTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.App.Pages.HomePage;
import com.Diaspark.app.basePackage;

public class toverifyHeaders extends basePackage {

	@Test(priority = 1)
	public void toVerifyHemberger() {
		HomePage h= new HomePage();
		h.toVerifyHembergericon(driver);
	}
	
	
	@Test(priority = 2)
	public void toverifysearch() throws InterruptedException {
		HomePage h = new HomePage();
		h.toVerifySearchicon(driver);
	}

	@Test(priority = 3)
	public void toVerifyNYTlogo() {

		HomePage h = new HomePage();
		h.toVerifyTimeLogo(driver);

	}

	@Test(priority = 4)
	public void toVerifySectionListItem() {

		HomePage h = new HomePage();
		h.toVerifySectionListItem(driver);

	}

	@Test(priority = 5)
	public void toVerifylogin() {
		HomePage h = new HomePage();
		h.toVerifyLogin(driver);

	}

}
