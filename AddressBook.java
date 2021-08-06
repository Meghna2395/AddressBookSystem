package com.bridzelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	Scanner sc = new Scanner(System.in);
	List<Contact> contacts = new ArrayList<Contact>();
	Contact contact = new Contact();

	public void add() {

		System.out.println("Enter your first name");
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

		System.out.println("Enter your email");
		contact.email = sc.next();

		contacts.add(contact);
		System.out.println("Contact added Successfully");
		System.out.println(contacts);
	}
	


	
		
	}
 

