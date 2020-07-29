package io.pivotal.pal.tracker;

import java.time.LocalDate;
import java.util.Objects;
public class TimeEntry {
    private long userId;

    @Override
    public String toString() {
        return "TimeEntry{" +
                "userId=" + userId +
                ", projectId=" + projectId +
                ", localDate=" + date +
                ", hours=" + hours +
                ", id=" + id +
                '}';
    }

    private long projectId;
    private LocalDate date;
    private int hours;

    public TimeEntry(long id, long projectId, long userId, LocalDate date, int hours) {

        this.id = id;
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    public TimeEntry(long projectId, long userId, LocalDate date, int hours) {
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    public TimeEntry() {

    }

    public long getId() {
        return id;
    }

    private long id;

    public void setId(long id) {
        this.id = id;
    }

    public long getProjectId() {
        return projectId;
    }

    public long getUserId() {
        return userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeEntry timeEntry = (TimeEntry) o;
        return userId == timeEntry.userId &&
                id == timeEntry.id &&
                projectId == timeEntry.projectId &&
                hours == timeEntry.hours &&
                date.equals(timeEntry.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, id, projectId, date, hours);
    }
}
