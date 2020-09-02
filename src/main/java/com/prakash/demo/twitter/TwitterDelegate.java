package com.prakash.demo.twitter;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import twitter4j.*;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TwitterDelegate {

    public List<String> getTimeline() throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();

        return twitter.getHomeTimeline().stream()
                .map(Status::getText)
                .collect(Collectors.toList());
    }

    public List<String> searchtweets() throws TwitterException {

        Twitter twitter = TwitterFactory.getSingleton();
        Query query = new Query("source:twitter4j baeldung");
        QueryResult result = twitter.search(query);

        return result.getTweets().stream()
                .map(Status::getText)
                .collect(Collectors.toList());
    }
}
