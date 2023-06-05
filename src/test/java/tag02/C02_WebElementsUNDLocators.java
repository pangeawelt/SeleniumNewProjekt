package tag02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C02_WebElementsUNDLocators {


    public static void main(String[] args) {
/*
        //Button, Searchbox,Headres,Tables,html,body,form,label,iput,a,...

        // unique element, attribute

        für Webelement zu definieren gibt 8 Wegs;
        1-id
        2-name
        3-className
        4-tagName
        5-linkText
        6-partialLinkText
        7-xpath=> mehrere möglichkeit
        8-cssSelector
INSPECT ODER UNTERSUCHEN DANN UNIGUE ELEMENT WIRD GEFUNDEN
*/
        //findElement, By.id ,
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


      //  WebElement searchbox = driver.findElement(By.id(""));
    //findElements dreht null List andererseits findElement wirft Exception
    ///*
    //   Gehen Sie zur Amazon-Seite
        driver.get("https://www.amazon.com");
    //
    //   Suchen Sie das Suchfeld
WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));


    //   Suchen Sie im Suchfeld nach „iPhone“.
        searchbox.sendKeys("iphone"+ Keys.ENTER);
    //   Gibt die Anzahl der <input>- und <a>-Tags auf der Seite aus
        List<WebElement> inputList= driver.findElements(By.tagName("input"));
        System.out.println("Anzahl der Tags "+ inputList.size());

    //   Schließen Sie die Seite
        driver.close();




    }
}
