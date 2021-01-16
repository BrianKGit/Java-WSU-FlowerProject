/**
 * @author Brian Klein
 * Date: 8/28/17
 * Program: FlowerClient.java
 * Description: Client program
 */

import java.util.Scanner;
import java.util.ArrayList;

public class FlowerClient {
    
    static Scanner console = new Scanner(System.in);
    static final int SIZE = 3;
    
    public static void main(String [] args){
        
        //create an Arraylist of Flower
        ArrayList<Flower> list = new ArrayList<Flower>();
        
        //create 3 Flower objects based on the user input
        //and place them into the ArrayList
        for(int i=0; i<SIZE; i++) {
            System.out.print("Enter name: ");
            String name = console.next();
            System.out.print("Enter petals: ");
            int petals = console.nextInt();
            System.out.print("Enter price: ");
            double price = console.nextDouble();
            
            list.add(new Flower(name, petals, price));
            
        }
        
        //print the ArrayList
        System.out.println("\nArrayList objects");
        System.out.println(list);
        
        //print one object per line
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        
        //find the  most expensive flower
        Flower highest;
        
        highest = list.get(0); //assume the first flower is the most expensive
        
        for(int i=1; i<list.size(); i++) {
            if(list.get(i).getPrice() > highest.getPrice()){
                highest = list.get(i);
            }
        }
        
        System.out.println("\nThe most expensive flower is " + highest.getName());
        
    }//end main
    
    
}//end class
