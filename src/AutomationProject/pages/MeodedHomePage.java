package AutomationProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class MeodedHomePage {
    //כשפותחים קלאס שמכיל את הלוקטורים מתחיל בא' בלקרוא לדרייב
    public WebDriver driver ;
    //מתחיל שלב הנוטציות מטרגטים אלמנטים ומעניקים שם לאלמט
    @FindBy (id = "menu-item-36")
    WebElement About;
    @FindBy (id = "logo")
    WebElement BackHomePage;
    //בכל קלאס שמכיל את הלוקטורים חייבים לבנות את הבנאי , בנאי בונים עם אותו השם של הקלאס ושמים בארגומט את הדרייבר
    public  MeodedHomePage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }
    //לכל אלמנט שיצרנו (עם הנוטציות) אני בונה פונקציה ... ובמקרה הנל יש בארגומנט String כי זהו אלנט מסוג טקסט
    public void BackHomePage (String homePage) throws InterruptedException {
        About.click();
        Thread.sleep(3000);
        BackHomePage.click();
        Thread.sleep(3000);
    }
        }



