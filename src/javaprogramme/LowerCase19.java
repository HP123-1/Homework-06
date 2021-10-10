package javaprogramme;

import java.util.Locale;

public class LowerCase19 {
    // programme to convert a string to lowercase
    public static void main(String[] args) {

        LowerCase19 convert = new LowerCase19();
        convert.Lower();

    }
    public void Lower(){

        String S1 = new String("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        // CONVERT TO LOWERCASE
        System.out.println(S1.toLowerCase());
    }
}
