package init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class InitDriverManualy {
    public static void main(String[]args){
        //todo version problem show
        System.setProperty("webdriver.chrome.driver","C:/Users/Gayane/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");


        driver.findElement(By.id("menu")).click();
    }



}