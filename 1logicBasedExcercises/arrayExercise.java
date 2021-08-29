import java.util.Scanner;

public class arrayExercise {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]=new int[5];
		int total = 0;
		int minMark = 100;
		int maxMark = 0;
		int count = 0;
		System.out.println("Enter your marks");
		for(int i = 0; i<5; i++) {
			
			//taking input
			Scanner scan = new Scanner(System.in);
			int mark = scan.nextInt();
			marks[i] = mark;
			
			//calculating total
			total += mark;
			
			//min and max marks
			if(i == 0) {
				minMark = mark;
				maxMark = mark;
			}else if(mark<minMark) {
				minMark = mark;
			}else if(mark>maxMark) {
				maxMark = mark;
			}
			
			//fail/pass check
			if(mark>40) {
				count++;
			}
			
			//second highest mark
			int mark1 = 0;
			int mark2 = 0;
			int mark3 = 0;
			int secondHighest = 0;
			for(int k = 0; k<5; k++) {
				if(marks[k] != maxMark && marks[k] != minMark) {
					if(mark1 == 0) {
						mark1 = marks[k];
					}else if(mark2 == 0) {
						mark2 = marks[k];
					}else {
						mark3 = marks[k];
					}
				}
			}if( mark1 >= mark2 && mark1 >= mark3) {
				secondHighest = mark1;
		      }else if (mark2 >= mark1 && mark2 >= mark3) {
		    	secondHighest = mark2;  
		      }else {
		        secondHighest = mark3;
		      }
		
		//display of marks
		for(int j = 0; j<5; j++) {
			System.out.println(marks[j]);
		}System.out.println("Maximum marks is" + maxMark);
		System.out.println("Minimum marks is" + minMark);
		System.out.println("Second highest mark is" + secondHighest);
		System.out.println(total);
		if(count>4) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
}
