interface Demo
{
    void show();
    default void print()
    {
        System.out.println("In Default Method");
    }
    static void print(String s1,String s2)
    {
        System.out.println(s1+" "+s2);
    }
}
public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        Demo d = ()->
        {
            System.out.println("Inside Show Method");
        };
        d.show();
        d.print();
        Demo.print("Hello", "World");


    }
}
