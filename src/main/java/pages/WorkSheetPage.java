package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorkSheetPage {
    private WebDriver driver;
    public WorkSheetPage(WebDriver driver){
        this.driver = driver;
    }
    public int numberOfQuestions(){
        List<WebElement> questions = driver.findElements(By.xpath("//div[@class= 'question-number']"));
        return questions.size();
    }
}
