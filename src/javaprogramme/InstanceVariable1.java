package javaprogramme;

//created by hinal


public class InstanceVariable1 {
    public int first;
    //declaration instance variable
    int x = 10;
    int y = 20;

    public static void main(String[] args) {
        InstanceVariable1 calling = new InstanceVariable1();
        System.out.println(calling.x);//access by object by static variable
        System.out.println(calling.y);//access by object by static variable

    }
    public void test(){
        System.out.println(x);
        System.out.println(y);

    }
}
