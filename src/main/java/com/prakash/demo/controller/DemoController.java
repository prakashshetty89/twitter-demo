package com.prakash.demo.controller;


import com.prakash.demo.twitter.TwitterDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.TwitterException;

import java.util.List;

@RequestMapping(value = "/tweet")
@RestController
public class DemoController {

    @Autowired
    private TwitterDelegate twitterDelegate;

    @GetMapping(value = "/fetch", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> fetchTimeline() throws TwitterException {
        return twitterDelegate.getTimeline();
    }

    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> search() throws TwitterException {
        return twitterDelegate.searchtweets();
    }






}
