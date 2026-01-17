package com.smartfocus.model;
import java.time.LocalDateTime;
import java.time.Duration;

public class StudySession {

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    // Constructor: when session starts
    public StudySession() {
        this.startTime = LocalDateTime.now();
    }

    // End the session
    public void endSession() {
        this.endTime = LocalDateTime.now();
    }

    // Calculate duration in minutes
    public long getDurationInMinutes() {
        if (endTime == null) {
            return 0;
        }
        return Duration.between(startTime, endTime).toMinutes();
    }

    
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
}

