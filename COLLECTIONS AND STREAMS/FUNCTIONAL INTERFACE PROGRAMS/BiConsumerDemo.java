import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> bi = (x,y)->System.out.println(x+y);
        bi.accept(10, 20);

        HashMap<Integer,String> lst = new HashMap<Integer,String>();
        lst.put(1,"AMOL");
        lst.put(2, "SACHIN");

        BiConsumer<Integer,String> b = (x,y)->System.out.println("Roll : " + x + " Name : " + y);
        lst.forEach(b);

        //or

        lst.forEach((x,y)->System.out.println("Roll : " + x + " Name : " + y));


    }
}
