package testJ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestJava {


        @Test
        public  static  void main (String args []) throws  InterruptedException{
            System.setProperty("webdriver.chrome.driver","C:/Users/Gayane/Downloads/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://auto.am/");
            Thread.sleep(5000);
            System.out.println("The car count is" + driver.findElement(By.xpath("//*[@id=\"search-btn\"]")).getText());



        }


    }



