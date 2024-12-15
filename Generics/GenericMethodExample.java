import java.util.Arrays;

public class GenericMethodExample {
    
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Swapping elements in an Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swap: " + Arrays.toString(intArray));
        swap(intArray, 1, 3);
        System.out.println("After swap: " + Arrays.toString(intArray));
        // Output:
        // Before swap: [1, 2, 3, 4, 5]
        // After swap: [1, 4, 3, 2, 5]

        // Swapping elements in a String array
        String[] strArray = {"A", "B", "C", "D", "E"};
        System.out.println("Before swap: " + Arrays.toString(strArray));
        swap(strArray, 0, 4);
        System.out.println("After swap: " + Arrays.toString(strArray));
        // Output:
        // Before swap: [A, B, C, D, E]
        // After swap: [E, B, C, D, A]
    }
}
