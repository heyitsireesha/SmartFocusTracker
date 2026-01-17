package com.smartfocus.main;

import com.smartfocus.model.StudySession;
import com.smartfocus.service.FocusTimerService;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) throws Exception {

        // Start Swing UI thread
        SwingUtilities.invokeLater(() ->
                System.out.println("Swing UI thread started")
        );

        System.out.println("Smart Focus Tracker started");

        StudySession session = new StudySession();

        FocusTimerService timer =
                new FocusTimerService(session, 1, 1); // 1 min test

        timer.start();

        // KEEP JVM ALIVE (THIS IS KEY)
        Thread.sleep(120000); // 2 minutes

        session.endSession();
    }
}
