package com.smartfocus.service;

import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;


import com.smartfocus.model.StudySession;
import com.smartfocus.util.AlarmPlayer;
import com.smartfocus.util.QuoteManager;

public class FocusTimerService {

    private StudySession session;
    private int focusMinutes;
    private int alertMinutes;

    public FocusTimerService(StudySession session, int focusMinutes, int alertMinutes) {
        this.session = session;
        this.focusMinutes = focusMinutes;
        this.alertMinutes = alertMinutes;
    }

    public void start() {
        Thread timerThread = new Thread(() -> {

            boolean alertTriggered = false;

            while (true) {
                long elapsed = session.getDurationInMinutes();

                if (elapsed >= alertMinutes && !alertTriggered) {
                    System.out.println("🔔 ALERT: You reached " + alertMinutes + " minutes of focus!");

                    // Play alarm
                    AlarmPlayer.playAlarm();

                    // Show quote popup on UI thread
                    SwingUtilities.invokeLater(() -> {
                        JOptionPane.showMessageDialog(
                                null,
                                QuoteManager.getRandomQuote(),
                                "Keep Going 💪",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    });

                    alertTriggered = true;
                }

                if (elapsed >= focusMinutes) {
                    System.out.println("✅ Focus session completed!");
                    break;
                }

                try {
                    Thread.sleep(1000); // check every second
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        timerThread.start();
    }
}
