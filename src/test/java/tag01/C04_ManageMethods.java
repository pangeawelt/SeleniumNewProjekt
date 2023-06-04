package tag01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04_ManageMethods {
    static ChromeOptions options;
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        String webadres ="https://amazon.com";// wenn du "" eingügenmöchtest \" \" fügt.
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        options= new ChromeOptions(); // blank browser
        options.addArguments("--remote-allow-origins=*");
        driver= new ChromeDriver(options);
        //MANAGE() METHOD manage().window()
        //Techproeducation besucht
        driver.get("https://www.techproeducation.com");
        Thread.sleep(2000);

        //Drucken Sie die Position und die Abmessungen der Seite.
        System.out.println("Position ; "+driver.manage().window().getPosition()
                );

        System.out.println("Abmessungen ; "+ driver.manage().window().getSize()
                );

        //FULLSCREEN
        driver.manage().window().fullscreen();



        Thread.sleep(2000);

        //maximize
        driver.manage().window().maximize();


        Thread.sleep(3000);
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window());;






        Thread.sleep(3000);
        driver.close();


        //driver.quit();
    }
}