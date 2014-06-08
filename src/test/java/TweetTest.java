import org.junit.Test;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import static org.junit.Assert.fail;

/**
 * @author gangimo
 */
public class TweetTest {

    @Test
    public void ツイート() {

        try {
            Twitter twitter = new TwitterFactory().getInstance();
            Status status = twitter.updateStatus("腹減った");

        } catch (TwitterException e) {
            fail();
            e.printStackTrace();
        }

    }

}
