
interface Demo
{
    int noparameterfunction();
}

public class NoParameter {
    public static void main(String[] args) {
        Demo d = ()-> 10;
        System.out.println(d.noparameterfunction());
    }
}
