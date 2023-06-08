package tag03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) throws InterruptedException {

        /*
        * geht amazon.com
        * sucht city bike
        * select 20 inch
        * close driver
        * */
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //
        driver.get("https://www.amazon.com");
        ////        Suche nach "city bike"
        WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("city bike"+ Keys.ENTER);

        //select 20 inch
        WebElement we1= driver.findElement(By.xpath("//span[.='Unter 200 USD']"));
        we1.click();
        //
        Thread.sleep(3000);
        driver.quit();


    }
}
