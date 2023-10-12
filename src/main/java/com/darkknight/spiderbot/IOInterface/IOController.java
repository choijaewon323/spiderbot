package com.darkknight.spiderbot.IOInterface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IOController {
    private final IOService ioService;

    public IOController(IOService ioService) {
        this.ioService = ioService;
    }

    @GetMapping("/api/v1/spiderbot")
    public IOResponseDto getData(@RequestBody IORequestDto ioRequestDto) {
        return ioService.getData(ioRequestDto);
    }
}
