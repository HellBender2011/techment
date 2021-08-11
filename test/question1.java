package com.techment.test;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int children = 0;
		int adult = 0;
		int seniorCitizen = 0;
		
		System.out.println("Enter the number of persons");
		
		Scanner scan = new Scanner(System.in);
		int numberOfPersons = scan.nextInt();
		
		int age[]=new int[numberOfPersons];
		
		
		for(int i = 0; i<numberOfPersons; i++) {
			age[i] = scan.nextInt();
			if(age[i]<18) {
				children++;
			}else if((age[i]>=18) && (age[i] <= 54)) {
				adult++;
			}else {
				seniorCitizen++;
			}
		}
		System.out.println("Children : " + children + "\n" + "Adult : " + adult + "\n" + "Senior Citizen : " + seniorCitizen);

	}

}
