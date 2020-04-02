import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class GoogleTest {

    @Test
    public void searchInGoogle(){
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.headless = true;

        open("https://www.google.com/");
        $(By.name("q")).sendKeys("TeachMeSkills");
        $(By.name("btnK")).click();

    }
}
