//Create the project

package TestPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main_class {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andrés Diaz\\eclipse-workspace\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		try {
			
			driver.get("http://wikipedia.com.ar");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			//By.id ----- //driver.findElement(By.id("n-randompage")).click();
			//By.linkText ------ //driver.findElement(By.linkText("Página aleatoria")).click();
			//By.tagName ----- //driver.findElement(By.tagName("title"));
			WebElement leerButton = driver.findElement(By.xpath("//*[@id=\"main-tfa\"]//*[text() = \" Todos los artículos destacados \" ]"));
			
			leerButton.click();
			
			Thread.sleep(2000);
			
			System.out.println(driver.getTitle());
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
	}	
		
	}
}
