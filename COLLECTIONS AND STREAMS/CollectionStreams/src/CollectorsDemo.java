import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        // Collectors.toList
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,6);
        System.out.println(integers.stream().map(x->x*x).collect(Collectors.toList()));

        //Collectors.toSet
         System.out.println(integers.stream().map(x->x*x).collect(Collectors.toSet()));

         //Collectors.toColelction
         System.out.println(integers.stream().filter(x->x%2==0).collect((Collector<? super Integer, Object, LinkedList<Object>>) Collectors.toCollection(LinkedList::new)));

        // Collectors.counting
        System.out.println(integers.stream().map(x->x*x).collect(Collectors.counting()));

        // Collectors.minBy
        System.out.println(integers.stream().map(x->x*x).collect(Collectors.minBy(Comparator.reverseOrder())));

        // Collectors.partitionBy
        Map<Boolean,List<Integer>> collect1 = integers.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(collect1.get(Boolean.TRUE));

        // Collectors.joiningBy



    }
}
