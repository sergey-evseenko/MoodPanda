package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    String url = "https://moodpanda.com/login/";

    public LoginPage openPage(){
        open(url);
        $(By.id("ContentPlaceHolderContent_ButtonLogin")).waitUntil(Condition.visible, 3000);
        return this;
    }

    public LoginPage login(String user, String password){
        sleep(1000);
        $(By.id("ContentPlaceHolderContent_TextBoxEmail")).setValue(user);
        $(By.id("ContentPlaceHolderContent_TextBoxPassword")).setValue(password);
        $(By.id("ContentPlaceHolderContent_ButtonLogin")).click();
        return this;
    }
}
