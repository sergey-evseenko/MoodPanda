package tests;

import org.testng.annotations.Test;
import steps.MoodSteps;

public class MoodTest extends BaseTest{

    @Test (description = "Updating mood")
    public void updateMoodTo10Test(){
        steps
                .login("sergey.evseenko@mailinator.com", "Alfie_07061989")
                .updateMood(4, "stay home", "");
    }

    @Test (description = "Removing mood")
    public void removeMyMood(){
        steps
                .login("sergey.evseenko@mailinator.com", "Alfie_07061989")
                .removeMyMood(1);
    }

    @Test (description = "Adding reply to the mood on My Feed page")
    public void addReplyForMyFeed(){
        steps
                .login("sergey.evseenko@mailinator.com", "Alfie_07061989")
                .addReplyForMyFeed(1, "My test user");
    }

    @Test (description = "Adding reply to the mood on World Feed page")
    public void addReplyForWorldFeed(){
        steps
                .login("sergey.evseenko@mailinator.com", "Alfie_07061989")
                .addReplyForWorldFeed(1, "My test user");
    }

}
