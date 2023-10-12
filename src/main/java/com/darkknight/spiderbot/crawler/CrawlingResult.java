package com.darkknight.spiderbot.crawler;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CrawlingResult {
    private int restCount;
    private String startTime;
    private String endTime;

    public CrawlingResult(int restCount, String startTime, String endTime) {
        this.restCount = restCount;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
