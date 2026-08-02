package GOKU;

import java.util.Scanner;
import java.util.*;
public class Student {
public static void main(String[] args) {
			oop p1=new oop();
				try {
				
				p1.hash();
				System.out.println("If you want Delete any StudentDetail:enter yes/no");
				Scanner sc = new Scanner(System.in);
				String s1=sc.nextLine();
				s1=s1.toLowerCase();
				if(s1.contains("yes")) {
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
				System.out.println("you want to store datas in database=enter(yes/no)");
				Scanner data = new Scanner(System.in);
				String data1 = data.nextLine();
				data1.toLowerCase();
				if(data1.contains("yes")) {
					p1.filewrite();
					System.out.println("code executed");
				}if(data1.contains("no")){
					System.out.println("System doesnt saved your datas");
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

