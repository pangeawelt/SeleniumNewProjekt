package tag01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02_DriversMethod {
    static  ChromeOptions options;
    static WebDriver driver;
    public static void main(String[] args) {

    String webadres ="https://amazon.com";// wenn du "" eingügenmöchtest \" \" fügt.
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
    options= new ChromeOptions(); // blank browser
        options.addArguments("--remote-allow-origins=*");
    driver= new ChromeDriver(options);
        driver.get(webadres);
        System.out.println("Seitetitel : "+ driver.getTitle());
        System.out.println("WebseiteUR : "+ driver.getCurrentUrl());
    //Wir kriegen WinwodHandlesnummer
        System.out.println("Windowshandle : "+driver.getWindowHandle());//tabsnummer
        driver.navigate().to("https://www.arbeitsagentur.de/");

        System.out.println("CurrentUrl : "+driver.getCurrentUrl());
    // System.out.println("WebseiteSourcecode"+driver.getPageSource());
}}
