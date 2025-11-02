package problem2;
import java.util.*;

public class Customer {
    private String name;
    private List<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public List<Double> getTransactions() {
        return transactions;
    }
    public void addTransaction(double amount){
        transactions.add(Double.valueOf(amount));

    }
}
