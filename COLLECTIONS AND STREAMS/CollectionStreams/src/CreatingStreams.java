import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class        CreatingStreams {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Collections.addAll(list,"Rohit","Rahul","Ajinkya","Virat");

        Stream<String> stream = list.stream();  // Creating Stream
        stream.forEach(System.out::println);    // termination of stream


        Set<Integer> integerSet = new TreeSet<>();
        Collections.addAll(integerSet,34,23,34,45);
        integerSet.stream().forEach(System.out::println);   // Creating and termination of Stream

        Stream stream1 = Stream.of(78,34,45,67);

        String a[]= {"AAA","BBB","CCC"};
        Stream stream2 = Arrays.stream(a);

        Random t = new Random();

        Stream<Integer> integerStream = Stream.generate(()->t.nextInt(100));
        integerStream.limit(100);







    }
}
