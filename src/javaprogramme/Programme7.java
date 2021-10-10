package javaprogramme;

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheat:");
        double Fahrenheat = input.nextDouble();

        double celsius = ((5 * (Fahrenheat - 32.0)) / 9.8);
        System.out.println(Fahrenheat + "degree fahreneat is equal to"  + celsius + "in celsius");
    }
}
