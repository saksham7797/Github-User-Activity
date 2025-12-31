Markdown

# GitHub User Activity CLI

A robust, command-line interface (CLI) tool built in Java to fetch and display the recent activity of any GitHub user. 

**Built with zero external dependencies.** No Jackson, no Gson, no shortcuts. Just pure Java logic, `java.net.http.HttpClient`, and manual JSON parsing.

## 🚀 Why This Project?

This project is not just about fetching data; it's an exercise in **engineering fundamentals**. 
Instead of relying on heavy libraries to handle HTTP requests and JSON parsing, this tool implements these mechanisms from scratch using the standard JDK. 

It demonstrates:
- **Low-level String Manipulation:** Manual parsing of complex JSON structures using cursors and substring logic.
- **Java 11+ HTTP Client:** Modern networking without legacy `HttpURLConnection`.
- **Streamlined Architecture:** Separation of concerns between data fetching (`DataCollector`) and application flow (`Main`).

## 🛠️ Features

- **Fetch Recent Activity:** Retrieves the latest public events for any GitHub user.
- **Custom JSON Parser:** A lightweight, loop-based parser designed specifically for GitHub's event structure.
- **Smart Output:** Translates technical API event types (e.g., `PushEvent`, `WatchEvent`) into human-readable sentences.
- **Error Handling:** Gracefully manages invalid usernames (404), API rate limits, and connectivity issues.

## 📋 Prerequisites

- **Java Development Kit (JDK) 11** or higher.

## ⚡ How to Run

### 1. Clone the Repository
```bash
git clone [https://github.com/saksham7797/Github-User-Activity.git](https://github.com/saksham7797/Github-User-Activity.git)
cd Github-User-Activity
2. Compile the Code
Since this project uses no external build tools (Maven/Gradle), you can compile it directly with javac.

Bash

javac Main.java DataCollector.java
3. Run the Application
Pass the GitHub username you want to inspect as an argument.

Bash

java Main <username>
Example:

Bash

java Main saksham7797
Output:

Plaintext

- Pushed commits to saksham7797/Github-User-Activity
- Starred torvalds/linux
- Created repository saksham7797/Design-Patterns
📂 Project Structure
Main.java: The entry point of the application. Handles user input and displays the final output.

DataCollector.java: The engine room. Handles the HTTP connection, fetches raw JSON data, and parses it using a custom-built string analysis algorithm.

🧠 The "Hard Way" Philosophy
This project was built following the "no shortcuts" rule:

No JSON Libraries: We parse the raw string manually to understand data structures deeply.

No Frameworks: We control the main method and the execution flow.

Robustness: We handle edge cases (empty responses, missing fields) explicitly.

Built by Saksham
