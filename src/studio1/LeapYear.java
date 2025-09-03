package studio1;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("What year would you like to check?");
int year = in.nextInt();
boolean leapYear = ((year % 4 == 0)&&(year % 100 != 0))||(year % 400 == 0);
System.out.println("The idea that " + year + " is a leap year is " + leapYear);
}
}
 