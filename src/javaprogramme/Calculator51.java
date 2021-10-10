package javaprogramme;

public class Calculator51 {
    public static void main(String[] args) {
        Calculator51 object = new Calculator51();
        object.addition(10,20);//30
        object.sub(25,20);//5
        multi(5,5);//25
        divide(50,5);//10


    }

    public void addition(int a, int b){
        System.out.println(a+b);

    }
    public void sub( int c , int d){
        System.out.println(c-d);


    }
    public static void multi(int e,int f){
        System.out.println(e * f);

    }
    public static void divide(int h,int i){
        System.out.println(h/i);
    }
}
