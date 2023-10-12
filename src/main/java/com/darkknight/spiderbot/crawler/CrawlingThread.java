package com.darkknight.spiderbot.crawler;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CrawlingThread implements Runnable {
    private Integer result;
    private String source;
    private String dest;
    private String url;
    private String month;
    private String day;

    // test
    private int num1;
    private int num2;


    public CrawlingThread() {

    }

    public CrawlingThread(String source, String dest, String url, String month, String day) {

        this.source = source;
        this.dest = dest;
        this.url = url;
        this.month = month;
        this.day = day;
    }

    @Override
    public void run() {
        /*
            URL에 대한 분기문
                수행

        */



        result = num1 + num2;
    }
}
