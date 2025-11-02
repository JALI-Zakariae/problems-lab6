package problem2;
import java.util.*;

public class Bank {
    private String name;
    private List<Customer> customers;
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }
    public void addCustomer(Customer customer){
        if (!customers.contains(customer)){
            customers.add(customer);
        }
    }
    public void addTransaction(Customer customer1,Customer customer2,double amount){
        List<Double> transactionsCustomer1 = customer1.getTransactions();
        double total = 0;
        for(int i = 0;i<transactionsCustomer1.size();i++){
            total+= transactionsCustomer1.get(i);
        }

        if (amount>=0 && amount<=total){
            customer1.addTransaction(-amount);
            customer2.addTransaction(amount);
        }
        else{
            System.out.println("Le montant est incorrect!");
        }
    }
    @Override
    public String toString(){
        StringBuilder s1 = new StringBuilder();

        for(int i = 0;i<customers.size();i++){
            s1.append("[ "+customers.get(i).getName()+" , Transactions: ");
            for (int j = 0;j<customers.get(i).getTransactions().size();j++){
                s1.append(customers.get(i).getTransactions().get(j)+"   ");
            }
            s1.append("]\n");
        }
        return s1.toString();
    }
}
