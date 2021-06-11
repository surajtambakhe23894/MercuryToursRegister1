import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoGuru99TestNG {
	WebDriver driver;
	@BeforeSuite
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Suraj Testing doccuments2\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Open browser--------------");
	}

	@BeforeTest
	public void beforeTest() {
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		System.out.println("Open url------------");
	}

	@BeforeClass
	public void beforeClass() {
		driver.manage().window().maximize();
		System.out.println("Maximize window-----------");
	}

	@BeforeMethod
	public void beforeMethod() {
		//		Set<Cookie> ck=driver.manage().getCookies();
		//		System.out.println("Number of cookies:--- "+ck.size());
		//
		//		for(Cookie c:ck) {
		//			System.out.println("----------------------------------------------");
		//			String sn=c.getName();
		//			System.out.println("name:- "+sn);
		//
		//			String sv=c.getValue();
		//			System.out.println("value:----     "+sv);
		//
		//			Object cl=c.getClass();
		//			System.out.println("Class:----     "+cl);
		//
		//			Date dt=c.getExpiry();
		//			System.out.println("Date:-----     "+dt);
		//
		//			boolean ih=c.isHttpOnly();
		//			System.out.println("IsHttpOnly:--- "+ih);
		//
		//			boolean sc=c.isSecure();
		//			System.out.println("is secure:---- "+sc);
		//			System.out.println("------------------------------------------------");
		//		}
		System.out.println("Get cookies----------");
	}

	@Test
	public void f() throws InterruptedException {
		driver.findElement(By.cssSelector("input[name=\"firstName\"]")).sendKeys("suraj");

		driver.findElement(By.cssSelector("input[name=\"lastName\"]")).sendKeys("suratttt");

		driver.findElement(By.cssSelector("input[name=\"phone\"]")).sendKeys("9876543210");

		driver.findElement(By.cssSelector("input[name=\"userName\"]")).sendKeys("aattam123@gmail.com");

		driver.findElement(By.cssSelector("input[name=\"address1\"]")).sendKeys("akurdi, pcmc");

		driver.findElement(By.cssSelector("input[name=\"city\"]")).sendKeys("PUNE");

		driver.findElement(By.cssSelector("input[name=\"state\"]")).sendKeys("MAHARASTRA");

		driver.findElement(By.cssSelector("input[name=\"postalCode\"]")).sendKeys("445102");

		WebElement cn=driver.findElement(By.cssSelector("select[name=\"country\"]"));
		Select s=new Select(cn);
		s.selectByVisibleText("INDIA");

		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("aattam123@gmail.com");

		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("sura@1234");

		driver.findElement(By.cssSelector("input[name=\"confirmPassword\"]")).sendKeys("sura@1234");


		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name=\"submit\"]")).click();
		System.out.println("Register success---------");

	}


	@AfterMethod
	public void afterMethod() throws IOException, InterruptedException {
		//		Thread.sleep(1000);
		//		File css1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//
		//		FileUtils.copyFile(css1, new File("C:\\Users\\user\\Desktop\\Testing\\Selenium Screenshots\\demoG12.jpg"));
		System.out.println("Capture screenshot----------------");
	}



	@AfterClass
	public void afterClass() {
		//		driver.manage().deleteCookieNamed("_gat_gtag_UA_1248015_24");
		//		Set<Cookie> ck1=driver.manage().getCookies();
		//		System.out.println("Number of Cookies after delete:-  "+ck1.size());
		System.out.println("Delete cookies-----------");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Data base Closed succesfully-----------------------------");

	}

	@AfterSuite
	public void afterSuite() throws InterruptedException {
		System.out.println("Driver closed-----------");
		Thread.sleep(4000);
		driver.close();
	}

}
