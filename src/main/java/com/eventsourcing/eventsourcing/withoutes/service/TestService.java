package com.eventsourcing.eventsourcing.withoutes.service;

import com.eventsourcing.eventsourcing.withoutes.model.Demo;
import com.eventsourcing.eventsourcing.withoutes.repository.TestRepository;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestService {
    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public void storeDemoText(@NonNull Demo demoText){
        testRepository.save(demoText);
    }
}
