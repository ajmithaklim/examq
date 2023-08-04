package Meeshopage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Meeshopage {
	WebDriver driver;
	//object repository
	By Msearch = By.xpath("//*[@id=\'__next\']/div[2]/div[1]/div/div[2]/div[1]/input");
	By Mmen = By.xpath("//*[@id=\'__next\']/div[2]/div[3]/div/div[5]");
	By Mjewellery = By.xpath("//*[@id=\'__next\']/div[2]/div[3]/div/div[6]/div/div[3]/a[5]/p");
	By Mmeeshotitle = By.xpath("//*[@id=\'__next\']/div[2]/div[1]/div/div[1]/a/svg/g/path[1]");
	By Mhaircolor = By.xpath("//*[@id=\'__next\']/div[3]/div[1]/div/div/div[3]/div[1]/div/div[2]/div[3]/div[1]/div[1]");


	public Meeshopage(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	//action methods 
	public void setValue(String value)
	{
		driver.findElement(Msearch).sendKeys("saree");
	}
	public void men() {
		driver.findElement(Mmen).click();
		
	}
	public void jewellery() {
		driver.findElement(Mjewellery).click();

	}

	public void title() {
	driver.findElement(Mmeeshotitle).click();
	}
	}



