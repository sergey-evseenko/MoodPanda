package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Selenide.*;

@Log4j2
public class FeedPage {

    String UPDATE_MOOD_ID = "#LinkUpdate";

    public FeedPage isPageOpen(){
        $(UPDATE_MOOD_ID).waitUntil(Condition.visible, 30000);
        log.info("Login was success.");
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
