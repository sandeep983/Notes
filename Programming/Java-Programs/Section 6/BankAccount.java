/*
Create a new class for a bank account.
Create fields for the account number, balance, customer name, email and phone number.

Create getters and setters for each field.

Create two additional methods.
1. To allow the customer to deposit funds (this should increment the balance field).
2. To allow the customer to withdraw funds. This should deduct from the balance field,
but not allow the withdrawal to complete if their are insufficient funds.
You will want to create various code in the Main class (the one created by IntelliJ) to
confirm your code is working.
Add some System.out.println's in the two methods above as well. 
*/

class Account {
    private String Number;
    private double Balance;
    private String customerName;
    private String customerEmail;
    private long customerPhone;

    //Constructor
    public Account() {

        this("038101503014", 2000D, "Sandeep Patel", "sandeeppatel8878@gmail.com", 8878188983L);
        System.out.println("Empty constructor called");
    }

    //Parameterized Constructor
    public Account(String number, double balance, String customer_name, String customer_email, long customer_phone) {
        this.Number = number;
        this.Balance = balance;
        this.customerName = customer_name;
        this.customerEmail = customer_email;
        this.customerPhone = customer_phone;
        System.out.println("Constructor with parameter is called");
    }

    /*setters and getters*/
    //Account Number
    public void setNumber(String number) {
        this.Number = number;
    }
    public String getNumber() {
        return this.Number;
    }

    //Account Balance
    public void setBalance(double balance) {
        this.Balance = balance;
    }
    public double getBalance() {
        return this.Balance;
    }

    //Customer Name
    public void setCustomerName(String customer_name) {
        this.customerName = customer_name;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    //Customer Email
    public void setCustomerEmail(String customer_email) {
        this.customerEmail = customer_email;
    }
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    //Customer Phone
    public void setCustomerPhone(long customer_phone) {
        this.customerPhone = customer_phone;
    }
    public long getCustomerPhone() {
        return this.customerPhone;
    }


    //Deposit Funds method
    public void depositFunds(double deposit_amount) {
        this.Balance += deposit_amount;
        System.out.println("Deposit of " + deposit_amount + " is successful.\nCurrent balance is " + this.Balance);
    }


    //Withdraw Funds method
    public void withdrawFunds(double withdraw_amount) {
        if(withdraw_amount > this.Balance) {
            System.out.println("Insufficient funds. Withdrawal not processed.");
            System.out.println("Current balance is " + this.Balance);
        }
        else {
            this.Balance -= withdraw_amount;
            System.out.println("Withdrawal of " + withdraw_amount + " is processed.\nRemaining balance is " + this.Balance);
        }
    }


    public static void main(String args[]) {
        Account sandeepsAccount = new Account();

        //trying with default values
        System.out.println("Account Number: " + sandeepsAccount.getNumber());
        System.out.println("Account Balance: " + sandeepsAccount.getBalance());
        System.out.println("Customer Name: " + sandeepsAccount.getCustomerName());
        System.out.println("Customer Email: " + sandeepsAccount.getCustomerEmail());
        System.out.println("Customer Phone: " + sandeepsAccount.getCustomerPhone());

        //withdrawing funds
        sandeepsAccount.withdrawFunds(2000D);

        //depositing funds
        sandeepsAccount.depositFunds(30000D);

        //parameterized constructor
        Account bhupendrasAccount = new Account("987654", 500000D, "Bhupendra Patel", "bhupendra@gmail.com", 9876543210L);
        bhupendrasAccount.withdrawFunds(20000D);
    }
}
