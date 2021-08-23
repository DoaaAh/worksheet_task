package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class LanguageSelectionPage {
    private WebDriver driver;
    public LanguageSelectionPage(WebDriver driver){
        this.driver = driver;
    }
    private By languageLocator = By.tagName("a");
    public HomePage selectLanguage(String languageName){
        driver.findElement(By.xpath("//a[text()='"+languageName+"']")).click();
        return new HomePage(driver);
    }
}
