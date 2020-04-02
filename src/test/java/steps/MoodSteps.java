package steps;

import pages.FeedPage;
import pages.LoginPage;
import pages.MoodModal;
import pages.MyFeedPage;

import static com.codeborne.selenide.Selenide.sleep;

public class MoodSteps {

    LoginPage loginPage;
    FeedPage feedPage;
    MoodModal moodModal;
    MyFeedPage myFeedPage;

    public MoodSteps(){
        loginPage = new LoginPage();
        feedPage = new FeedPage();
        myFeedPage = new MyFeedPage();
        moodModal = new MoodModal();
    }


    public MoodSteps login(String user, String password){
        loginPage.openPage();
        loginPage.login(user, password);
        feedPage.isPageOpen();
        return this;
    }

    public MoodSteps  updateMood(int moodRating, String description, String date){
        feedPage.clickUpdate();
        moodModal.isPageOpen();
        moodModal.updateDetails(moodRating, description, date);
        moodModal.clickUpdateMood();
        moodModal.toDiary();
        //TODO validate that diary page is opened
        return this;

    }

    public MoodSteps removeMyMood(int index){
        myFeedPage
                .openPage()
                .isPageOpen()
                .removeMyMood(index);
        return this;
    }

    public MoodSteps addReplyForMyFeed(int index, String text){
        myFeedPage
                .openPage()
                .isPageOpen()
                .addReply(index, text);
        return this;
    }

    public MoodSteps addReplyForWorldFeed(int index, String text){
        feedPage.addReply(index, text);
        return this;
    }


}
