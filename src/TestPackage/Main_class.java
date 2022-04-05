//Create the project

package TestPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main_class {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrés Diaz\\eclipse-workspace\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		try {
			
			driver.get("http://wikipedia.com.ar");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			String titulo = driver.getTitle();
			
			System.out.println(titulo);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
	}	
		
	}
}
