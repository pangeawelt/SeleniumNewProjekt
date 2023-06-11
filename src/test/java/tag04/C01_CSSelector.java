package tag04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_CSSelector {
    public static void main(String[] args) {

/*
//NOTE: mit CSSSELECTOR darfs du nicht mit Index nehmen
//NOTE:
##CSSSELECTOR
1.
By.cssSelector("button[onclick='addElement()']
2.
input[name='session[password]']
3. statt id kannst du " # " zeichnen benutzen
input#session_password
4. statt classValue kannst du " . " benutzen
.form-control*/
        //   input[id='twotabsearchtextbox']
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //   Gehen Sie auf https://www.amazon.com/.
        driver.get("https://www.amazon.com");
        //    Suche nach "city bike"
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("city bike" + Keys.ENTER);


        //  By.cssSelector("button[onclick='addElement()']

        WebElement erstebild = driver.findElement(By.xpath("//*[text()='Mountainbikes']"));
        System.out.println("erstebild.isDisplayed() = " + erstebild.isDisplayed());
        System.out.println("erstebild.isSelected() = " + erstebild.isSelected());
        System.out.println("erstebild.isEnabled() = " + erstebild.isEnabled());
        erstebild.click();

        //searchbox.isSelected(); //checkbox    Ist es wählbar?
        //searchbox.isDisplayed();//bild        Ist es sichtbar?
        //searchbox.isEnabled();// funktional   ist es zugänglich?


        driver.quit();
    }
}