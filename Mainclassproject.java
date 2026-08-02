package GOKU;

import java.util.Scanner;
import java.util.*;
public class Student {
public static void main(String[] args) {
				oop p1=new oop();
				try {
				
				p1.hash();
				System.out.println("If you want Delete any StudentDetail:enter delete OR you dont want to delete :enter dont");
				Scanner sc = new Scanner(System.in);
				String s1=sc.nextLine();
				s1=s1.toLowerCase();
				if(s1.contains("delete")) {
					System.out.println("Enter name");
					Scanner sc2=new Scanner(System.in);
				String s2=sc2.nextLine();
				System.out.println("enter id");
				Scanner sc1=new Scanner(System.in);
				int id=sc1.nextInt();
			p1.delete(s2, id);
			}
				else {
					System.out.println("you choose dont delete option");
				}
			
				}catch (InputMismatchException e) {
					System.out.println("Invalid input: please enter the expected data type (e.g. a number where a number is required).");
				} catch (NoSuchElementException e) {
					System.out.println("Input ended unexpectedly. Please provide all required values.");
				} catch (Exception e) {
					System.out.println("An unexpected error occurred: " + e.getMessage());
				}
				
			}
	}
