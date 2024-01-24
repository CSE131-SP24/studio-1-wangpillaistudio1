package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first integer");
		int n1 = in.nextInt();
		System.out.println("Enter the second integer");
		int n2 = in.nextInt();
		double avg = (double)(n1 + n2)/2;
		System.out.println("Averge of " + n1 + " and " + n2 +" is " + avg );
		

	}

}
