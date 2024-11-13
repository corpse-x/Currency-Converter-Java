# Currency Converter in Java

A simple currency converter built in Java using the [Alpha Vantage](https://www.alphavantage.co/) API. The program fetches real-time exchange rates to convert currency from one type to another. This project is perfect for learning how to work with APIs, JSON data, and command-line Java applications.

---

## 🚀 Features

- Convert between multiple currencies in real-time.
- Fetch exchange rates from the Alpha Vantage API.
- Supports any currency supported by Alpha Vantage.
- Easy to use via the command line.

---

## 📦 Requirements

- **Java** (JDK 23 or above)
- **JSON Library for Java** (json-20240303.jar)
- [Alpha Vantage API Key](https://www.alphavantage.co/support/#api-key)

---

## 💻 Setup & Installation

1. **Install Java 23:**
   Download and install the latest Java Development Kit (JDK) version 23 from the official [Java website](https://www.oracle.com/java/technologies/javase/jdk23-archive-downloads.html).

2. **Download the JSON Library:**
   Download the [JSON for Java](https://mvnrepository.com/artifact/org.json/json) library (json-20240303.jar) and place it in the same directory as your project.

3. **Get Alpha Vantage API Key:**
   Go to [Alpha Vantage](https://www.alphavantage.co/) and sign up for an API key. You’ll need this for the program to access real-time exchange rates.

---

## ⚙️ Usage

1. **Compile the Program:**
   Open a terminal (or command prompt) in your project directory and run the following command to compile the Java program:

   ```sh
   javac -cp ".;.\json-20240303.jar" "CurrencyConverter.java"

2. **Now to Run the code**

    ```sh 
   java -cp ".;.\json-20240303.jar" CurrencyConverter --help
    
3. __Example__
    ```sh
   java -cp ".;.\json-20240303.jar" CurrencyConverter 100 USD INR

---

## 🛠 Troubleshooting
1. No source files:
If you see an error like error: ```no source files``, make sure that the   ```CurrencyConverter.java``` file is in the correct directory and that you're running the javac command from that directory.

2. ```json-20240303.jar``` not found:
If the program can't find ```json-20240303.jar```, ensure that the JAR file is in the same directory as your ```CurrencyConverter.java``` file. Also, check that you're specifying the correct path in the classpath, as shown in the javac and java commands.

3. API Key Error:
If you get an error related to the API key, double-check that you've entered a valid Alpha Vantage API key in your ```CurrencyConverter.java``` code and that it's correctly placed.

4. No exchange rate available for certain currencies:
If the Alpha Vantage API does not support the currency pair you're trying to convert, you may receive an error message. Ensure the currencies you are trying to convert are available on the Alpha Vantage supported currencies list.

## 📧 Contact
If you have any questions or suggestions, feel free to open an issue or contact me at:

Telegram: [GHOST](https://t.me/ghost_kun)
