import java.util.*;

class ATM{
double balance;

ATM(double balance){
this.balance=balance;
}

void deposit(double amount){
if(amount<=0){
throw new IllegalArgumentException("Amount must be greater than 0");
}
balance+=amount;
System.out.println("Deposit Successful! New Balance: "+balance);
}

void withdraw(double amount){
if(amount<=0){
throw new IllegalArgumentException("Amount must be greater than 0");
}
if(amount>balance){
throw new ArithmeticException("Insufficient Balance!");
}
balance-=amount;
System.out.println("Withdrawal Successful! New Balance: "+balance);
}

void checkBalance(){
System.out.println("Available Balance: "+balance);
}
}

public class Main2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
ATM atm=new ATM(10000);  

while(true){
try{
System.out.println("\n----- ATM MENU -----");
System.out.println("1. Check Balance");
System.out.println("2. Deposit");
System.out.println("3. Withdraw");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");

int ch=sc.nextInt();

switch(ch){
case 1:
atm.checkBalance();
break;

case 2:
System.out.print("Enter amount to deposit: ");
double d=sc.nextDouble();
atm.deposit(d);
break;

case 3:
System.out.print("Enter amount to withdraw: ");
double w=sc.nextDouble();
atm.withdraw(w);
break;

case 4:
System.out.println("Thank you for using ATM!");
return;

default:
System.out.println("Invalid choice! Try again.");
}
}

catch(InputMismatchException e){
System.out.println("Invalid input! Please enter numbers only.");
sc.nextLine(); 
}

catch(IllegalArgumentException e){
System.out.println("Error: "+e.getMessage());
}

catch(ArithmeticException e){
System.out.println("Error: "+e.getMessage());
}

catch(Exception e){
System.out.println("Unexpected Error: "+e.getMessage());
}
}
}
}

