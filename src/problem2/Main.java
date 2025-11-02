package problem2;

public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer("Zakariae");
        Customer customer2 = new Customer("Yassine");
        Customer customer3 = new Customer("Adam");
        customer1.addTransaction(1500);
        customer1.addTransaction(4500);
        customer2.addTransaction(500);
        customer2.addTransaction(15500);
        customer3.addTransaction(5070.25);
        customer3.addTransaction(47090);
        Bank bmce = new Bank("BMCE");
        bmce.addCustomer(customer1);
        bmce.addCustomer(customer2);
        bmce.addCustomer(customer3);
        bmce.addTransaction(customer1,customer2,260);
        System.out.println(bmce);
        bmce.addTransaction(customer1,customer3,80000);
        System.out.println(bmce);

    }
}
