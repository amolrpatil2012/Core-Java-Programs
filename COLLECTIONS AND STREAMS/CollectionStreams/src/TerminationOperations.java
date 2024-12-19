import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TerminationOperations {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Collections.addAll(list,"Rohit","Rahul","Ajinkya","Virat");

        System.out.println(list.stream().anyMatch(s->s.startsWith("R")));
        System.out.println(list.stream().allMatch(s->s.startsWith("R")));
        System.out.println(list.stream().noneMatch(s->s.startsWith("R")));

    }
}
