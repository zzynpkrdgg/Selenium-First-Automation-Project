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

/**
 * Project Name : DEMOQA-Practice-Form-Automation-Demo
 * Developer    : Zeynep Karadağ
 * Version      : 1.0.0
 * Date         :9/07/2025
 * Time         : 4.00 PM
 * Description  :
 **/
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeForm {

    public WebDriver driver;
    public WebDriverWait wait;

    public PracticeForm() {
        this.driver = Driver.driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
// Add this to your PracticeForm.java or a more general Step Implementation class

    @Step("Kullanıcı <url> adresine gider.")
    public void navigateToUrl(String url) {
        driver.get(url);
        Gauge.writeMessage("Navigated to URL: " + url);
    }
    @Step("Kullanıcı First Name alanına <firstName> yazar.")
    public void enterFirstName(String firstName) {
        WebElement firstNameField = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("FIRST_NAME_FIELD")).apply(driver));
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
        Gauge.writeMessage("Entered First Name: " + firstName);
    }

    @Step("Kullanıcı Last Name alanına <lastName> yazar.")
    public void enterLastName(String lastName) {
        WebElement lastNameField = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("LAST_NAME_FIELD")).apply(driver));
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
        Gauge.writeMessage("Entered Last Name: " + lastName);
    }

    @Step("Kullanıcı Email alanına <email> yazar.")
    public void enterEmail(String email) {
        WebElement emailField = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("EMAIL_FIELD")).apply(driver));
        emailField.clear();
        emailField.sendKeys(email);
        Gauge.writeMessage("Entered Email: " + email);
    }

    @Step("Kullanıcı Male gender butonunu seçer.")
    public void selectMaleGender() {
        WebElement maleRadio = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("GENDER_MALE_RADIO")).apply(driver));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", maleRadio);
        Gauge.writeMessage("Selected Male gender");
    }

    @Step("Kullanıcı Mobile alanına <mobile> yazar.")
    public void enterMobile(String mobile) {
        WebElement mobileField = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("MOBILE_FIELD")).apply(driver));
        mobileField.clear();
        mobileField.sendKeys(mobile);
        Gauge.writeMessage("Entered Mobile: " + mobile);
    }

    @Step("Kullanıcı Date of Birth alanını <dateOfBirth> olarak seçer.")
    public void selectDateOfBirth(String dateOfBirth) {
        WebElement dateField = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("DATE_OF_BIRTH_INPUT")).apply(driver));
        dateField.click();
        dateField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        dateField.sendKeys(Keys.DELETE);
        dateField.sendKeys(dateOfBirth);
        dateField.sendKeys(Keys.ENTER);
        Gauge.writeMessage("Selected Date of Birth: " + dateOfBirth);
    }

    @Step("Kullanıcı Subjects alanına <subject> yazar.")
    public void enterSubjects(String subject) {
        WebElement subjectsField = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("SUBJECTS_INPUT")).apply(driver));
        subjectsField.sendKeys(subject);
        subjectsField.sendKeys(Keys.ENTER);
        Gauge.writeMessage("Entered Subject: " + subject);
    }

    @Step("Kullanıcı Sports hobby checkbox'ını seçer.")
    public void selectSportsHobby() {
        WebElement sportsCheckbox = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("HOBBY_SPORTS_CHECKBOX")).apply(driver));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", sportsCheckbox);
        Gauge.writeMessage("Selected Sports hobby");
    }

    @Step("Kullanıcı Current Address alanına <address> yazar.")
    public void enterCurrentAddress(String address) {
        WebElement addressField = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("CURRENT_ADDRESS_FIELD")).apply(driver));
        addressField.clear();
        addressField.sendKeys(address);
        Gauge.writeMessage("Entered Current Address: " + address);
    }

    @Step("Kullanıcı Submit butonuna tıklar.")
    public void clickSubmitButton() {
        WebElement submitButton = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("SUBMIT_BUTTON")).apply(driver));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", submitButton);
        Gauge.writeMessage("Clicked Submit button");
    }

    @Step("Kullanıcı formun başarıyla gönderildiğini görür.")
    public void verifyFormSubmission() {
        WebElement successMessage = wait.until(driver -> ExpectedConditions.visibilityOfElementLocated(Locators.get("SUBMISSION_SUCCESS_TITLE")).apply(driver));
        assertThat(successMessage.getText()).contains("Thanks for submitting the form");
        Gauge.writeMessage("Form submitted successfully");
    }
}
