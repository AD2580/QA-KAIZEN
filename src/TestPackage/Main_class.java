//Create the project

package TestPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main_class {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrés Diaz\\eclipse-workspace\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		try {
			
			driver.get("http://wikipedia.com.ar");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			//driver.findElement(By.id("n-randompage")).click();
			//driver.findElement(By.linkText("Página aleatoria")).click();
			driver.findElement(By.tagName("title"));
			
			
			Thread.sleep(2000);
			
			String titulo = driver.getTitle();
			
			System.out.println(titulo);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
	}	
		
	}
}
