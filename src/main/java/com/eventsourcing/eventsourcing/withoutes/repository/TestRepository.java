package com.eventsourcing.eventsourcing.withoutes.repository;

import com.eventsourcing.eventsourcing.withoutes.model.Demo;
import lombok.NonNull;

public interface TestRepository {
    void save(@NonNull Demo demoText);
}
