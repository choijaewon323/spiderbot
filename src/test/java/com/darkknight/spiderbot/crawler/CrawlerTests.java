package com.darkknight.spiderbot.crawler;

import com.darkknight.spiderbot.IOInterface.IORequestDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class CrawlerTests {
    @Test
    void processTest() {
        IORequestDto requestDto = new IORequestDto();
        requestDto.setSource("");
        requestDto.setDestination("");
        requestDto.setMonth("");
        requestDto.setDay("");

        // test
        Crawler.process(requestDto, new ArrayList<>());
    }
}
