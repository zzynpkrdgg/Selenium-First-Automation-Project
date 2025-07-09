package stepimpl;

import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import driver.Driver;
import locator.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.time.Duration;


import static org.assertj.core.api.Assertions.assertThat;

public class PracticeForm {


    public WebDriver driver;
    public WebDriverWait wait;

    /**
     * StepImplementation için yapıcı metot.
     * WebDriver ve WebDriverWait örneklerini Driver sınıfındaki statik sürücüyü kullanarak başlatır.
     */
    public PracticeForm() {
        this.driver = Driver.driver; // Driver sınıfındaki WebDriver örneğini al
        this.wait = new WebDriverWait(Driver.driver, Duration.ofSeconds(10)); // 10 saniye zaman aşımı ile WebDriverWait'ı başlat
    }

    /**
     * Tarayıcıyı belirtilen URL'ye yönlendirir.
     * @param url Yönlendirilecek URL.
     */
   /** @Step("Kullanıcı <url> adresine gider.")
    public void navigateToUrl(String url) {
        driver.get(url);
        Gauge.writeMessage("Navigated to: " + url);
    }**/

    /**
     * "First Name" alanına ilk adı girer.
     * @param firstName Girilecek ilk ad.
     */
    @Step("Kullanıcı \"First Name\" alanına <firstName> yazar.")
    public void enterFirstName(String firstName) {
        // Element tıklanabilir olana kadar bekle ve sonra etkileşime geç
        WebElement firstNameField = wait.until(ExpectedConditions.elementToBeClickable(Locators.FIRST_NAME_FIELD));
        firstNameField.clear(); // Mevcut metni temizle
        firstNameField.sendKeys(firstName); // Sağlanan ilk adı gir
        Gauge.writeMessage("Entered First Name: " + firstName);
    }

    /**
     * "Last Name" alanına soyadı girer.
     * @param lastName Girilecek soyad.
     */
    @Step("Kullanıcı \"Last Name\" alanına <lastName> yazar.")
    public void enterLastName(String lastName) {
        WebElement lastNameField = wait.until(ExpectedConditions.elementToBeClickable(Locators.LAST_NAME_FIELD));
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
        Gauge.writeMessage("Entered Last Name: " + lastName);
    }

    /**
     * "Email" alanına e-posta adresini girer.
     * @param email Girilecek e-posta adresi.
     */
    @Step("Kullanıcı \"Email\" alanına <email> yazar.")
    public void enterEmail(String email) {
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(Locators.EMAIL_FIELD));
        emailField.clear();
        emailField.sendKeys(email);
        Gauge.writeMessage("Entered Email: " + email);
    }

    /**
     * "Male" cinsiyet radyo butonunu seçer.
     * Doğrudan tıklama başarısız olursa JavaScriptExecutor kullanır.
     */
    @Step("Kullanıcı \"Male\" gender butonunu seçer.")
    public void selectMaleGender() {
        WebElement maleRadio = wait.until(ExpectedConditions.elementToBeClickable(Locators.GENDER_MALE_RADIO));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", maleRadio); // JavaScript kullanarak tıkla
        Gauge.writeMessage("Selected Male gender");
    }

    /**
     * "Mobile" alanına telefon numarasını girer.
     * @param mobile Girilecek telefon numarası.
     */
    @Step("Kullanıcı \"Mobile\" alanına <mobile> yazar.")
    public void enterMobile(String mobile) {
        WebElement mobileField = wait.until(ExpectedConditions.elementToBeClickable(Locators.MOBILE_FIELD));
        mobileField.clear();
        mobileField.sendKeys(mobile);
        Gauge.writeMessage("Entered Mobile: " + mobile);
    }

    /**
     * "Date of Birth" alanında doğum tarihini seçer.
     * Mevcut tarihi temizler ve yeni tarihi yazar, ardından ENTER tuşuna basar.
     * @param dateOfBirth "GG Ay YYYY" formatında doğum tarihi (örn: "01 Oca 2000").
     */
    @Step("Kullanıcı \"Date of Birth\" alanını <dateOfBirth> olarak seçer.")
    public void selectDateOfBirth(String dateOfBirth) {
        WebElement dateField = wait.until(ExpectedConditions.elementToBeClickable(Locators.DATE_OF_BIRTH_INPUT));
        dateField.click(); // Tarih seçiciyi açmak için tıkla
        // Ctrl+A (tümünü seç) ve DELETE kullanarak mevcut tarihi temizle
        dateField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        dateField.sendKeys(Keys.DELETE);
        dateField.sendKeys(dateOfBirth); // Yeni tarihi yaz
        dateField.sendKeys(Keys.ENTER); // Tarihi onaylamak için Enter tuşuna bas
        Gauge.writeMessage("Selected Date of Birth: " + dateOfBirth);
    }

    /**
     * "Subjects" otomatik tamamlama alanına bir konu girer.
     * Konuyu yazar ve ardından ENTER tuşuna basarak seçer.
     * @param subject Girilecek konu (örn: "Matematik", "Fizik").
     */
    @Step("Kullanıcı \"Subjects\" alanına <subject> yazar.")
    public void enterSubjects(String subject) {
        WebElement subjectsField = wait.until(ExpectedConditions.elementToBeClickable(Locators.SUBJECTS_INPUT));
        subjectsField.sendKeys(subject);
        subjectsField.sendKeys(Keys.ENTER); // Önerilen konuyu seçmek için Enter tuşuna bas
        Gauge.writeMessage("Entered Subject: " + subject);
    }

    /**
     * "Sports" hobi onay kutusunu seçer.
     * JavaScriptExecutor kullanarak elemente tıklar.
     */
    @Step("Kullanıcı \"Sports\" hobby checkbox'ını seçer.")
    public void selectSportsHobby() {
        WebElement sportsCheckbox = wait.until(ExpectedConditions.elementToBeClickable(Locators.HOBBY_SPORTS_CHECKBOX));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", sportsCheckbox); // JavaScript kullanarak tıkla
        Gauge.writeMessage("Selected Sports hobby");
    }

    /**
     * "Current Address" alanına mevcut adresi girer.
     * @param address Girilecek adres.
     */
    @Step("Kullanıcı \"Current Address\" alanına <address> yazar.")
    public void enterCurrentAddress(String address) {
        WebElement addressField = wait.until(ExpectedConditions.elementToBeClickable(Locators.CURRENT_ADDRESS_FIELD));
        addressField.clear();
        addressField.sendKeys(address);
        Gauge.writeMessage("Entered Current Address: " + address);
    }

    /**
     * "Submit" butonuna tıklar.
     * JavaScriptExecutor kullanarak elemente tıklar.
     */
    @Step("Kullanıcı \"Submit\" butonuna tıklar.")
    public void clickSubmitButton() {
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(Locators.SUBMIT_BUTTON));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", submitButton); // JavaScript kullanarak tıkla
        Gauge.writeMessage("Clicked Submit button");
    }

    /**
     * Formun başarıyla gönderildiğini, başarı mesajı başlığını kontrol ederek doğrular.
     */
    @Step("Kullanıcı formun başarıyla gönderildiğini görür.")
    public void verifyFormSubmission() {
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SUBMISSION_SUCCESS_TITLE));
        assertThat(successMessage.getText()).contains("Thanks for submitting the form");
        Gauge.writeMessage("Form submitted successfully");
    }
}
