\# 🏦 HighPay Bank — Java OOP Project



A console-based \*\*Bank Account Management System\*\* developed in Java as a practical project for strengthening \*\*Object-Oriented Programming (OOP)\*\* fundamentals and Java development skills.



The project simulates the core operations of a banking system, including account creation, account management, deposits, withdrawals, and transfers.



> \*\*Educational Project:\*\* This application is being developed as part of my Java learning journey, following the fundamentals covered in the Generation Java Full Stack curriculum and rebuilding the project independently in English.



\---



\## 📋 About the Project



\*\*HighPay Bank\*\* is a command-line banking application designed to simulate basic bank account management and financial operations.



The project provides a practical environment for applying Java and Object-Oriented Programming concepts to a realistic business domain.



The application is being developed progressively, starting with the command-line menu and expanding into a complete account management system.



\### Current Application



The application currently provides a console-based menu with the following operations:



```text

\------------------------------------

&#x20;     Welcome to HighPay Bank

\------------------------------------

&#x20;   1 - Create Account

&#x20;   2 - Show All Accounts

&#x20;   3 - Search Account by Number

&#x20;   4 - Update Information

&#x20;   5 - Delete Account

&#x20;   6 - Withdraw

&#x20;   7 - Deposit

&#x20;   8 - Transfer Between Accounts

&#x20;   0 - Exit



Please enter option number:

```



The menu acts as the main entry point for interacting with the application.



\---



\# 🎯 Project Goals



The main goal of this project is to strengthen my understanding of \*\*Java fundamentals and Object-Oriented Programming\*\* through hands-on development.



The project is designed to provide practical experience with:



\- Java syntax and programming fundamentals

\- Classes and objects

\- Encapsulation

\- Constructors

\- Attributes and methods

\- Access modifiers

\- Inheritance

\- Polymorphism

\- Abstract classes

\- Interfaces

\- Method overriding

\- Collections

\- Exception handling

\- User input with `Scanner`

\- Basic business rules

\- Git and GitHub development workflow



Rather than treating these concepts as isolated exercises, the project applies them to a single realistic domain: \*\*bank account management\*\*.



\---



\# 🏗️ Planned System Features



The application is being developed incrementally. The planned system will support the following operations.



\### 1. Create Account



Create a new bank account by providing information such as:



\- Account holder

\- Branch number

\- Initial balance

\- Account type

\- Account-specific information



The system will generate the account number automatically.



\### 2. Show All Accounts



Display all bank accounts registered in the system.



\### 3. Search Account by Number



Find a specific account using its account number.



\### 4. Update Account Information



Update information associated with an existing account.



\### 5. Delete Account



Remove an existing account from the system.



\### 6. Withdraw



Withdraw money from an account while respecting the account's balance and applicable withdrawal rules.



\### 7. Deposit



Add money to an existing account.



\### 8. Transfer Between Accounts



Transfer money from one bank account to another while validating the applicable transaction rules.



\---



\# 🧩 Account Model



The banking domain will be represented using object-oriented classes.



The planned account hierarchy is:



```text

&#x20;                        ┌─────────────────────┐

&#x20;                        │     BankAccount     │

&#x20;                        │                     │

&#x20;                        │ - accountNumber     │

&#x20;                        │ - branchNumber      │

&#x20;                        │ - accountType       │

&#x20;                        │ - accountHolder     │

&#x20;                        │ - balance            │

&#x20;                        └──────────┬──────────┘

&#x20;                                   │

&#x20;                    ┌──────────────┴──────────────┐

&#x20;                    │                             │

&#x20;                    ▼                             ▼

&#x20;         ┌─────────────────────┐       ┌─────────────────────┐

&#x20;         │   CheckingAccount   │       │   SavingsAccount    │

&#x20;         │                     │       │                     │

&#x20;         │ - overdraftLimit    │       │ - anniversaryDay    │

&#x20;         └─────────────────────┘       └─────────────────────┘

```



The specialized account classes will inherit common functionality from `BankAccount` while implementing behavior specific to each account type.



\---



\# 📐 UML Class Diagram



The planned object-oriented structure of the banking domain is represented below.



