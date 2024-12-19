import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<Integer> costBeforeTax= new LinkedList<>();
        Collections.addAll(costBeforeTax,100,200,300,400,500);

        //traditional
        double total=0;
        for (Integer i : costBeforeTax)
        {
            double price = i+0.12*i;
            total+=price;
        }

        // using stream
        total = 0;
        System.out.println(costBeforeTax.stream().map(cost->cost+0.12*cost).reduce(total,(sum,cost)->sum+cost).doubleValue());


    }
}
