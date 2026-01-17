# Smart Focus & Motivation Tracker 🎯

A Java-based desktop application that helps users stay focused during study or work sessions by tracking time, triggering alerts, playing an alarm sound, and displaying motivational quotes.

This project demonstrates strong fundamentals in **Core Java, multithreading, Swing UI handling, and resource management**.

---

## 🚀 Features

- ⏱️ Focus session tracking using background threads
- 🔔 Timed alert notification after a set focus duration
- 🔊 Alarm sound with system-safe fallback
- 💬 Motivational quote popup using Java Swing
- 🧵 Thread-safe UI updates via Event Dispatch Thread (EDT)
- 📁 Clean project structure with separation of concerns

---

## 🛠️ Tech Stack

- **Language:** Java
- **UI:** Java Swing
- **Concepts:** Multithreading, OOP, File Handling
- **Tools:** IntelliJ IDEA, Git, GitHub

---

## 📂 Project Structure
SmartFocusTracker/
├── src/
│ └── com.smartfocus
│ ├── main # Application entry point
│ ├── model # Core data models
│ ├── service # Timer and business logic
│ └── util # Alarm and quote utilities
├── resources/
│ ├── alarm.wav
│ └── quotes.txt
├── README.md
└── .gitignore


---

## ▶️ How to Run

1. Clone the repository
2. Open the project in **IntelliJ IDEA**
3. Run `Main.java`
4. (Test mode uses 1-minute focus duration)

---

## 💡 Key Learnings

- Implemented background timers using Java threads
- Handled Swing UI updates correctly using EDT
- Managed Java resource loading for audio and text files
- Debugged real-world Java sound API limitations

---

## 🔮 Future Enhancements

- GUI with Start / Stop buttons
- User-configurable focus time
- Daily focus analytics
- Dark mode UI

---

## 👩‍💻 Author

**Sireesha S**  
B.E. Information Science & Engineering

---

⭐ If you found this project helpful, feel free to star the repository!
