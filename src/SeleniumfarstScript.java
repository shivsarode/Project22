import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumfarstScript {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String ParentId = driver.getWindowHandle();
		System.out.println(ParentId);
		
		Set<String> ParentChild =driver.getWindowHandles();
		System.out.println(ParentChild);
		
		

	}

}
