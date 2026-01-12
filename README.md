Simple Bank Account Manager

This Java program simulates a basic banking system using a HashMap to store account balances. It supports simple operations like deposit, withdrawal, and checking the balance for multiple users.

Features

Deposit: Add money to a user's account.

Withdraw: Remove money from a user's account. If the withdrawal would cause a negative balance, the account is removed.

Balance: Display the current balance of a user.

Automatic account creation: If a deposit is made for a user who does not yet exist, a new account is created automatically.

How It Works

The program stores accounts and balances in a HashMap<String, Integer> where:

Key: User's name

Value: User's account balance

The program reads a list of operations (deposit, withdraw, balance) and executes them in order.

Operations are formatted as strings in the following way:

"DEPOSIT <name> <amount>"
"WITHDRAW <name> <amount>"
"BALANCE <name>"


Example operations:

String[] operations = {
    "DEPOSIT Alice 100",
    "DEPOSIT Bob 200",
    "WITHDRAW Alice 30",
    "BALANCE Alice",
    "WITHDRAW Bob 250",
    "BALANCE Bob",
    "DEPOSIT Charlie 50",
    "BALANCE Charlie"
};


The program outputs results directly to the console for each operation.

Example Output
Alice balance: 100
Bob balance: 200
Alice balance: 70
Account has been removed due to overdraft
Account does not exist
Charlie balance: 50

Usage

Clone the repository:

git clone <repository-url>


Compile the program:

javac Main.java


Run the program:

java Main

Notes

Withdrawals that exceed the current balance remove the account entirely.

Deposits to non-existent accounts automatically create a new account.

Invalid commands are handled gracefully with an error message.
