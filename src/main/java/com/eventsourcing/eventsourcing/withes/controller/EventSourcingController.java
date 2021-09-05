package com.eventsourcing.eventsourcing.withes.controller;

import com.eventsourcing.eventsourcing.withes.model.EventSourcingModel;
import com.eventsourcing.eventsourcing.withes.service.EventSourcingService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventSourcingController {

    private final EventSourcingService eventSourcingService;

    public EventSourcingController(EventSourcingService eventSourcingService) {
        this.eventSourcingService = eventSourcingService;
    }

    @GetMapping("es/{eventSourcing}")
    public String getEventSourcing(@PathVariable String eventSourcing) {
        return eventSourcing;
    }

    @PostMapping("es")
    public void postEventSourcing(@RequestBody  @NonNull EventSourcingModel eventSourcingModel) {
        eventSourcingService.storeEventSourcing(eventSourcingModel);
    }
}
