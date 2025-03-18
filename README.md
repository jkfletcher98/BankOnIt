# BankOnIt
ATM-esque app

## HasMenu
```
string menu()
void start()
```

## CheckingAccount
```
double balance

CheckingAccount()
	initialize balance

CheckingAccount(double balance)

void main()

string  menu()
	0) Quit
	1) Check balance
	2) Make a deposit
	3) Make a withdrawal

string start()
	string response gets menu input
	return response

double getBalance()
	return balance

string getBalanceString()

void setBalance(double balance)

void checkBalance()

private double getDouble

void makeDeposit()
	ask for amount to deposit
	add deposit to balance
	print new balance

void makeWithdrawal()
	ask for withdrawal ammount
	subtract withdrawal from balance
	print new balance
```

