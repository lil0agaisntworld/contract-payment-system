# Contract Payment System

## 📌 Overview

This project is a Java application that processes contract payments by splitting a total value into installments, applying interest and payment fees using a payment service (PayPal).

---

## 🧠 Concepts Used

* Object-Oriented Programming (OOP)
* Interfaces and Abstraction
* Dependency Injection
* Separation of Concerns

---

## 🏗️ Project Structure

```
src/
 ├── application/
 ├── model/
 │    ├── entities/
 │    └── services/
```

---

## ⚙️ How It Works

1. The user inputs:

   * Contract number
   * Date
   * Total value
   * Number of installments

2. The system:

   * Splits the total amount
   * Applies monthly interest (1%)
   * Applies payment fee (2%)
   * Generates installments with due dates

---

## 💻 Example

### Input

```
Contract number: 8028
Date: 25/06/2023
Value: 600.00
Installments: 3
```

### Output

```
25/07/2023 - 206.04
25/08/2023 - 208.08
25/09/2023 - 210.12
```

---

## 🚀 Technologies

* Java
* LocalDate API

---

## 📈 Future Improvements

* Add more payment services (Strategy Pattern)
* Convert to REST API using Spring Boot
* Add unit tests with JUnit
