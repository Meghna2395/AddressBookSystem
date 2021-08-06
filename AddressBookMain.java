package com.bridzelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
	public static Scanner scanner = new Scanner(System.in);
	public static AddressBook addressBook = new AddressBook();

	public static void main(String[] args) {	
		System.out.println("Welcome to AddressBookSYstem");
		boolean quite = false;
		printAction();
		while(!quite) {
			System.out.println("\n Enter action: (6 to show available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch (action) {
			case 1:
				System.out.println("\n Shuting down .. ");
				quite = true;
				break;
				
			case 2:
				addressBook.add();
				break;
				
			case 3:
				addressBook.update();
				break;
				
			case 4:
				addressBook.remove();
				
			case 5:
				addressBook.print();
				
			case 6:
				printAction();
				break;
	
			}
		}
	

	

	
	
}

	public static void printAction() {
		System.out.println("\nAvailable actions:\npress");
		System.out.println("1 - to shutDown\n" + 
						"2 - to add a new contact\n"+
						"3 - to update an existing contact\n"+
						"4 - to remove and existing contact\n"+
						"5 - to print existing contact\n"+
						"6 - to print a list of available actions.");
				System.out.println("Choose Your Action: ");
		
				
	}
}