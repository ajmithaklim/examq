package MeeshoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Meeshopage.Meeshopage;

public class MeeshoTest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
	}
	@Test
	public void testing() {
		Meeshopage ob = new Meeshopage(driver);
		ob.setValue("saree");
		ob.men();
		ob.jewellery();
		ob. title() ;
	}

	@Test
	public void testing2()
	   {
	  String expected ="Meesho";
	   
	   String actual = driver.getTitle();
	  System.out.println("actual title"+ actual);

	  Assert.assertEquals(expected, actual);
	  System.out.println("hello");
	   }
	}

}
