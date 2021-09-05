package com.eventsourcing.eventsourcing.withes.service;

import com.eventsourcing.eventsourcing.withes.model.EventSourcingModel;
import com.eventsourcing.eventsourcing.withes.repository.EventSourcingRepository;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EventSourcingService {

    private final EventSourcingRepository eventSourcingRepository;

    public EventSourcingService(EventSourcingRepository eventSourcingRepository) {
        this.eventSourcingRepository = eventSourcingRepository;
    }

    public void storeEventSourcing(@NonNull EventSourcingModel eventSourcingModel) {
        eventSourcingRepository.save(eventSourcingModel);
    }
}
