package io.pivotal.pal.tracker;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    private Map<Long, TimeEntry> timeEntryMap = new HashMap();
    private long id = 1l;

    @Override
    public TimeEntry create(TimeEntry timeEntry){
        long newId = id++;
        TimeEntry newTimeEntry = new TimeEntry(newId, timeEntry.getProjectId(), timeEntry.getUserId(), timeEntry.getDate(), timeEntry.getHours());
        timeEntryMap.put(newId, newTimeEntry);
        return newTimeEntry;
    }

    @Override
    public TimeEntry find(long id) {
        return timeEntryMap.get(id);
    }

    @Override
    public void delete(long id) {
        timeEntryMap.remove(id);
    }

    @Override
    public TimeEntry update(long id, TimeEntry timeEntry) {
        timeEntry.setId(id);
        timeEntryMap.replace(id, timeEntry);
        return timeEntryMap.get(id);
    }

    public List<TimeEntry> list() {
        return new ArrayList<>(timeEntryMap.values());
    }
}
