package org.example;

import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation {

    private WebDriver driver;
    private WebDriverWait wait;

    public StepImplementation() {
        this.driver = Driver.driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Step("Kullanıcı \"First Name\" alanına <firstName> yazar.")
    public void enterFirstName(String firstName) {
        WebElement firstNameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("firstName")));
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    @Step("Kullanıcı \"Last Name\" alanına <lastName> yazar.")
    public void enterLastName(String lastName) {
        WebElement lastNameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("lastName")));
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    @Step("Kullanıcı \"Email\" alanına <email> yazar.")
    public void enterEmail(String email) {
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("userEmail")));
        emailField.clear();
        emailField.sendKeys(email);
    }

    @Step("Kullanıcı \"Male\" gender butonunu seçer.")
    public void selectMaleGender() {
        WebElement maleRadio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Male']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", maleRadio);
    }

    @Step("Kullanıcı \"Mobile\" alanına <mobile> yazar.")
    public void enterMobile(String mobile) {
        WebElement mobileField = wait.until(ExpectedConditions.elementToBeClickable(By.id("userNumber")));
        mobileField.clear();
        mobileField.sendKeys(mobile);
    }

    @Step("Kullanıcı \"Date of Birth\" alanını <dateOfBirth> olarak seçer.")
    public void selectDateOfBirth(String dateOfBirth) {
        WebElement dateField = wait.until(ExpectedConditions.elementToBeClickable(By.id("dateOfBirthInput")));
        dateField.click();
        dateField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        dateField.sendKeys(Keys.DELETE);
        dateField.sendKeys(dateOfBirth);
        dateField.sendKeys(Keys.ENTER);
    }

    @Step("Kullanıcı \"Subjects\" alanına <subject> yazar.")
    public void enterSubjects(String subject) {
        WebElement subjectsField = wait.until(ExpectedConditions.elementToBeClickable(By.id("subjectsInput")));
        subjectsField.sendKeys(subject);
        subjectsField.sendKeys(Keys.ENTER);
    }

    @Step("Kullanıcı \"Sports\" hobby checkbox'ını seçer.")
    public void selectSportsHobby() {
        WebElement sportsCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Sports')]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", sportsCheckbox);
    }

    @Step("Kullanıcı \"Current Address\" alanına <address> yazar.")
    public void enterCurrentAddress(String address) {
        WebElement addressField = wait.until(ExpectedConditions.elementToBeClickable(By.id("currentAddress")));
        addressField.clear();
        addressField.sendKeys(address);
    }

    @Step("Kullanıcı \"Submit\" butonuna tıklar.")
    public void clickSubmitButton() {
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton);
    }

    @Step("Kullanıcı formun başarıyla gönderildiğini görür.")
    public void verifyFormSubmission() {
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("example-modal-sizes-title-lg")));
        assertThat(successMessage.getText()).contains("Thanks for submitting the form");
    }
}
