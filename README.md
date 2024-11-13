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
   
   ```sh
   java -cp ".;.\json-20240303.jar" CurrencyConverter 100 USD INR
