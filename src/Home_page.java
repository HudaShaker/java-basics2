import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

  public class Home_page extends parameters { 
  public static void main(String[] args)    {
	  
	  WebDriver driver = new ChromeDriver();

	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

	  driver.get(URL);
	  
	  CustomerLogin.click();
		 
		
			}
			
	  }             
    

		

		
		
	
       
	
	



