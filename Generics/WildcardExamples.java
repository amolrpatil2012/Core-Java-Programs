import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardExamples {

    // Unbounded wildcard example: accepts a list of any type
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    /*Bounded wildcard with an upper bound example: accepts a list of 
      Number or its subclasses*/

    public static double sumOfNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    /*Bounded wildcard with a lower bound example: accepts a list of 
      Integer or its superclasses*/

    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        // Unbounded wildcard example
        List<String> stringList = Arrays.asList("A", "B", "C");
        System.out.println("Unbounded wildcard example:");
        printList(stringList);
        // Output:
        // A
        // B
        // C

        // Bounded wildcard with an upper bound example
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of numbers (upper bound): " + sumOfNumbers(intList));
        // Output: Sum of numbers (upper bound): 15.0

        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println("Sum of numbers (upper bound): " + sumOfNumbers(doubleList));
        // Output: Sum of numbers (upper bound): 6.6

        // Bounded wildcard with a lower bound example
        List<Number> numberList = new ArrayList<>();
        addIntegers(numberList);
        
        for (Number num : numberList) {
            System.out.println(num);
        }
    }
}
