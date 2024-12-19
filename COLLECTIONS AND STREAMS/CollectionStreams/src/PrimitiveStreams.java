import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(56,89,56,45);
        //IntStream.range(10,20).m

        System.out.println(intStream.sum());
        System.out.println(intStream.min());
        System.out.println(intStream.max());
        System.out.println(intStream.average());

        System.out.println(IntStream.range(1,100).filter(i->i%2==0).sum());
    }
}
