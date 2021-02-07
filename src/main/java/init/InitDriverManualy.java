package init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class InitDriverManualy {
    public static void main(String[]args) throws InterruptedException {
        //todo version problem show
        System.setProperty("webdriver.chrome.driver","C:/Users/Gayane/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://staff.am/");
         Thread.sleep(5000);
         driver.findElement(By.className("hs_nav_link")).click();
         driver.findElement(By.name("JobsFilter[key_word]")).sendKeys("C#");
         driver.findElement(By.id("btn_search_keyword")).click();
         driver.findElement(By.className("btn btn-primary mrgr0 radius_changes")).click();
         driver.findElement((By.cssSelector()))
    }



}