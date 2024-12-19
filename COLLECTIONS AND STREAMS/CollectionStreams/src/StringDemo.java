import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StringDemo {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        Collections.addAll(strings,"abc","","bcd","","defg","jk");


        // Count no of strings having length more than 3
        System.out.println(strings.stream().filter(x->x.length()>3).count());

        // count no of strings starting with a
        System.out.println(strings.stream().filter(x->x.startsWith("a")).count());

        //remove all empty strings
        List<String> filteredStrings =strings.stream().filter(x->x.length()!=0).collect(Collectors.toList());
        System.out.println(filteredStrings);

        // convert to uppercase and join by comma
        String s= strings.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));



    }
}
