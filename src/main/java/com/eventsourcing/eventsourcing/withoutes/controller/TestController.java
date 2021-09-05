package com.eventsourcing.eventsourcing.withoutes.controller;

import com.eventsourcing.eventsourcing.withoutes.model.Demo;
import com.eventsourcing.eventsourcing.withoutes.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("test/{test}")
    public String testGet(@PathVariable String test) {
        return test;
    }

    @PostMapping("test/{demoText}")
    public void testPost(@PathVariable Demo demoText) {
        testService.storeDemoText(demoText);
    }
}
