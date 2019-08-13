
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("11abhaystark@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abhay");
		driver.findElement(By.xpath("//input [ @value = 'Log In']")).click();
		driver.findElement(By.linkText("Forgotten account?")).click();
		// driver.findElement(By.id("u_0_a")).click();

		/*
		 * driver.get("https://www.gmail.com//");
		 * driver.findElement(By.id("identifierId")).sendKeys("11abhaystark@gmail.com");
		 * //driver.findElement(By.linkText("Next")).click();
		 * driver.findElement(By.xpath("//span [ @class ='RveJvd snByac']")).click();
		 * Thread.sleep(10000);
		 * driver.findElement(By.xpath("//input [ @class = 'whsOnd zHQkBf']")).sendKeys(
		 * "abhay");
		 */
		String t = driver.getTitle();
		System.out.println(t);
		String u = driver.getCurrentUrl();
		System.out.println(u);
		// Thread.sleep(5000);
		driver.close();
	}
}
