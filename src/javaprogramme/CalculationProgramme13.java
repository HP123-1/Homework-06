package javaprogramme;


import java.util.Scanner;

public class CalculationProgramme13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number");
        int n1 = in.nextInt();

        System.out.print("Input second number");
        int n2 = in.nextInt();

        System.out.print("Input third number");
        int n3 = in.nextInt();

        System.out.println("Average of three number is: " +(n1 + n2 + n3)/3);


    }
}



