package javaprogramme;

public class Programme2 {
    static int a = 10; // static variable
    static int b = 20; // static variable

    public static void main(String[] args) {
        System.out.println(Programme2.a);
        System.out.println(Programme2.b);
        mymethod();

    }
    public static void mymethod(){

        System.out.println(a);
        System.out.println(b);

    }
}
