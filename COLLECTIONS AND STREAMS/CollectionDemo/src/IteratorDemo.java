import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
        {
            Integer i = it.next();
            if ( i == 30)
                it.remove();

        }
        System.out.println(list);

        ListIterator listIterator = list.listIterator();
        while ( listIterator.hasPrevious())
            System.out.println(listIterator.previous());


    }
}
