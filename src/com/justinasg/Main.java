package com.justinasg;

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions


public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("Antanas");
        customer.createNewCustomer("Petras", 10.0);
//        System.out.println(customer.);
    }
}

//public class Bank {
//    public ArrayList<Branch> branchList;
//
//    public Bank(ArrayList<Branch> branchList) {
//        this.branchList = branchList;
//    }
//
//    public void setBranchList(ArrayList<Branch> branchList) {
//        this.branchList = branchList;
//    }
//}
//
//public class Branch {
//    Customer customer = new Customer();
//
//    ArrayList<Customer> customerList;
//    Scanner scanner = new Scanner(System.in);
//
//    public Branch(ArrayList<Customer> customerList) {
//        this.customerList = customerList;
//    }
//
//    public void setCustomerList(ArrayList<Customer> customerList) {
//        this.customerList = customerList;
//    }
//
//    public void addNewCustomer(){
//        System.out.println("Please enter name of customer");
//        String name = scanner.nextLine();
//        if(findCustomer(name)){
//            System.out.println("This customer already exists. If you want to add transaction for this customer, please press the Y key");
//            String key = scanner.nextLine();
//            if(key == "Y"){
//                System.out.println("Please add the transaction amount");
//                String transaction = scanner.nextLine();
//                addToCustomerTransaction(name, transaction);
//            }
//        }
//
//    }
//
//    private boolean findCustomer(String customerName){
//        if(customerList.contains(customerName)){
//           return true;
//        }
//        else{
//            return false;
//        }
//    }
//
//    private void addToCustomerTransaction(String name, String transaction){
//        ArrayList<Double> transactionEntry = new ArrayList<Double>();
//        transactionEntry.add(Double.valueOf(transaction));
//        Customer cusotmer = new Customer(name, transactionEntry);
//    }
//}

