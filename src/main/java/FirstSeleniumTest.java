import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        System.out.println("page title:"+driver.getTitle());
        System.out.println("page url:"+ driver.getCurrentUrl());
        driver.navigate().to("https://www.wikipedia.org");
        System.out.println("page title:"+driver.getTitle());
        // Go back
        driver.navigate().back();

        // Go forward
        driver.navigate().forward();

        // Refresh
        driver.navigate().refresh();
        driver.quit();
    }
}
