package AutomationProject.test;
import AutomationProject.pages.MeodedHomePage;
import AutomationProject.pages.SearchPage;
import AutomationProject.pages.WallCoveringPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeodedTest {

    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver =  base.seleniumInit("https://www.meoded.co.il/");
        WallCoveringPage wallCoveringPage = new WallCoveringPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        MeodedHomePage meodedHomePage = new MeodedHomePage(driver);
        meodedHomePage.BackHomePage("BackHomePage");
        wallCoveringPage.ClickOnTagName();

//        wallCoveringPage.LivingRoomCovering("LivingRoom");
        searchPage.SearchField("flower");
        base.seleniumClose(driver);
    }
}
