package javaprogramme;

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        Programme5 objective = new Programme5();
        objective.calcu();
    }

    public void calcu() {
        Scanner in = new Scanner(System.in);
        double fnum, snum, answer, answer1, answer2, answer3;
        System.out.println("Enter first name: ");
        fnum = in.nextDouble();
        System.out.println("Enter second name: ");
        snum = in.nextDouble();
        answer = fnum + snum;
        answer1 = fnum - snum;
        answer2 = fnum * snum;
        answer3 = fnum / snum;
        System.out.println(answer);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);


    }

}
