package javaprogramme;

public class InstanceStaticVariable4 {
    int x = 10;//Instance variable
    int y = 20;//Instance variable
    static int c = 20;//static variable
    static int f = 40;//static variable

    public static void main(String[] args) {
        //call bothinstance and static methods into main method

        InstanceStaticVariable4 obj = new InstanceStaticVariable4();
        InstanceStaticVariable4 obj2 = new InstanceStaticVariable4();

        System.out.println(obj.x);//10
        System.out.println(obj.y);//20

        Mymethod(); // 20 and 40

        }

        public void test(){
        //instance area
            System.out.println(x);
            System.out.println(y);


    }
    public static void Mymethod(){
        // static area
        System.out.println(c);
        System.out.println(f);

    }
}
