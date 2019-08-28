package sorting_algorithm;

import java.util.Scanner;

class usercall {
private static Scanner scanner;
private static String name;
private static Scanner scanner1;
private static String name2;
private static Scanner scanner2;
private static String name3;
private static Scanner scanner3;
private static String name4;
private static Scanner scanner4;
private static String name5;

public static void main(String[] args) {
	
	
	System.out.println("Here are some sorting algorithm :");
	System.out.println("1) Insertion sorting");
	System.out.println("2) Bubble sorting");
	System.out.println("3) Selection sorting");
	System.out.println("4) Quick sorting");
	System.out.println("");
	System.out.println("The numbers that will be used are already stored in an array");
	System.out.println(" 1) Press enter for insertion sort");
	  scanner = new Scanner(System.in);
	  name = scanner.nextLine();  
	

	
	System.out.println("88,45,78,2,47,26,12 " + "Before Sorting");
	insertion_sorting insertion_sortingObject = new insertion_sorting();
					  insertion_sortingObject.insertionsorting();
	System.out.println("After Sorting");
	System.out.println("");
	System.out.println(" 2) Press enter for bubble sorting");
	
	
	scanner1 = new Scanner(System.in);
	name2 = scanner1.nextLine();                       
	System.out.println("128,65,45,25,84,21,54 " +" "+" "+"Before Sorting");
	System.out.println("");
	bubble_sorting bubble_sortingObject = new bubble_sorting();
				   bubble_sortingObject.bubble();
	System.out.println("                        After sorting");
	System.out.println();
	System.out.println();
	System.out.println();
	
	
	
	
			
	System.out.println(" 3) Press enter for Selection sorting");
		scanner2 = new Scanner(System.in);
		name3 = scanner2.nextLine();                       
	System.out.println("10,34,2,56,7,67,88,42 " +" "+" "+"Before Sorting");
	
	
	Selection_sorting Selection_sortingObject = new Selection_sorting();
					  Selection_sortingObject.selectionsorting();
	System.out.println("After Sorting");
	System.out.println("");
	System.out.println("");
	System.out.println("");
	
	
	
	System.out.println(" 4) Press enter for Quick sorting");
		scanner3 = new Scanner(System.in);
		name4 = scanner3.nextLine();                       
	System.out.println("24,2,45,20,56,75,256" +" "+" "+"Before Sorting");
	System.out.println("");
	Quick_sorting Quick_sortingObject = new Quick_sorting();
				  Quick_sortingObject.quicksorting();
	System.out.println("After Sorting");
	System.out.println();
	
	
	
}
}