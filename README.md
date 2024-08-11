# Simulation of banking transactions with checks and locks in multi-threaded mode


## Description:

## Creating bank accounts: 
The application creates a collection of bank accounts with random balances.
## Making transfers between accounts: 
Threads (Bank class objects) transfer funds between accounts. Each thread simulates the work of a separate bank department, which can perform several operations simultaneously.
## Fraud check: 
For large transfer amounts, a fraud check is performed using a random solution (since this is a simulation). If a transaction is considered suspicious, the relevant accounts are blocked.
## Processing various translation scenarios:
There are insufficient funds in the sending account.
Fraud check for large transfers.
Correct transfer and update of account balances.
## Multithreading: 
The application creates and runs multiple threads to perform parallel transfer operations, which simulates the simultaneous work of several bank employees or branches.
## Summing up: 
At the end of the flow, information is displayed on the number of successfully created accounts, completed transfers, blocked transactions and those that were not completed due to insufficient funds.


## Technologies and concepts:

## Classes and objects:
The code consists of several classes (Account, Bank, Main) that model bank accounts and money transfer operations.
The Account class represents a bank account, with fields for account number, amount of money, and lock status.
## Collections:
Collections of type HashMap are used to store Account objects by their account numbers.
## Threads (Multithreading):
The Bank class inherits the Thread class, which allows you to create threads to perform money transfer operations in parallel.
Using synchronization (synchronized methods) to prevent data races when accessing data from different threads simultaneously.
## Synchronization:
Synchronized code blocks are used to ensure that critical operations, such as transferring money between accounts, execute correctly, preventing potential errors when accessed from different threads at the same time.
## Exceptions:
Uses exception handling (try-catch) when checking for fraud (isFraud), which can throw InterruptedException.
## Working with random numbers:
Using the Random class to generate random values, both for fraud checking and for generating random transfer amounts and account numbers.
## Main program:
The Main class is responsible for initializing the program, creating bank objects, and starting multiple threads to perform operations.
