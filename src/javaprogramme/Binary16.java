package javaprogramme;

import java.util.Scanner;

public class Binary16 {

    public static void main(String[] args) {
        Binary16 objective = new Binary16();
        objective.Binary16();


    }

    public void Binary16() {

        Scanner in = new Scanner(System.in);
        System.out.println("Input first binary number :"); //1
        String x = in.next();

        System.out.println("input second binary number:");//0
        String y = in.next();

        int n1 = Integer.parseInt(x,2);
        int n2 = Integer.parseInt(y,2);
        int n3=n1+n2;
        System.out.println("sum of the binary number:" + Integer.toBinaryString(n3));//101
    }
}
