import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> pr =val->val>10;
        System.out.println(pr.test(100));

        // DEMO - 2

        List<Integer> nums = List.of(2,3,1,5,6,7,8,9,12);
        Predicate<Integer> pr1 = val->val>5;
        nums.stream().filter(pr1).forEach(System.out::println);


        // DEMO - 3

        var words = new ArrayList<String>();
        words.add("sky");
        words.add("warm");
        words.add("winter");
        words.add("cloud");
        words.add("pen");
        words.add("den");
        words.add("tree");
        words.add("sun");
        words.add("silk");
        Predicate<String> pr2 = val->val.length()==3;
        words.removeIf(pr2);
        System.out.println(words);
    }
}
