package simulado_q1;

import java.util.LinkedList;
import java.util.List;

public class User {
    private String twitterID;
    private List<Tweet> tweets;

    public User(String twitterID) {
        this.twitterID = twitterID;
        this.tweets = new LinkedList<Tweet>();
    }

    void Tweet(String text) {
        Tweet message = new Tweet(text);
        tweets.add(message);
    }

    public String getID() {
        return twitterID;
    }

    public List<Tweet> getTweets() {
        return new LinkedList<Tweet>(tweets);
    }

    @Override
    public String toString() {
        return ("\n\tUsuario :" + getID() + "\n\tTweets Number:" + getTweets().size());
    }

    public String getTwitterID() {
        return twitterID;
    }

    public double getAvgTweetLentgh() {
        int number = 0;
        int chars = 0;
        double avg;
        for (Tweet t : tweets) {
            number++;
            chars += t.text.length();
        }
        avg = chars / number;
        return avg;
    }

    public int getTweetAmount() {
        return tweets.size();
    }

    public int getTotalTweetLentgh() {
        int chars = 0;
        for (Tweet t : tweets) {
            chars += t.text.length();
        }
        return chars;
    }

}
