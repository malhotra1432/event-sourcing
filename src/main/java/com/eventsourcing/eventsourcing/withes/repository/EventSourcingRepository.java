package com.eventsourcing.eventsourcing.withes.repository;

import com.eventsourcing.eventsourcing.withes.model.EventSourcingModel;
import lombok.NonNull;

public interface EventSourcingRepository {

    void save(@NonNull EventSourcingModel eventSourcingModel);
}
