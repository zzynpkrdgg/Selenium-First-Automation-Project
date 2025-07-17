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


//* Project Name : DEMOQA-Practice-Form-Automation-Demo
//* Developer    : Zeynep Karadağ
//* Version      : 1.0.0
//* Date         :9/07/2025
//* Time         : 4.00 PM
//* Description  :

import static org.assertj.core.api.Assertions.assertThat;

public class PracticeForm {

    public WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;
    public PracticeForm() {
        this.driver = Driver.webDriver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
    }


    @Step("url adresine <text> git")
    public void navigateToUrl(String text) {
        driver.get(text);
        Gauge.writeMessage("Navigated to URL: " + text);
    }
    @Step("First Name alanına <text> yaz")
    public void enterFirstName(String text) {
        WebElement firstNameField = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("FIRST_NAME_FIELD")).apply(driver));
        firstNameField.clear();
        firstNameField.sendKeys(text);
        Gauge.writeMessage("Entered First Name: " + text);
    }



    @Step("Last Name alanına <text> yaz")
    public void enterLastName(String text) {
        WebElement lastNameField = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("LAST_NAME_FIELD")).apply(driver));
        lastNameField.clear();
        lastNameField.sendKeys(text);
        Gauge.writeMessage("Entered Last Name: " + text);
    }

    @Step("Email alanına <text> yaz")
    public void enterEmail(String text) {
        WebElement emailField = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("EMAIL_FIELD")).apply(driver));
        emailField.clear();
        emailField.sendKeys(text);
        Gauge.writeMessage("Entered Email: " + text);
    }

    @Step("<gender> cinsiyet butonunu seç")
    public void selectGender(String gender) {
        WebElement genderRadio;
        switch (gender.toLowerCase()) {
            case "male":
                genderRadio = wait.until(ExpectedConditions.elementToBeClickable(Locators.get("GENDER_MALE_RADIO")));
                break;
            case "female":
                genderRadio = wait.until(ExpectedConditions.elementToBeClickable(Locators.get("GENDER_FEMALE_RADIO")));
                break;
            case "other":
                genderRadio = wait.until(ExpectedConditions.elementToBeClickable(Locators.get("GENDER_OTHER_RADIO")));
                break;
            default:
                throw new IllegalArgumentException("Geçersiz cinsiyet: " + gender);
        }
        js.executeScript("arguments[0].click();", genderRadio);
        Gauge.writeMessage("Selected gender: " + gender);
    }


    @Step("Mobile alanına <text> yaz")
    public void enterMobile(String text) {
        WebElement mobileField = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("MOBILE_FIELD")).apply(driver));
        mobileField.clear();
        mobileField.sendKeys(text);
        Gauge.writeMessage("Entered Mobile: " + text);
    }

    @Step("Date of Birth alanını <Data_dateOfBirth1> olarak seç")
    public void selectDateOfBirth(String dateOfBirth) {
        WebElement dateField = wait.until(ExpectedConditions.elementToBeClickable(Locators.get("DATE_OF_BIRTH_INPUT")));
        // date picker açmak için tıkla
        js.executeScript("arguments[0].click();", dateField);
        // Mevcut değeri temizle (CTRL+A + DELETE)
        dateField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        dateField.sendKeys(Keys.DELETE);
        // Yeni tarihi yaz
        dateField.sendKeys(dateOfBirth);
        // Enter tuşuna basarak date picker'ı kapat
        dateField.sendKeys(Keys.ENTER);
        Gauge.writeMessage("Selected Date of Birth: " + dateOfBirth);
    }

    @Step("Subjects alanına <text> yaz")
    public void enterSubjects(String text) {
        WebElement subjectsField = wait.until(ExpectedConditions.elementToBeClickable(Locators.get("SUBJECTS_INPUT")));
        subjectsField.sendKeys(text);
        subjectsField.sendKeys(Keys.ENTER); // Seçimi onaylamak için ENTER'a bas
        Gauge.writeMessage("Entered Subject: " + text);
    }


    @Step("<hobbies> hobby checkbox'ını seç")
    public void selectHobbies(String hobbies) {
        String[] hobbyList = hobbies.split(",");
        for (String hobby : hobbyList) {
            hobby = hobby.trim(); // Boşlukları temizle
            WebElement hobbyCheckbox;
            switch (hobby.toLowerCase()) {
                case "sports":
                    hobbyCheckbox = wait.until(ExpectedConditions.elementToBeClickable(Locators.get("HOBBY_SPORTS_CHECKBOX")));
                    break;
                case "reading":
                    hobbyCheckbox = wait.until(ExpectedConditions.elementToBeClickable(Locators.get("HOBBY_READING_CHECKBOX")));
                    break;
                case "music":
                    hobbyCheckbox = wait.until(ExpectedConditions.elementToBeClickable(Locators.get("HOBBY_MUSIC_CHECKBOX")));
                    break;
                default:
                    throw new IllegalArgumentException("Geçersiz hobi: " + hobby);
            }
            // Checkbox zaten seçiliyse tıklamayı atla
            if (!hobbyCheckbox.isSelected()) {
                js.executeScript("arguments[0].click();", hobbyCheckbox);
            }
            Gauge.writeMessage("Selected hobby: " + hobby);
        }
    }


    @Step("Current Address alanına <text> yaz")
    public void enterCurrentAddress(String text) {
        WebElement addressField = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("CURRENT_ADDRESS_FIELD")).apply(driver));
        addressField.clear();
        addressField.sendKeys(text);
        Gauge.writeMessage("Entered Current Address: " + text);
    }

    @Step("Submit butonuna tıkla")
    public void clickSubmitButton() {
        WebElement submitButton = wait.until(driver -> ExpectedConditions.elementToBeClickable(Locators.get("SUBMIT_BUTTON")).apply(driver));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", submitButton);
        Gauge.writeMessage("Clicked Submit button");
    }

    @Step("formun başarıyla gönderildiğini gör")
    public void verifyFormSubmission() {
        WebElement successMessage = wait.until(driver -> ExpectedConditions.visibilityOfElementLocated(Locators.get("SUBMISSION_SUCCESS_TITLE")).apply(driver));
        assertThat(successMessage.getText()).contains("Thanks for submitting the form");
        Gauge.writeMessage("Form submitted successfully");
    }
}
