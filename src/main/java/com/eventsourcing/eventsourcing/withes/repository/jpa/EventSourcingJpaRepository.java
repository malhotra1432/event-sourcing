package com.eventsourcing.eventsourcing.withes.repository.jpa;

import com.eventsourcing.eventsourcing.withes.entity.EventSourcingEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventSourcingJpaRepository extends MongoRepository<EventSourcingEntity, String> {
}
