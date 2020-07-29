package io.pivotal.pal.tracker;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface TimeEntryRepository {
    TimeEntry create(TimeEntry timeEntry);

    TimeEntry find(long id);

    void delete(long id);

    TimeEntry update(long eq, TimeEntry any);

    List<TimeEntry> list();
}
