package pages;

import com.codeborne.selenide.Condition;
import lombok.extern.log4j.Log4j2;

import static com.codeborne.selenide.Selenide.$;

@Log4j2
public class MoodModal {

    String UPDATE_BUTTON_CCS = ".ButtonUpdate";
    String MY_DIARY_BUTTON_CSS = ".ButtonMyDiary";

    public MoodModal isPageOpen(){
        $(UPDATE_BUTTON_CCS).should(Condition.appear);
        log.info("Update mood pop-up was opened.");
        return this;
    }

    public MoodModal updateDetails(int moodRating, String description, String date){
        //TODO set mood Rating
        $("#TextBoxUpdateMoodTag").sendKeys(description);
        log.info(String.format("Trying to update mood with description - %s", description));
        //TODO click to date
        return this;
    }

    public MoodModal clickUpdateMood(){
        $(UPDATE_BUTTON_CCS).click();
        log.info("Clicking update mood button.");
        return this;
    }

    //TODO This method should return to my diary page
    public void toDiary(){
        $(MY_DIARY_BUTTON_CSS).click();
    }
}
