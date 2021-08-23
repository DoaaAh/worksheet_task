package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {

    private WebDriver driver;
    public SearchResultsPage(WebDriver driver){this.driver = driver;}

    public LessonPage openLesson(int index){
        driver.findElement(By.xpath("//div[@class='results']//li["+index+"]//a")).click();
        return new LessonPage(driver);
    }


}
