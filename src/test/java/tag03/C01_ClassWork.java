package tag03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C01_ClassWork {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));




//
//        Gehen Sie auf https://www.amazon.com/.
        driver.get("https://www.amazon.com");
//        Suche nach "city bike"
        WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("city bike"+ Keys.ENTER);

//        Text des Suchergebnisses drucken
        //sg-col-inner fügt einen List ein
        List<WebElement> sucherergebnisse= driver.findElements(By.className("sg-col-inner"));
        System.out.println("Suchergebnisses"+ sucherergebnisse.get(0).getText());//erste Element wird bekommen.

//        Die Anzahl der Ergebnisse ausgeben
        ////mit Split wird in eine Liste geteilt.
       String anzahlergbenis= sucherergebnisse.get(0).getText().split("")[2];
        System.out.println("AnzahlderErgebnis : "+ anzahlergbenis);
//        Ergebnisnummer mit LAMBDA ausdrucken
        Arrays.stream(sucherergebnisse.get(0).getText().split("")).skip(2).limit(1).forEach(System.out::println);
//        Klicken Sie auf das Bild des ersten Ergebnisses.
       List<WebElement> Produktbilder=driver.findElements(By.className("s-image"));
        Produktbilder.get(0).click();

//        Schließen Sie die Seite
        // Die aktuelle TAB wird geschlossen
        driver.close();

// Alle offenen Tabs und Fenster schließen, WebDriver beenden
      //  driver.quit();

        // /7div/table/tbody/tr/td/a/ =mutlak
        // Absolute und Relative Xpath

    /* Absolute Xpath
    Relative Xpath

    tag name --atttribute- type
      //input[@dir='auto']
      // input[@autocomplete='off']
      // //input[@name='field-keywords']
      // //*[.='sehende VALUE']
        //img[@class='s-image']
     */

    }
}