```mermaid

classDiagram



&#x20;   class BankAccount {

&#x20;       -int accountNumber

&#x20;       -int branchNumber

&#x20;       -int accountType

&#x20;       -String accountHolder

&#x20;       -float balance

&#x20;       +getAccountNumber() int

&#x20;       +getBranchNumber() int

&#x20;       +getAccountType() int

&#x20;       +getAccountHolder() String

&#x20;       +getBalance() float

&#x20;       +setAccountNumber(accountNumber: int) void

&#x20;       +setBranchNumber(branchNumber: int) void

&#x20;       +setAccountType(accountType: int) void

&#x20;       +setAccountHolder(accountHolder: String) void

&#x20;       +setBalance(balance: float) void

&#x20;       +withdraw(amount: float) boolean

&#x20;       +deposit(amount: float) void

&#x20;       +display() void

&#x20;   }



&#x20;   class CheckingAccount {

&#x20;       -float overdraftLimit

&#x20;       +getOverdraftLimit() float

&#x20;       +setOverdraftLimit(overdraftLimit: float) void

&#x20;       +withdraw(amount: float) boolean

&#x20;       +display() void

&#x20;   }



&#x20;   class SavingsAccount {

&#x20;       -int anniversaryDay

&#x20;       +getAnniversaryDay() int

&#x20;       +setAnniversaryDay(anniversaryDay: int) void

&#x20;       +display() void

&#x20;   }



&#x20;   BankAccount <|-- CheckingAccount

&#x20;   BankAccount <|-- SavingsAccount

```



\### Design Approach



The class hierarchy demonstrates the use of \*\*inheritance\*\* to share common account behavior.



`BankAccount` represents the common characteristics of a bank account, while:



\- `CheckingAccount` adds checking-account-specific functionality such as an overdraft limit.

\- `SavingsAccount` adds savings-account-specific information such as the account anniversary date.



This structure also provides an opportunity to practice \*\*polymorphism\*\* and \*\*method overriding\*\*.



\---



\# 💻 Application Entry Point



The application currently starts from the `Menu` class:



```java

package bank\_account;



public class Menu {



&#x20;   public static void main(String\[] args) {

&#x20;       // Application entry point

&#x20;   }

}

```



The `main()` method creates a `Scanner` object to receive user input and displays the main application menu.



The menu uses a `switch` statement to determine which operation the user selected.



\---



\# 📂 Project Structure



The project is organized around the Java package:



```text

src/

└── bank\_account/

&#x20;   └── Menu.java

```



As the application evolves, the package will contain the domain classes required to implement the complete banking system:



```text

src/

└── bank\_account/

&#x20;   ├── Menu.java

&#x20;   ├── BankAccount.java

&#x20;   ├── CheckingAccount.java

&#x20;   ├── SavingsAccount.java

&#x20;   └── ...

```



The structure will evolve as new functionality is implemented.



\---



\# 🛠️ Technologies



The project currently uses:



\- \*\*Java\*\*

\- \*\*Java OOP\*\*

\- \*\*Java Collections\*\*

\- \*\*Java `Scanner`\*\*

\- \*\*Git\*\*

\- \*\*GitHub\*\*

\- \*\*Eclipse IDE\*\*



\### Java Version



\*\*JDK 21+\*\*



\---



\# 🚀 Getting Started



\## Prerequisites



Before running the project, make sure you have installed:



