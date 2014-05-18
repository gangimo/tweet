import org.junit.Test;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 * @author gangimo
 */
public class TweetTest {

    @Test
    public void ツイート() {

        try {
            Twitter twitter = new TwitterFactory().getInstance();
            Status status = twitter.updateStatus("疲れた");
            System.out.println(status.getText());
        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }

}
