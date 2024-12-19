import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> s = (str)->System.out.println(str.toLowerCase());
        s.accept("HELLO");

        Consumer<String> s1 = (value) ->
        {
            System.out.println(value);
            System.out.println(value);
        };
        s1.accept("Hello World");

        IntConsumer i = val->System.out.println(val*val*val);
        i.accept(100);
    }
}
