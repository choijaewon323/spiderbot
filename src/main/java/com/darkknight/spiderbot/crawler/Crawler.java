package com.darkknight.spiderbot.crawler;

import com.darkknight.spiderbot.IOInterface.IORequestDto;
import com.darkknight.spiderbot.IOInterface.IOResponseDto;

import java.util.ArrayList;
import java.util.List;

public class Crawler {
    /*
    Request : 출발지, 도착지, 날짜(월,일), 항공사 리스트
    */

    // 직항
    public static IOResponseDto process(IORequestDto requestDto, List<String> flightList) {
        IOResponseDto result = null;

        List<Integer> list = new ArrayList<>();

        int size = flightList.size();

        // test
        size = 8;

        for (int i = 0; i < size; i += 3) {
            Thread thread1 = null;
            Thread thread2 = null;
            Thread thread3 = null;
            CrawlingThread cThread1 = null;
            CrawlingThread cThread2 = null;
            CrawlingThread cThread3 = null;

            if (i < size) {
                //String url = flightList.get(i);
                cThread1 = new CrawlingThread(requestDto.getSource(), requestDto.getDestination(), "", requestDto.getMonth(), requestDto.getDay());

                // test
                cThread1.setNum1(3);
                cThread1.setNum2(6);
                thread1 = new Thread(cThread1);
                thread1.start();
            }
            if (i + 1 < size) {
                //String url = flightList.get(i + 1);
                cThread2 = new CrawlingThread(requestDto.getSource(), requestDto.getDestination(), "", requestDto.getMonth(), requestDto.getDay());

                // test
                cThread2.setNum1(7);
                cThread2.setNum2(10);
                thread2 = new Thread(cThread2);
                thread2.start();
            }
            if (i + 2 < size) {
                //String url = flightList.get(i + 2);
                cThread3 = new CrawlingThread(requestDto.getSource(), requestDto.getDestination(), "", requestDto.getMonth(), requestDto.getDay());

                // test
                cThread3.setNum1(30);
                cThread3.setNum2(30);
                thread3 = new Thread(cThread3);
                thread3.start();
            }

            try {
                if (thread1 != null) {
                    thread1.join();
                }
                if (thread2 != null) {
                    thread2.join();
                }
                if (thread3 != null) {
                    thread3.join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();

                return null;
            }

            if (thread1 != null) {
                // test
                list.add(cThread1.getResult());
            }
            if (thread2 != null) {
                // test
                list.add(cThread2.getResult());
            }
            if (thread3 != null) {
                // test
                list.add(cThread3.getResult());
            }
        }

        for (Integer i : list) {
            System.out.println(i);
        }

        return result;
    }

    // 경유 1개
    public static IOResponseDto process(IORequestDto requestDto, String stopover, List<String> sourceToStop, List<String> stopToDest) {
        IOResponseDto result = null;
        return result;
    }

    // 경유 2개
    public static IOResponseDto process(IORequestDto requestDto, String stopover1, String stopover2, List<String> sourceToStop1, List<String> stop1ToStop2, List<String> stop2ToDest) {
        IOResponseDto result = null;
        return result;
    }
}
