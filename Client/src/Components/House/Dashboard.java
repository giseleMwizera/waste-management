package Components.House;

import Components.Payment;


import java.util.Scanner;

public class Dashboard {
    Scanner keyboard = new Scanner(System.in);


    public void handleDashboard(){
            int choice = 0;
            System.out.println("\n");
            System.out.println("--------Dashboard--------");
            System.out.println("--------Please choose an option----------");
            System.out.println("1.Pay wastes");
            System.out.println("2.Pay security");
            System.out.println("3.Your invoices");
            System.out.println("4.Notifications&messages");
            System.out.print("Your choice: ");
            choice = keyboard.nextInt();

            switch (choice){
                case 1:
                    System.out.println("You are going to pay wastes ");
                    break;
                case 2:
                    System.out.println("You are going to pay security ");
                    break;
                case 3:
                    System.out.println("invoices");
                    break;
                case 4:
                    System.out.println("Notifications&messages");
                    break;
                default:
                    System.out.println("Please be serious!");
                    break;
            }
    }
}
