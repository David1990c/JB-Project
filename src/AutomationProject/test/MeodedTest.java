package AutomationProject.test;
import AutomationProject.pages.MeodedHomePage;
import AutomationProject.pages.SearchPage;
import AutomationProject.pages.WallCoveringPage;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MeodedTest {

    public static void main(String[] args) throws InterruptedException {
        SeleniumBase base = new SeleniumBase();
        ChromeDriver driver =  base.seleniumInit("https://www.meoded.co.il/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WallCoveringPage wallCoveringPage = new WallCoveringPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        MeodedHomePage meodedHomePage = new MeodedHomePage(driver);

        meodedHomePage.BackHomePage();
        wallCoveringPage.LivingRoomCovering();
        searchPage.SearchField("פרח");
        base.seleniumClose(driver);
    }
}
