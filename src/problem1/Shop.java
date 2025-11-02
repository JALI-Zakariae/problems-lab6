package problem1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();
            Item addItem = new Item(itemName,itemPrice,quantity);
            cart.add(addItem);
            double totalPrice = 0;
            System.out.println("====Cart's Content====================== ");

            for(int i = 0;i<cart.size();i++){
                System.out.println(cart.get(i));
                totalPrice+=cart.get(i).getPrice()*cart.get(i).getQuantity();
            }
            System.out.println("======================================== ");
            System.out.println("The total price: "+totalPrice+" €");
            System.out.println("======================================== ");
// *** create a new item and add it to the cart
            // *** print the contents of the cart object using println
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
