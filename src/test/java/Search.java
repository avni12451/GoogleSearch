import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Search {


    public static void main(String args[]) {


        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.google.com");

       WebElement searchTextBox =  driver.findElement(By.name("q"));

       searchTextBox.sendKeys("LexisNexis");

       searchTextBox.sendKeys(Keys.ENTER);

        List<WebElement> links = driver.findElements(By.xpath("//div[@class='g']//div[@class='zTpPx' or @class='r'][1]//a[contains(@ping,'/url?')]"));

        links.get(2).click();

        System.out.println("Page Title = "+driver.getTitle());

        driver.close();



    }



}
