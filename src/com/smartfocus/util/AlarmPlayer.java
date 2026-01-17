package com.smartfocus.util;

import javax.sound.sampled.*;
import java.io.InputStream;
import java.awt.Toolkit;

public class AlarmPlayer {

    public static void playAlarm() {
        try {
            // Always play system beep (guaranteed)
            Toolkit.getDefaultToolkit().beep();

            InputStream audioStream =
                    AlarmPlayer.class.getResourceAsStream("/alarm.wav");

            if (audioStream == null) {
                System.out.println("alarm.wav not found, beep used");
                return;
            }

            AudioInputStream ais =
                    AudioSystem.getAudioInputStream(audioStream);

            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();

            // 🔴 THIS IS THE KEY LINE
            Thread.sleep(2000); // keep JVM alive for sound

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
