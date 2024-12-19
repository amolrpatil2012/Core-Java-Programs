interface Temp
{
    void show();
}
public class MultipleStatements {
    public static void main(String[] args) {
        Temp t = () ->{
          System.out.println(("Inside Show Functio"));
            System.out.println(("Inside Show Functio"));

        };
        t.show();
    }
}
