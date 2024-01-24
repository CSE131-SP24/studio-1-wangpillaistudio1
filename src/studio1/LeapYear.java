package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean leap;
		Scanner in = new Scanner(System.in);
		System.out.println ("enter a year!");
		int year = in.nextInt ();
		if (year%4==0) {
			leap = true;
		}
		else {
			leap = false;
		}
		System.out.println (year + " is a leap year: " + leap );
	}
}

// boolean leap = ( year % 4 == 0 ) && (( year % 100 != 0 ) || (year % 400 == 0));