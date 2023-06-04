package tag01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.WeakHashMap;

public class C03_NavigatesMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("edgeDriver", "src/main/resources/drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //-Amazon.com besucht
        driver.get("https://amazon.com");
        Thread.sleep(3000);//für Javacode zu warten
        //-nach https://www.arbeitsagentur.de/ geht
        driver.navigate().to("https://www.arbeitsagentur.de/");//wie get() Method
        Thread.sleep(3000);//für Javacode zu warten

        // https://www.arbeitsagentur.de/ seitetitle schreibt
        System.out.println("Titel : "+ driver.getTitle());
        Thread.sleep(3000);//für Javacode zu warten


        // zurück amazon.com
        driver.navigate().back();//geht erste Webseite
        Thread.sleep(3000);//für Javacode zu warten
        driver.navigate().forward();
        Thread.sleep(3000);//für Javacode zu warten
        //amazonstitel schreibt
        System.out.println("Titel : "+ driver.getTitle());
        //nochmal agentur geht
        Thread.sleep(3000);//für Javacode zu warten

        //am Ende Webseite frischen und closed
        driver.navigate().refresh();
        driver.close();









    }

}
