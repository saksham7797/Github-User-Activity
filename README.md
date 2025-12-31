# **🕵️ GitHub User Activity CLI**

A robust, zero-dependency command-line interface (CLI) tool built in Java to fetch and display the recent activity of any GitHub user.

**The Philosophy:** No Jackson. No Gson. No Frameworks. Just pure logic, java.net.http, and raw string manipulation.

## **💻 Example Output**

Here is how the tool works in the terminal:

\> java Main saksham7797

Output:  
\- Pushed commits to saksham7797/Github-User-Activity  
\- Starred torvalds/linux  
\- Created repository saksham7797/Design-Patterns

## **🚀 Technical Highlights**

This project is an exercise in **engineering fundamentals**. Instead of relying on heavy libraries to handle HTTP requests and JSON parsing, I implemented these mechanisms from scratch.

### **🧠 The "Hard Way" Approach**

1. **Custom JSON Parser:**  
   * Implemented a **cursor-based parsing algorithm** to navigate raw JSON strings.  
   * Avoided String.split overhead by using targeted indexOf and substring operations.  
   * **Performance:** Parses streams linearly without loading unnecessary object overhead.  
2. **Modern Networking:**  
   * Utilizes java.net.http.HttpClient (Java 11+) for non-blocking I/O.  
   * Handles HTTP status codes explicitly (404 Not Found, 403 Rate Limit, 500 Server Error).  
3. **Clean Architecture:**  
   * **Main.java**: Handles CLI arguments, user validation, and output formatting.  
   * **DataCollector.java**: Encapsulates API communication and parsing logic.

## **🛠️ Features**

* **Real-time Data:** Fetches the latest public events using the GitHub API.  
* **Human-Readable Output:** Translates technical event types (PushEvent, WatchEvent, IssuesEvent) into natural language sentences.  
* **Robust Error Handling:** Gracefully manages network failures and invalid usernames.  
* **Zero Bloat:** Compiled bytecode is extremely lightweight due to lack of dependencies.

## **⚡ How to Run**

### **Prerequisites**

* Java Development Kit (JDK) 11 or higher.

### **1\. Clone the Repository**

git clone \[https://github.com/saksham7797/Github-User-Activity.git\](https://github.com/saksham7797/Github-User-Activity.git)  
cd Github-User-Activity

### **2\. Compile**

Since there are no build tools like Maven or Gradle, use the standard Java compiler:

javac Main.java DataCollector.java

### **3\. Execute**

Pass the GitHub username as a command-line argument:

java Main \<username\>

**Example:**

java Main torvalds

## **🔮 Future Improvements**

* $$ $$  
  Add caching mechanism to reduce API calls (handle Rate Limiting better).  
* $$ $$  
  Support colorized command-line interface output (ANSI colors).  
* $$ $$  
  Filter activity by event type (e.g., show only 'Push' events).

## **📂 Project Structure**

Github-User-Activity/  
├── Main.java           \# Entry point & UI Logic  
├── DataCollector.java  \# API Client & Parser Logic  
└── README.md           \# Documentation

**Built by [Saksham](https://www.google.com/search?q=https://github.com/saksham7797)**