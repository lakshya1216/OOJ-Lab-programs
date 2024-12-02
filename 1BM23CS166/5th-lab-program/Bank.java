import java.util.*;
class Account
{
	String customerName;
	int accountNum;
	double balance;
	
	Account(String customerName,int accountNum,double balance)
	{
		this.customerName=customerName;
		this.accountNum=accountNum;
		this.balance=balance;
	}

	void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("Balance after Deposit = "+balance);
	}

	void withdraw(double amount)
	{
		if(amount > balance)
			System.out.println("Insufficient Balance in Account");
		else
		{
			balance=balance-amount;
			System.out.println("Balance after Withdraw = "+balance);
		}
	}
	
	void getBalance()
	{
		System.out.println("Balance = "+balance);
	}
}

class savingAccount extends Account
{
	double interestRate;
	
	savingAccount(String customerName, int accountNumber, double balance, double interestRate)
	{
        	super(customerName, accountNumber, balance);
        	this.interestRate = interestRate;
    	}
	
	void calcInterest()
	{
		double interest = (super.balance*interestRate)/100;
		System.out.println("Interest is "+interest);
	}
}

class currentAccount extends Account
{
	double MIN_BALANCE = 500.0;
	double SERVICE_CHARGE = 50.0;
	
	currentAccount(String customerName, int accountNumber, double balance)
	{
        	super(customerName, accountNumber, balance);
	}

	void withdraw(double amount)
	{
		if(amount > balance)
			System.out.println("Insufficient Balance in Account");
		else if(balance-amount<MIN_BALANCE)
		{
			System.out.println("Service charge will be imposed");
			balance=balance-SERVICE_CHARGE;
			System.out.println("Balance after Service charge imposed = "+balance);
		}
		else
		{
			balance=balance-amount;
			System.out.println("Balance after Withdraw = "+balance);
		}
	}
}

class Bank
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name and Account Number And Balance, Interest Rate");
		String customerName=s.nextLine();
		int accountNum=s.nextInt();
		double balance=s.nextDouble();
		double interestRate=5;
		savingAccount sa=new savingAccount(customerName,accountNum,balance,interestRate);
		currentAccount ca=new currentAccount(customerName,accountNum,balance);
		System.out.println("Which type of account do you have?\n 1.Saving Account\n 2.Current Account");
		int type=s.nextInt();
		while(true)
		{
			System.out.println("-----------Enter your choice----------\n1.Deposit\n2.withdraw\n3.Interest Calculation\n4.Account Details\n5.Exit");
			int choice=s.nextInt();
			int count=0;
			switch(choice)
			{
				case 1:
					{
						System.out.println("Enter the amount : ");
						double amount=s.nextDouble();
						if(type==1)
							sa.deposit(amount);
						else
							ca.deposit(amount);
						break;
					}
				case 2:
					{
						System.out.println("Enter the amount : ");
						double amount=s.nextDouble();
						if(type==1)
							sa.withdraw(amount);
						else
							ca.withdraw(amount);
						break;
					}
				case 3:
					{
						if(type==1)
							sa.calcInterest();
						else
							System.out.println("not possible for current account");
						break;
					}
				case 4:
					{
						System.out.println("Customer Name "+customerName);
						System.out.println("Account Number "+accountNum);
						System.out.println("Account Type "+type);
						if(type==1)
							sa.getBalance();
						else
							ca.getBalance();
						break;
					}
				default:System.out.println("Invalid choice");
					count=1;
					break;

			}
			if(count==1)
				break;
			System.out.println("Lakshya Khandelwal\n1BM23CS166");	
		}
	}
}
