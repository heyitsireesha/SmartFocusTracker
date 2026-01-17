package com.smartfocus.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteManager {

    private static final List<String> quotes = new ArrayList<>();

    static {
        try {
            InputStream input =
                    QuoteManager.class.getResourceAsStream("/quotes.txt");

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(input));

            String line;
            while ((line = reader.readLine()) != null) {
                quotes.add(line);
            }
            reader.close();
        } catch (Exception e) {
            quotes.add("Keep going. You're doing great!");
        }
    }

    public static String getRandomQuote() {
        Random random = new Random();
        return quotes.get(random.nextInt(quotes.size()));
    }
}
