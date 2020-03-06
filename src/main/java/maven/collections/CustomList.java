package maven.collections;

import java.util.List;
import java.util.Scanner;

public class CustomList {

	public static void main(String[] args) {
		ListCollections<Object> list = new ListCollections<Object>();
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag) {
			System.out.println("Choose the operation you want to perform");
			System.out.println("1.Add an element to the list");
			System.out.println("2.Remove an element");
			System.out.println("3.Length of the list");
			System.out.println("4.Retrieve the element");
			System.out.println("5.Print the elements");
			System.out.println("6.Exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				ListElements le = new ListElements();
				le.add(list); 
				System.out.println("Addded the value successfully!!");
				break;
			case 2:
				System.out.println("Enter the index of the element to be removed");
				int del_ele = sc.nextInt();
				list.remove(del_ele);
				System.out.println("Element at index " + del_ele + " removed successfully!!");
				break;
			case 3:
				System.out.println("The length of the list is " + list.length());
				break;
			case 4:
				System.out.println("Enter the index of the element to be retrieved");
				int pos = sc.nextInt();
				System.out.println("The element at index " + pos + " is " + list.get(pos));
				break;
			case 5:
				System.out.println("The elements in the list are " + list);
				break;
			case 6:
				flag = false;
				System.out.println("Thank You!!");
				break;
			default:
				System.out.println("Invalid input");
			}
		}
	}
	
}