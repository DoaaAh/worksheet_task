package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.*;

public class WorkSheetTest {

    private WebDriver driver;
    public LanguageSelectionPage languageSelection;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.nagwa.com/");
        languageSelection = new LanguageSelectionPage(driver);
    }

    @Test
    public void testNumberOfQuestions(){
        HomePage home = languageSelection.selectLanguage("English");
        SearchResultsPage resultsPage = home.lessonSearch("addition");
        LessonPage lesson = resultsPage.openLesson(2);
        WorkSheetPage sheet = lesson.openWorksheet();
        System.out.println("The number of questions in this lesson is: " + sheet.numberOfQuestions());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
