package bank.management;
import java.util.Scanner;
import java.util.HashMap;

public class BankManagement {

    public static void main(String[] args) {
        
        HashMap<String, Integer> acc = new HashMap<String, Integer>(); 
        Scanner in = new Scanner(System.in);
        
        
        // Account balance
        double balance = 5000.0;
        Scanner scanner = new Scanner(System.in);
        // User input for options
        System.out.print("Press 1 to proceed:");
        int input = scanner.nextInt();
        Scanner scan = new Scanner(System.in);
        
        
        
        // Check if the entered PIN code is correct
        if (input == 1) {
            // Display menu options
            System.out.println("*****Welcome to our ATM machine. Please select an option:*****");
            System.out.println("1. Create new Account");
            System.out.println("2. Check balance");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("5. Exit");
            
            // User input for menu option
            System.out.print("Enter Here: ");
            int option = scanner.nextInt();
            while (input != 5)
        {
            // Perform selected operation
            if(option == 1)
            {
                    System.out.println("*****Welcome! Please enter your credentials below*****");
                    System.out.println("Full Name (F/M/L): ");                   
                    String fn = scan.next();
                    System.out.println("Age: ");
                    int age = scan.nextInt();
                    System.out.println("Birthday: ");
                    String bday = scan.next();
                    System.out.println("Marital Status: ");
                    String ms = scan.next();
                    System.out.println("Address: ");
                    String add = scan.next();
                    System.out.println("Contact number: ");
                    int num = scan.nextInt();
                    System.out.println("Desired PIN: ");                   
                    Integer a = scan.nextInt();
                    System.out.println("Name: "+fn); 
                    System.out.println("Age: "+age); 
                    System.out.println("Birthday: "+bday); 
                    System.out.println("Marital Status: "+ms); 
                    System.out.println("Address: "+add); 
                    System.out.println("Contact Number: "+num); 
//                    System.out.println("*****Welcome to our ATM machine. Please select an option:*****");
//                    System.out.println("1. Create new Account");
//                    System.out.println("2. Check balance");
//                    System.out.println("3. Withdraw");
//                    System.out.println("4. Deposit");
//                    System.out.println("5. Exit");
            
            }
            else if (option == 2)
            {
                    System.out.println("Your current balance is: $" + balance);}
                    else if (option == 3){
                    System.out.println("Enter the amount you wish to withdraw:");
                    double amount = scanner.nextDouble();
                    if (amount > balance) {
                        System.out.println("Insufficient funds");
                    } else {
                        balance -= amount;
                        System.out.println("Please take your cash. Your remaining balance is: $" + balance);
                    }
                    System.out.println("*****Welcome to our ATM machine. Please select an option:*****");
            System.out.println("1. Create new Account");
            System.out.println("2. Check balance");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("5. Exit");
            }
            else if (option == 4)
            {
                    System.out.println("Enter the amount you wish to deposit:");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("Your new balance is: $" + balance);
                    System.out.println("*****Welcome to our ATM machine. Please select an option:*****");
            System.out.println("1. Create new Account");
            System.out.println("2. Check balance");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("5. Exit");
            }
            else if (option == 5)
            {
                    System.out.println("Thank you for using our ATM machine. Goodbye!");
                    System.out.println("*****Welcome to our ATM machine. Please select an option:*****");
            System.out.println("1. Create new Account");
            System.out.println("2. Check balance");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("5. Exit");
            }                                                      
            else 
            {
                    System.out.println("Invalid option selected");
                    System.out.println("*****Welcome to our ATM machine. Please select an option:*****");
            System.out.println("1. Create new Account");
            System.out.println("2. Check balance");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("5. Exit");
            }
        }
        }
        else 
        {
            System.out.println("Incorrect PIN code. Please try again.");
                System.out.println("*****Welcome to our ATM machine. Please select an option:*****");
            System.out.println("1. Create new Account");
            System.out.println("2. Check balance");
            System.out.println("3. Withdraw");
            System.out.println("4. Deposit");
            System.out.println("5. Exit");
        }
        
    }

}

