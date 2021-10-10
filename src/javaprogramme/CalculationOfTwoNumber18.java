package javaprogramme;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class CalculationOfTwoNumber18 {
    public static void main(String[] args) {
        CalculationOfTwoNumber18 adding = new CalculationOfTwoNumber18();
        adding.sum();


    }

    public void sum() {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number : ");
        int n1 = in.nextInt();

        System.out.print("Input second number: ");
        int n2 = in.nextInt();
        System.out.println("n1 + " + " " + n2 + " = " + (n1 + n2));

        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println(n1 + " * " + n2 + " - " + " = " + (n1 * n2));
        System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
        System.out.println(n1 + "mod" + n2 + " = " + (n1 % n2));


    }
};


