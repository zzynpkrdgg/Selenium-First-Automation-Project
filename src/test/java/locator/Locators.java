package locator;

import org.openqa.selenium.By;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


public class Locators {
    private static final String LOCATORS_FILE = "/locator/locators.json";
    private static Map<String, By> locatorMap = new HashMap<>();

    static {
        try (InputStream is = Locators.class.getResourceAsStream(LOCATORS_FILE)) {
            if (is == null) {
                throw new RuntimeException("Locators JSON file not found: " + LOCATORS_FILE);
            }
            JSONObject json = new JSONObject(new JSONTokener(is));
            for (String key : json.keySet()) {
                JSONObject locatorObj = json.getJSONObject(key);
                String type = locatorObj.getString("type");
                String value = locatorObj.getString("value");
                locatorMap.put(key, getBy(type, value));
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to load locators from JSON", e);
        }
    }

    private static By getBy(String type, String value) {
        switch (type.toLowerCase()) {
            case "id": return By.id(value);
            case "xpath": return By.xpath(value);
            case "css": return By.cssSelector(value);
            case "name": return By.name(value);
            case "class": return By.className(value);
            case "tag": return By.tagName(value);
            case "linktext": return By.linkText(value);
            case "partiallinktext": return By.partialLinkText(value);
            default: throw new IllegalArgumentException("Unknown locator type: " + type);
        }
    }

    public static By get(String key) {
        if (!locatorMap.containsKey(key)) {
            throw new IllegalArgumentException("Locator not found for key: " + key);
        }
        return locatorMap.get(key);
    }
}
