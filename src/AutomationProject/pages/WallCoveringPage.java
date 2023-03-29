package AutomationProject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WallCoveringPage {
    public WebDriver driver;
    @FindBy(id="menu-item-162")
    WebElement WallCovering;

    @FindBy(className = "cat-item-46")
    WebElement LivingRoom;


    @FindBy(tagName = "ul")
    WebElement clickLink;
    public WallCoveringPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//    public void LivingRoomCovering(String WallCovring) throws InterruptedException {
//        Thread.sleep(3000);
//        WallCovering.click();
//        Thread.sleep(3000);
//        LivingRoom.click();
//        Thread.sleep(3000);
//   }

   public  void ClickOnTagName(){
        WebElement listElement = clickLink.findElements(By.tagName("li")).get(3);

        listElement.click();

   }
}
