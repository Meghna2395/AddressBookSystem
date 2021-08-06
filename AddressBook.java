package com.bridzelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	Scanner sc = new Scanner(System.in);
	List<Contact> contacts = new ArrayList<Contact>();
	Contact contact = new Contact();

	public void add() {

		System.out.println("Enter your first name:");
		contact.firstName = sc.nextLine();

		System.out.println("Enter your last name: ");
		contact.lastName = sc.nextLine();

		System.out.println("Enter your address: ");
		contact.address = sc.nextLine();

		System.out.println("Enter your city name: ");
		contact.city = sc.nextLine();

		System.out.println("Enter your state name: ");
		contact.state = sc.nextLine();

		System.out.println("Enter your zipcode: ");
		contact.zipCode = sc.nextInt();

		System.out.println("Enter your phone number: ");
		contact.phoneNumber = sc.nextLong();

		System.out.println("Enter your email:");
		contact.email = sc.next();

		contacts.add(contact);
		System.out.println("Contact added Successfully");
		System.out.println(contacts);
	}

	public void updateMobileNumber(String name) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getFirstName().equals(name)) {
				Contact tempContact = contacts.get(i);
				System.out.println("Enter the new number to edit");
				Scanner input = new Scanner(System.in);
				long num = input.nextLong();
				tempContact.phoneNumber = num;
				contacts.set(i, tempContact);
			}
		}
	}

	public void update() {
		for (int i = 0; i < contacts.size(); i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name to edit");
			String firstName = sc.nextLine();
			updateMobileNumber(firstName);

		}
	}

	public void remove() {
		System.out.println("Enter the contact name you want to delete:");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		boolean found = false;
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getFirstName().equals(firstName)) {
				found = true;
				contacts.remove(i);
				System.out.println("Contact deleted successfully");
			}

		}

		if (found == false) {
			System.out.println("Contact not found");
		}
	}

	public void print() {
		for (int i = 0; i < contacts.size(); i++) {
			System.out.println(contacts.get(i));
		}
	}
}
