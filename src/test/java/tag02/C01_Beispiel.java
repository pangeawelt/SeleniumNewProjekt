package tag02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

class C01_Beispiel {

    /*

     Öffnen Sie den Browser und maximieren Sie ihn
      Legen Sie 15 Sekunden als maximale Verweildauer für die gesamte Seite fest.
      Rufen Sie die Seiten von Amazon, Facebook und Youtube auf.
      Zurück zur Amazon-Seite
      Die Adresse (URL) der Amazon-Seite https://www.amazon.com/
       Test auf Gleichheit
      Drucken Sie die Position und Größe der Seite
      Passen Sie die Position und Größe der Seite wie gewünscht an
      Testen Sie, ob es so ist, wie Sie es wollen
      Schließen Sie die Seite
       */
    static ChromeOptions options;
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
    WebDriver driver= new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));



        //maximize
        driver.manage().window().maximize();

        //Softway hardway mit Thread.sleep();nach der 15 Sekunden kommt Exception
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //
        driver.navigate().to("https://www.amazon.com");//ctrl + D
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
        driver.navigate().to("https://www.youtube.com");
        driver.navigate().to("https://www.gmx.de");
        Thread.sleep(3000);

        //geht youtube
        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);


        //actualUrl und expectedUrl vergleichen
        //

       String aktuelUrl=driver.getCurrentUrl();
       String expectedUrl="https://www.amazon.com";
        if(aktuelUrl.equals(expectedUrl)){
            System.out.println("Url Test Passed");
        }else{
            System.out.println("Url Test Failed");
        }

        /*Runnable urlTest = () -> {
            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "https://www.amazon.com";

            // Use ternary operator to check if the Url Test has passed or failed
            String result = actualUrl.equals(expectedUrl) ? "Url Test Passed" : "Url Test Failed";
            System.out.println(result);
        };

        urlTest.run();*/
        //
        System.out.println("Standort der Seite; " + driver.manage().window().getPosition());
        System.out.println("Seitengröße; " + driver.manage().window().getSize());

        //neu Postion und Size
       driver.manage().window().setPosition(new Point(60,60));
       driver.manage().window().setSize(new Dimension(600,600));

       //
      Point  actualPosition=driver.manage().window().getPosition();
      if((actualPosition.x==50 )&&(actualPosition.y==50)){
          System.out.println("Test PASSED für OrtvonSeite");
      }
      else{
          System.out.println("TEST FAILED");
      }
        Dimension actuaDimension=driver.manage().window().getSize();
      if (actuaDimension.getWidth()==600 && actuaDimension.getHeight()==500){
          System.out.println("Dimension PASSED");

        }
      else {
          System.out.println("Dimension FAILED");
      }
// Die aktuelle TAB wird geschlossen
        driver.close();

// Alle offenen Tabs und Fenster schließen, WebDriver beenden
        driver.quit();


        driver.quit();

    }
}