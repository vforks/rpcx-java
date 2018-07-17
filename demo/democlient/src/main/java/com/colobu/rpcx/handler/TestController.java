package com.colobu.rpcx.handler;

import com.colobu.rpcx.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ITestService testService;

    @Autowired
    private ApplicationContext context;

    @GetMapping("/hi")
    public String input(String word) {
        String s = testService.hi(word);
        return s;
    }

}