\- \[Java JDK 21+](https://www.oracle.com/java/technologies/downloads/#java21)

\- \[Eclipse IDE](https://eclipseide.org/) or another Java-compatible IDE

\- Git



Verify your Java installation:



```bash

java -version

```



\---



\# 📥 Clone the Repository



Clone the repository using Git:



```bash

git clone <https://github.com/daniellecaricati/java-bank-account-oop.git>

```



Navigate into the project directory:



```bash

cd java-bank-account-oop

```



Then open the project in Eclipse.



\---



\# ▶️ Running the Application



\### Using Eclipse



1\. Open \*\*Eclipse IDE\*\*.

2\. Import the project into your workspace.

3\. Open:



```text

src → bank\_account → Menu.java

```



4\. Right-click `Menu.java`.

5\. Select:



```text

Run As → Java Application

```



6\. The HighPay Bank menu will appear in the console.



You can then enter the corresponding number to interact with the application.



\---



\# 🧪 Example



When the application starts, the console displays:



```text

\------------------------------------

&#x20;     Welcome to HighPay Bank

\------------------------------------

&#x20;   1 - Create Account

&#x20;   2 - Show All Accounts

&#x20;   3 - Search Account by Number

&#x20;   4 - Update Information

&#x20;   5 - Delete Account

&#x20;   6 - Withdraw

&#x20;   7 - Deposit

&#x20;   8 - Transfer Between Accounts

&#x20;   0 - Exit



Please enter option number:

```



Selecting an option currently displays the corresponding operation.



As development progresses, each menu option will be connected to its respective banking functionality.



\---



\# 📚 OOP Concepts



This project is specifically designed to reinforce the following Object-Oriented Programming concepts.



\### Encapsulation



Keeping an object's data private and controlling access through methods such as getters and setters.



\### Inheritance



Creating specialized account types that inherit common functionality from `BankAccount`.



```text

BankAccount

&#x20;   │

&#x20;   ├── CheckingAccount

&#x20;   │

&#x20;   └── SavingsAccount

```



\### Polymorphism



Allowing different account types to provide their own implementation of shared operations.



For example, withdrawal behavior can differ between a checking account and a savings account.



\### Abstraction



Representing the essential characteristics and behaviors of a bank account while hiding unnecessary implementation details.



\### Interfaces



Using interfaces to define common contracts between classes when appropriate.



\---



\# 🔄 Development Roadmap



The project is being developed incrementally to reinforce each Java concept as it is introduced.



\### Phase 1 — Application Setup



\- \[x] Create Java project

\- \[x] Create `bank\_account` package

\- \[x] Create `Menu` class

\- \[x] Create application entry point

\- \[x] Implement command-line menu

\- \[x] Implement user input with `Scanner`

\- \[x] Implement menu navigation



\### Phase 2 — Account Domain



\- \[ ] Create `BankAccount`

\- \[ ] Define account attributes

\- \[ ] Implement getters and setters

\- \[ ] Implement account creation

\- \[ ] Implement account display



\### Phase 3 — Account Operations



\- \[ ] Implement account search

\- \[ ] Implement account updates

\- \[ ] Implement account deletion

\- \[ ] Implement deposits

\- \[ ] Implement withdrawals

\- \[ ] Implement transfers



\### Phase 4 — OOP Specialization



\- \[ ] Create `CheckingAccount`

\- \[ ] Create `SavingsAccount`

\- \[ ] Implement inheritance

\- \[ ] Implement method overriding

\- \[ ] Apply polymorphism

\- \[ ] Introduce interfaces where appropriate



\### Phase 5 — Validation \& Error Handling



\- \[ ] Validate user input

\- \[ ] Validate account operations

\- \[ ] Handle invalid transactions

\- \[ ] Handle insufficient balance

\- \[ ] Handle invalid account numbers

\- \[ ] Improve application robustness



\---



\# 🌱 Learning Journey



This project is part of my broader journey toward becoming a professional \*\*Software Engineer and AI Engineer\*\*.



The purpose is not simply to create a functioning banking application, but to strengthen the engineering fundamentals required to build larger and more complex systems.



The learning progression includes:



```text

Java Fundamentals

&#x20;      ↓

Object-Oriented Programming

&#x20;      ↓

Data Structures \& Algorithms

&#x20;      ↓

Git \& Software Engineering

&#x20;      ↓

Spring Boot

&#x20;      ↓

REST APIs

&#x20;      ↓

SQL \& PostgreSQL

&#x20;      ↓

Testing \& Security

&#x20;      ↓

Docker \& Cloud

&#x20;      ↓

System Design

&#x20;      ↓

AI / Machine Learning

```



This project represents one of the foundations of that journey.



\---



\# 🤝 Contributing



This is primarily an educational project, but feedback and suggestions are welcome.



If you find an issue or have an idea for improvement, feel free to:



\- Open an \*\*Issue\*\*

\- Submit a \*\*Pull Request\*\*

\- Suggest improvements

\- Share the project with other developers learning Java



\---



\# 👨‍💻 Author



\*\*Danielle Caricati\*\*



Software Engineering Student |  Full-Stack Developer | Aspiring AI Engineer



This project was developed as part of my continuous learning journey in software engineering, with a focus on strengthening \*\*Java, Object-Oriented Programming, problem-solving, and professional development practices\*\*.



\---



⭐ \*\*Thanks for visiting the project.\*\*



\*\*HighPay Bank — Your future starts here!\*\*

