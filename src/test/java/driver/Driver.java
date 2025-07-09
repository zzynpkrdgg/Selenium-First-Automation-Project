package driver;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    // WebDriver örneği, testler boyunca erişilebilir
    public static WebDriver driver;

    /**
     * Bu metot test paketinden önce çalışır.
     * WebDriver'ı (bu durumda ChromeDriver) başlatır.
     * WebDriverManager, doğru sürücü yürütülebilir dosyasını otomatik olarak indirir ve kurar.
     */
    @BeforeSuite
    public void initializeDriver() {
        // WebDriverManager kullanarak ChromeDriver'ı kur
        WebDriverManager.chromedriver().setup();

        // Tarayıcı UI'ını görmek istemiyorsanız aşağıdaki "headless" seçeneğini yorum satırı yapın
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless"); // Başsız modda çalıştırmak için bu satırı yorumdan çıkarın
        options.addArguments("--disable-gpu"); // Başsız mod için önerilir
        options.addArguments("--window-size=1920,1080"); // Pencere boyutunu ayarla
        options.addArguments("--no-sandbox"); // İşletim sistemi güvenlik modelini atla (Docker gibi bazı ortamlar için gerekli)
        options.addArguments("--disable-dev-shm-usage"); // Sınırlı kaynak sorunlarını aşmak için

        // Yapılandırılmış seçeneklerle ChromeDriver'ı başlat
        driver = new ChromeDriver(options);
        driver.manage().window().maximize(); // Tarayıcı penceresini büyüt
    }

    /**
     * Bu metot test paketinden sonra çalışır.
     * WebDriver örneğini kapatır ve ilişkili tüm tarayıcı pencerelerini kapatır.
     */
    @AfterSuite
    public void closeDriver() {
        if (driver != null) {
            driver.quit(); // Tarayıcıyı kapat
        }
    }
}
