import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02LocatorsPractice {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://the-internet.herokuapp.com/login");
       // driver.get("https://the-internet.herokuapp.com/");
        //driver.findElement(By.id("username")).sendKeys("Aayushi");
        //driver.findElement(By.id("password")).sendKeys("enterMyPass");
        //driver.findElement(By.className("radius")).click();
        // Locate link using linkText
        //driver.findElement(By.linkText("Form Authentication")).click();
        //Link text ka matching portion
        //driver.findElement(By.partialLinkText("Form")).click();

        //Locate heading using tagname
        //String heading = driver.findElement(By.tagName("h2")).getText();
        //System.out.println("Heading name :" + heading);

        // Tag + ID
       // driver.findElement(By.cssSelector("input#username"))
             //   .sendKeys("tomsmith");

        // Multiple attributes
        //driver.findElement(By.cssSelector("input[type='password'][name='password']"))
               // .sendKeys("SuperSecretPassword!");

        // Tag + class
        //driver.findElement(By.cssSelector("button.radius")).click();

        //driver.findElement(By.xpath("//input[@id='username']"));
        // Locate Form Authentication link using XPath contains text
        driver.findElement(By.xpath("//a[contains(text(),'Form')]")).click();
        System.out.println("Login page opened: " + driver.getCurrentUrl());
        // Exact text
        By.xpath("//button[text()='Login']");

// Partial text
        By.xpath("//a[contains(text(),'Form')]");

// Partial attribute
        By.xpath("//button[contains(@class,'radius')]");

// Attribute starting with a value
        By.xpath("//input[starts-with(@id,'user')]");
        driver.quit();
    }
}
