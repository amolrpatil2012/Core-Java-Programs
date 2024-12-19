import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerAndThenDemo {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);

        Consumer<ArrayList<Integer>> i = (list)->{

            for ( int x =0 ; x<list.size();x++)
            list.set(x, list.get(x)+10);

        };

        Consumer<ArrayList<Integer>> p = (list)->
        {
                list.forEach(System.out::println);
        };

        i.andThen(p).accept(lst);
    }
}
