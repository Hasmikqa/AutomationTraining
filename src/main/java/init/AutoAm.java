package init;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AutoAm {
    public static void main(String[] args) throws InterruptedException {
//todo version problem show

        System.setProperty("webdriver.chrome.driver","C:/Users/Gayane/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://auto.am/");
        Thread.sleep(5000);
        System.out.println("The car count is" + driver.findElement(By.xpath("//*[@id=\"search-btn\"]")).getText());
        System.out.println("______");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"filter-make\"]"));
        Select model =new Select(element);
        model.selectByVisibleText("Mercedes-Benz");
        WebElement car= model.getFirstSelectedOption();
        System.out.println("Favorite car model is " + driver.findElement(By.xpath("/html/body/section[1]/div[2]/div[1]/div/div/div/div[6]/button")).getText());



        


    }
}
