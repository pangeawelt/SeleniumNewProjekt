package tag01;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

class C01_Selenium {
    static  ChromeOptions options;
    static  WebDriver driver;
    public static void main(String[] args) throws IOException {


        String webadres ="https://amazon.com";// wenn du "" eingügenmöchtest \" \" fügt.
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        options= new ChromeOptions(); // blank browser
        options.addArguments("--remote-allow-origins=*");
        driver= new ChromeDriver(options);
        driver.get(webadres);





        /*
        -Verwenden Sie System.setProperty in Java, um die Eigenschaften von System zu setzen.
        -Mit dieser Methode geben wir unsere Klasse physicalort für die Bestimmung ein.
        -Key, Value Zuerst Name, dann wird unser Driverspath bestimmt.
            * */
        /*System.out.println(System.getProperty("chrome.driver"));
        *//*
        * Ich kann Value erreichen, indem ich den Key-Wert mit der getProperty-Methode eingebe. ""*//*
        WebDriver driver = new ChromeDriver();


        //1- Besucht https:www.amazon.com  .
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https:www.amazon.com");
        //2-Typ nutella in der Suchleiste eingeben..

        WebElement suchbox = driver.findElement(By.id("twotabsearchtextbox"));
        suchbox.sendKeys("nutella");

        //3-Nach der Nutella eingeben drücken Sie Enter und suchen
        suchbox.submit();

        //4-die gefundenen Ergebnisse aufschreiben
        WebElement ergebnisaufsatz= driver.findElement
                (By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        System.out.println("Ergebnissaufsatz; " + ergebnisaufsatz.getText());
*/


    }

    /**/
}
