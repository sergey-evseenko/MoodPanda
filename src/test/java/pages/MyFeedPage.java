package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MyFeedPage {

    String url = "https://moodpanda.com/Feed/?Me=1";
    String UPDATE_MOOD_ID = "#LinkUpdate";

    public MyFeedPage openPage(){
        open(url);
        return this;
    }

    public MyFeedPage isPageOpen(){
        $(UPDATE_MOOD_ID).waitUntil(Condition.visible, 3000);
        return this;
    }

    public MyFeedPage removeMyMood(int index){
        ElementsCollection deleteButtons = $$(".ButtonDelete");
        int numberOfElementsBefore = deleteButtons.size();
        deleteButtons.get(index-1).click();
        refresh();
        $$(By.cssSelector(".ButtonDelete")).shouldHaveSize(numberOfElementsBefore-1);
        return this;
    }

    public MyFeedPage addReply(int index, String text){
        $$(".glyphicon-comment").get(index-1).click();
        $$(".InputReply").get(index-1).setValue(text).pressEnter();
        refresh();
        $(Selectors.byText(text)).waitUntil(Condition.visible, 3000);
        return this;
    }









}
