package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //making new scanner
	Scanner scan = new Scanner(System.in);
    //asking user question
	System.out.print("How many days in the month? ");
	//getting user input
	int month = scan.nextInt();

	//switch statements for user inputs
	String monthName;
	switch (month) {
        case 30: monthName = "September, April, June, November";
        break;
        case 31: monthName = "January, March, July, August, October, December";
        break;
        case 28: monthName = "February";
        break;
        case 29: monthName = "February";
        //if user enters anything else they get this reply
        default: monthName = "There are no months with exactly " + month + " days";
    }
        System.out.println(monthName);

    }
}
