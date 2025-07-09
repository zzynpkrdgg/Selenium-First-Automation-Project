package locator;

import org.openqa.selenium.By;

/**
 * Bu sınıf, otomasyon testlerinde kullanılan tüm WebDriver lokasyonlarını merkezileştirir.
 * Lokasyonlar için ayrı bir sınıf kullanmak, bakımı ve okunabilirliği artırır.
 */
public class Locators {

    // Metin Giriş Alanları
    public static final By FIRST_NAME_FIELD = By.id("firstName");
    public static final By LAST_NAME_FIELD = By.id("lastName");
    public static final By EMAIL_FIELD = By.id("userEmail");
    public static final By MOBILE_FIELD = By.id("userNumber");
    public static final By SUBJECTS_INPUT = By.id("subjectsInput");
    public static final By CURRENT_ADDRESS_FIELD = By.id("currentAddress");

    // Radyo Butonları
    public static final By GENDER_MALE_RADIO = By.xpath("//input[@name='gender' and @value='Male']");
    public static final By GENDER_FEMALE_RADIO = By.xpath("//input[@name='gender' and @value='Female']");
    public static final By GENDER_OTHER_RADIO = By.xpath("//input[@name='gender' and @value='Other']");

    // Tarih Seçici
    public static final By DATE_OF_BIRTH_INPUT = By.id("dateOfBirthInput");

    // Onay Kutuları (Hobiler)
    public static final By HOBBY_SPORTS_CHECKBOX = By.xpath("//label[contains(text(),'Sports')]");
    public static final By HOBBY_READING_CHECKBOX = By.xpath("//label[contains(text(),'Reading')]");
    public static final By HOBBY_MUSIC_CHECKBOX = By.xpath("//label[contains(text(),'Music')]");

    // Butonlar
    public static final By SUBMIT_BUTTON = By.id("submit");

    // Modallar/Başarı Mesajları
    public static final By SUBMISSION_SUCCESS_TITLE = By.id("example-modal-sizes-title-lg");
    public static final By SUBMISSION_TABLE_ROWS = By.xpath("//div[@class='table-responsive']//td[2]");
}
