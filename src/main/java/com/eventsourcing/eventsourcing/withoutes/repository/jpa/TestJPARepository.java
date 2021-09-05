package com.eventsourcing.eventsourcing.withoutes.repository.jpa;

import com.eventsourcing.eventsourcing.withoutes.entity.TestEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestJPARepository extends MongoRepository<TestEntity, String> {
}
