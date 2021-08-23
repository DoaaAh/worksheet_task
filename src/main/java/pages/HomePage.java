package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By enableSearchBar = By.xpath("//button[@type='button']//i");
    private By searchBox = By.id("txt_search_query");

    public SearchResultsPage lessonSearch(String lesson){
        driver.findElement(enableSearchBar).click();
        driver.findElement(searchBox).sendKeys(lesson, Keys.ENTER);
        return new SearchResultsPage(driver);
    }
}
