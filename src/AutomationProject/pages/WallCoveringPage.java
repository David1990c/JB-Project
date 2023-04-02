package AutomationProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WallCoveringPage {
    public WebDriver driver;
    @FindBy(id="menu-item-162")
    WebElement WallCovering;
    @FindBy(className = "cat-item-46")
    WebElement LivingRoom;
    @FindBy(linkText = "טפט פרחוני- שושנים")
    WebElement linkFlowers;
    public WallCoveringPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void LivingRoomCovering() throws InterruptedException {
        WallCovering.click();
        LivingRoom.click();
        linkFlowers.click();
   }

}

