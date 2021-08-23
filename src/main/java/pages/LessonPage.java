package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LessonPage {
    private WebDriver driver;
    public LessonPage(WebDriver driver){this.driver = driver;}

    public WorkSheetPage openWorksheet(){
        driver.findElement(By.partialLinkText("Lesson Worksheet")).click();
        return new WorkSheetPage(driver);
    }
}
