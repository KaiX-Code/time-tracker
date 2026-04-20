package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    public void add(TimeEntry timeEntry) {
        entries.add(timeEntry);
    }

    public void remove(TimeEntry timeEntry) {
        entries.remove(timeEntry);
    }

    public int size() {
        return entries.size();
    }

    public TimeEntry get(int entryIndex) {
        return entries.get(entryIndex);
    }
}

