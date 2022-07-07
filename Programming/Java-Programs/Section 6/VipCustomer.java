/*
Create a new class VipCustomer
it should have 3 fields name, credit limit, and email address.
create 3 constructors
1st constructor empty should call the constructor with 3 parameters with default values
2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
3rd constructor should save all fields.
create getters only for this using code generation of intellij as setters wont be needed
test and confirm it works.
*/

class VipCustomer {
    private String customerName;
    private int creditLimit;
    private String emailAddress;
    
    //Default Constructor/ No arg constructor
    public VipCustomer() {
        this("Default Name", 1, "Default@gmail.com");
        System.out.println("Default Constructor called");
    }
    
    //Constructor with 2 parameteres
    public VipCustomer(String customer_name, int credit_limit) {
        this(customer_name, credit_limit, "Default@gmail.com");
        System.out.println("Constructor with 2 parameters called");
    }

    //constructor with 3 parameteres
    public VipCustomer(String customer_name, int credit_limit, String email_address) {
        this.customerName = customer_name;
        this.creditLimit = credit_limit;
        this.emailAddress = email_address;
        System.out.println("Constructor with three parameters is called");
    }


    //getters
    public String getCustomerName() {
        return this.customerName;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }


    public static void main(String args[]) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println("Customer 1: " + customer1.getCustomerName() + ", " + customer1.getCreditLimit() + ", " + customer1.getEmailAddress());
        
        VipCustomer customer2 = new VipCustomer("Sandeep", 100000);
        System.out.println("Customer 2: " + customer2.getCustomerName() + ", " + customer2.getCreditLimit() + ", " + customer2.getEmailAddress());
        
        VipCustomer customer3 = new VipCustomer("Surbhi", 100000, "surbhi@gmail.com");
        System.out.println("Customer 3: " + customer3.getCustomerName() + ", " + customer3.getCreditLimit() + ", " + customer3.getEmailAddress());
    }
}
