package javaprogramme;

import java.util.Locale;
import java.util.Scanner;

public class Programme9 {
    private static Scanner SC;

    public static void main(String[] args) {
        Programme9 object = new Programme9();
        object.upper();
    }
    public void upper(){
        String UpperStr;

        SC = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("\n entre uppercase string =");
        UpperStr = SC.nextLine();
        String UpperStr1 = UpperStr.toLowerCase();
        System.out.println("\n te lower case string =" + UpperStr1);
    }


}
