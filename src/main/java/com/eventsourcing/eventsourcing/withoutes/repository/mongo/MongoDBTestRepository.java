package com.eventsourcing.eventsourcing.withoutes.repository.mongo;

import com.eventsourcing.eventsourcing.withoutes.model.Demo;
import com.eventsourcing.eventsourcing.withoutes.entity.TestEntity;
import com.eventsourcing.eventsourcing.withoutes.repository.TestRepository;
import com.eventsourcing.eventsourcing.withoutes.repository.jpa.TestJPARepository;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class MongoDBTestRepository implements TestRepository {

    private final TestJPARepository testJPARepository;

    public MongoDBTestRepository(TestJPARepository testJPARepository) {
        this.testJPARepository = testJPARepository;
    }

    @Override
    public void save(@NonNull Demo demoText) {
        TestEntity testEntity = TestEntity.builder()
                .demoText(demoText.getDemoText())
                .build();
        testJPARepository.insert(testEntity);
    }
}
