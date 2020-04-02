package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FeedPage {

    String UPDATE_MOOD_ID = "#LinkUpdate";

    public FeedPage isPageOpen(){
        $(UPDATE_MOOD_ID).waitUntil(Condition.visible, 30000);
        return this;
    }

    public MoodModal clickUpdate(){
        $(UPDATE_MOOD_ID).click();
        return new MoodModal();
    }

    public FeedPage addReply(int index, String text){
        $$(".glyphicon-comment").get(index-1).click();
        $$(".InputReply").get(index-1).setValue(text).pressEnter();
        refresh();
        $(Selectors.byText(text)).waitUntil(Condition.visible, 3000);
        return this;
    }

}
