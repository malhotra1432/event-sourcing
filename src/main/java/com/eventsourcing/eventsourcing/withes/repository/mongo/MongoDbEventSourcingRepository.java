package com.eventsourcing.eventsourcing.withes.repository.mongo;

import com.eventsourcing.eventsourcing.withes.entity.EventSourcingEntity;
import com.eventsourcing.eventsourcing.withes.model.EventSourcingModel;
import com.eventsourcing.eventsourcing.withes.repository.EventSourcingRepository;
import com.eventsourcing.eventsourcing.withes.repository.jpa.EventSourcingJpaRepository;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class MongoDbEventSourcingRepository implements EventSourcingRepository {

    private final EventSourcingJpaRepository eventSourcingJpaRepository;

    public MongoDbEventSourcingRepository(EventSourcingJpaRepository eventSourcingJpaRepository) {
        this.eventSourcingJpaRepository = eventSourcingJpaRepository;
    }

    @Override
    public void save(@NonNull EventSourcingModel eventSourcingModel) {
        EventSourcingEntity  eventSourcingEntity = EventSourcingEntity.builder()
                .job(eventSourcingModel.getJob())
                .build();
        eventSourcingJpaRepository.insert(eventSourcingEntity);
    }
}
