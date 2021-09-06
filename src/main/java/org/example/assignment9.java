package org.example;
import java.util.Scanner;

public class assignment9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double gallonOfPaint = 350;

        System.out.println("Please enter the length of the wall");
        double length = scan.nextInt();
        System.out.println("Please enter the width of the wall");
        double width = scan.nextInt();

        //calculate how many gallons of pain you would need
        double sizeOfWall = length * width;
        double amountOfGallons = sizeOfWall / gallonOfPaint;

        System.out.println("you will need to purchase " + (int)Math.ceil(amountOfGallons/ 1.0) + " gallons of paint to cover " + (int)sizeOfWall + " square feet.");
    }
}
