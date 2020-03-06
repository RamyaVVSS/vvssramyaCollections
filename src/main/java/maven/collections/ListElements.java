package maven.collections;

import java.util.Scanner;

public class ListElements {
	static Scanner sc = new Scanner(System.in);
	public static void add(ListCollections<Object> list) { 
		System.out.println("Choose the datatype you want to insert in the list");
		System.out.println("1.Integer");
		System.out.println("2.String");
		System.out.println("3.Float");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter an integer value");
			list.add(sc.nextInt());
			break;
		case 2:
			System.out.println("Enter a string value");
			list.add(sc.next());
			break;
		case 3:
			System.out.println("Enter a float value");
			list.add(sc.nextFloat());
			break;
		default:
			System.out.println("Invalid input");
		}
	}
	
}