package javaprogramme;

import java.util.Scanner;

public class Programme10 {

    public static void main(String[] args) {
        int i, k;
        Scanner SC = new Scanner(System.in);
        System.out.println("entre the number for the table");
        int n = SC.nextInt();
        for (i = 1; i <= 10; i++) {

            k = n * i;
            System.out.println(n + "*" + i + "=" + k);
        }


    }
}
