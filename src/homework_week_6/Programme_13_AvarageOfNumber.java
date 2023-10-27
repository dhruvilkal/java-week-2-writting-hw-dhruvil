package homework_week_6;

import java.util.Scanner;

/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */
public class Programme_13_AvarageOfNumber {
    public static void main(String[] args) {

        //Scanner declaration for reading input form console
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the first number :");
        double x = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double y =scanner.nextDouble();
        System.out.println("Enter the third number :");
        double z = scanner.nextDouble();
        averageOfThreeNumber(x,y,z);
        //closing scanner
        scanner.close();
    }
    // Calculation the average of three numbers
    public static void averageOfThreeNumber(double a,double y,double z ){
        double average = (a + y+ z) /3;
        System.out.print("The average of " + a + " , " + y+ " and " + z + " is : " + average);
    }

}
