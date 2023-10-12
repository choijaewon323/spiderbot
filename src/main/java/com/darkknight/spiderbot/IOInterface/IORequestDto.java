package com.darkknight.spiderbot.IOInterface;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IORequestDto {
    private String source;
    private String destination;
    private String month;
    private String day;

    public IORequestDto(String source, String destination, String month, String day) {
        this.source = source;
        this.destination = destination;
        this.month = month;
        this.day = day;
    }
}
