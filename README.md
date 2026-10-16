================================================================================
HIGHPAY BANK — JAVA OOP PROJECT
================================================================================

A console-based Bank Account Management System developed in Java as a practical 
project for strengthening Object-Oriented Programming (OOP) fundamentals and 
Java development skills.

The project simulates core banking operations including account creation, management, 
deposits, withdrawals, and transfers.

Educational Project: Developed as part of my Java learning journey, following 
fundamentals covered in the Generation Java Full Stack curriculum and rebuilding 
the project independently in English.


--------------------------------------------------------------------------------
📋 ABOUT THE PROJECT
--------------------------------------------------------------------------------

HighPay Bank is a command-line banking application designed to simulate basic bank 
account management and financial operations. It provides a practical environment 
for applying Java and Object-Oriented Programming concepts to a realistic business 
domain, expanding progressively from a command-line menu into a complete system.

Current Application Menu:
------------------------------------
      Welcome to HighPay Bank
------------------------------------
    1 - Create Account
    2 - Show All Accounts
    3 - Search Account by Number
    4 - Update Information
    5 - Delete Account
    6 - Withdraw
    7 - Deposit
    8 - Transfer Between Accounts
    0 - Exit

Please enter option number:


--------------------------------------------------------------------------------
🎯 PROJECT GOALS
--------------------------------------------------------------------------------

The main goal of this project is to strengthen my understanding of Java fundamentals 
and Object-Oriented Programming through hands-on development, providing practical 
experience with:

- Java syntax and programming fundamentals
- Classes, objects, and constructors
- Attributes, methods, and access modifiers
- Encapsulation, inheritance, and polymorphism
- Abstract classes and interfaces
- Method overriding
- Collections and exception handling
- User input with Scanner
- Basic business rules
- Git and GitHub development workflow


--------------------------------------------------------------------------------
🏗️ PLANNED SYSTEM FEATURES
--------------------------------------------------------------------------------

1. Create Account: Provide information (holder, branch, initial balance, type) 
   and have the system generate the account number automatically.
2. Show All Accounts: Display all registered bank accounts.
3. Search Account by Number: Find a specific account using its number.
4. Update Account Information: Modify existing account details.
5. Delete Account: Remove an account from the system.
6. Withdraw: Withdraw funds respecting balance and withdrawal rules.
7. Deposit: Add funds to an existing account.
8. Transfer Between Accounts: Transfer money between accounts with validation.


--------------------------------------------------------------------------------
🧩 ACCOUNT MODEL & CLASS HIERARCHY
--------------------------------------------------------------------------------

                     [ BankAccount ]
      (- accountNumber, - branchNumber, - accountType, - accountHolder, - balance)
                           │
            ┌──────────────┴──────────────┐
            ▼                             ▼
   [ CheckingAccount ]           [ SavingsAccount ]
   (- overdraftLimit)            (- anniversaryDay)

- CheckingAccount adds checking-specific functionality like an overdraft limit.
- SavingsAccount adds savings-specific details like an anniversary date.


--------------------------------------------------------------------------------
💻 APPLICATION ENTRY POINT
--------------------------------------------------------------------------------

package bank_account;

public class Menu {
    public static void main(String[] args) {
        // Application entry point
    }
}


--------------------------------------------------------------------------------
📂 PROJECT STRUCTURE
--------------------------------------------------------------------------------

src/
└── bank_account/
    ├── Menu.java
    ├── BankAccount.java
    ├── CheckingAccount.java
    ├── SavingsAccount.java
    └── ...


--------------------------------------------------------------------------------
🛠️ TECHNOLOGIES & REQUIREMENTS
--------------------------------------------------------------------------------

- Java / Java OOP / Java Collections / Java Scanner
- Git & GitHub
- Eclipse IDE
- JDK 21+


--------------------------------------------------------------------------------
🚀 GETTING STARTED
--------------------------------------------------------------------------------

Prerequisites:
- Java JDK 21+
- Eclipse IDE (or compatible IDE)
- Git

Clone Repository:
git clone <YOUR_REPOSITORY_URL>
cd java-bank-account-oop

Running in Eclipse:
1. Open Eclipse IDE and import the project into your workspace.
2. Navigate to: src → bank_account → Menu.java
3. Right-click Menu.java and select: Run As → Java Application.


--------------------------------------------------------------------------------
📚 OBJECT-ORIENTED PROGRAMMING CONCEPTS
--------------------------------------------------------------------------------

- Encapsulation: Keeping data private and managing access via getters/setters.
- Inheritance: Creating specialized account types from BankAccount.
- Polymorphism: Allowing different account types to implement shared operations.
- Abstraction: Representing essential characteristics while hiding internals.
- Interfaces: Defining common contracts between classes when appropriate.


--------------------------------------------------------------------------------
🔄 DEVELOPMENT ROADMAP
--------------------------------------------------------------------------------

Phase 1 — Application Setup (Project, package, menu, Scanner, navigation)
Phase 2 — Account Domain (BankAccount class, attributes, getters/setters, creation)
Phase 3 — Account Operations (Search, update, delete, deposits, withdrawals, transfers)
Phase 4 — OOP Specialization (Checking/Savings accounts, inheritance, polymorphism)
Phase 5 — Validation & Error Handling (Input validation, rule checks, robustness)


--------------------------------------------------------------------------------
🌱 LEARNING JOURNEY
--------------------------------------------------------------------------------

Progression path:
Java Fundamentals 
  ↓ Object-Oriented Programming 
  ↓ Data Structures & Algorithms 
  ↓ Git & Software Engineering 
  ↓ Spring Boot 
  ↓ REST APIs 
  ↓ SQL & PostgreSQL 
  ↓ Testing & Security 
  ↓ Docker & Cloud 
  ↓ System Design 
  ↓ AI / Machine Learning


--------------------------------------------------------------------------------
👨‍💻 AUTHOR
--------------------------------------------------------------------------------

Danielle Caricati
Software Engineering Student | Java & Full-Stack