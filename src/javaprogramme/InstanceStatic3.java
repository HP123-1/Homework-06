package javaprogramme;

public class InstanceStatic3 {
    int x = 10;// Instance variable
    static int c = 20; // static variable

    public static void main(String[] args) {
        InstanceStatic3 obj = new InstanceStatic3();
        System.out.println(obj.x);//10
        MyMethod();//30

    }
    public void test() {
        System.out.println(x);
        InstanceStatic3 obj = new InstanceStatic3();
    }

    public static void MyMethod(){
        System.out.println(c);

    }

}
