package driver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.thoughtworks.gauge.Gauge;
/**
 * Project Name : DEMOQA-Practice-Form-Automation-Demo
 * Developer    : Zeynep Karadağ
 * Version      : 1.0.0
 * Date         :9/07/2025
 * Time         : 4.00 PM
 * Description  :
 **/
public class Driver {

    public static WebDriver driver;


    @BeforeSuite
    public void initializeDriver() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless"); // Başsız modda çalıştırmak için bu satırı yorumdan çıkarın
        options.addArguments("--disable-gpu"); // Başsız mod için önerilir
        options.addArguments("--window-size=1920,1080"); // Pencere boyutunu ayarla
        options.addArguments("--no-sandbox"); // İşletim sistemi güvenlik modelini atla (Docker gibi bazı ortamlar için gerekli)
        options.addArguments("--disable-dev-shm-usage"); // Sınırlı kaynak sorunlarını aşmak için


        driver = new ChromeDriver(options);
        driver.manage().window().maximize(); // Tarayıcı penceresini büyüt
    }


    @AfterSuite
    public void closeDriver() {
        if (driver != null) {
            driver.quit(); // Tarayıcıyı kapat
        }
    }
}
