package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class MoodModal {

    String UPDATE_BUTTON_CCS = ".ButtonUpdate";
    String MY_DIARY_BUTTON_CSS = ".ButtonMyDiary";

    public MoodModal isPageOpen(){
        $(UPDATE_BUTTON_CCS).should(Condition.appear);
        return this;
    }

    public MoodModal updateDetails(int moodRating, String description, String date){
        //TODO set mood Rating
        $("#TextBoxUpdateMoodTag").sendKeys(description);
        //TODO click to date
        return this;
    }

    public MoodModal clickUpdateMood(){
        $(UPDATE_BUTTON_CCS).click();
        return this;
    }

    //TODO This method should return to my diary page
    public void toDiary(){
        $(MY_DIARY_BUTTON_CSS).click();
    }
}
