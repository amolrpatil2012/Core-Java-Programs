import java.util.List;
import java.util.function.Consumer;

public class ConsumerForEachDemo {
    public static void main(String[] args) {
        
        Consumer<String> t = value->System.out.println(value.toLowerCase());
        List<String> words = List.of("AMOL","SACHIN");
        words.forEach(t);

        // Another Way

        words.forEach( new Consumer<String>(){

          
            public void accept(String s)
            {
                System.out.println(s.length());
            }
        });

        // Another Way

        
        words.forEach( (s)->{

                System.out.println(s.length());
            
        });

    }
}
