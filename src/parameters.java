import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parameters {
	static WebDriver driver = new ChromeDriver();

	static String URL = ("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	
    static WebElement CustomerLogin =  driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button"));
    
    
    
    

}


	 


