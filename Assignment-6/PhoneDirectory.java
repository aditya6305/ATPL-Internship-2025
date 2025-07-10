package com.aaslin.java.assignments.assignment6;
import java.util.*;
public class PhoneDirectory {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
        	System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String number = scanner.nextLine();
                    if(number.length()!=10) {
                    	System.out.println("Enter the 10 digit valid number");
                    }
                    else {
                    if(!map.containsValue(number)) {
                    map.put(name, number);
                    System.out.println("Contact added.");
                    }
                    else {
                    	System.out.println("Your information is already there.please try with other number");
                    }             
                    }
                    break;
                case 2:
                    System.out.print("Enter Name to Search: ");
                    String searchName = scanner.nextLine();
                    if (map.containsKey(searchName)) {
                        System.out.println("Phone Number: " + map.get(searchName));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Name to Remove: ");
                    String removeName = scanner.nextLine();
                    if (map.containsKey(removeName)) {
                        map.remove(removeName);
                        System.out.println("Contact removed.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}