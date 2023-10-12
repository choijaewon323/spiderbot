package com.darkknight.spiderbot.IOInterface;

import com.darkknight.spiderbot.crawler.Crawler;
import com.darkknight.spiderbot.utility.Pair;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@Service
public class IOService {
    private HashMap<Pair, ArrayList<String>> flightMap;
    private HashMap<String, Integer> priority;

    public void init() {

    }

    public IOService() {
        this.flightMap = new HashMap<>();
        this.priority = new HashMap<>();

        init();
    }

    public IOResponseDto getData(IORequestDto requestDto) {
        /*
        출발지와 도착지에 대한 경유지 파악
        파악 후 경유지 개수에 따른 process 메소드 호출
         */

        int stopCount = 0;

        if (stopCount == 0) {
            List<String> sourceToDest = new ArrayList<>();

            return Crawler.process(requestDto, sourceToDest);
        } else if (stopCount == 1) {
            String stop = "";
            List<String> sourceToStop = new ArrayList<>();
            List<String> stopToDest = new ArrayList<>();

            return Crawler.process(requestDto, stop, sourceToStop, stopToDest);
        }
        // stopCount == 2
        String stop1 = "";
        String stop2 = "";
        List<String> sourceToStop1 = new ArrayList<>();
        List<String> stop1ToStop2 = new ArrayList<>();
        List<String> stop2ToDest = new ArrayList<>();

        return Crawler.process(requestDto, stop1, stop2, sourceToStop1, stop1ToStop2, stop2ToDest);
    }
}
