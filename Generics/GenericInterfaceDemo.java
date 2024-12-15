interface Container<T> {
    void set(T item);
    T get();
}

class Box<T> implements Container<T> {
    private T content;

    // Implementing set method
    @Override
    public void set(T item) {
        this.content = item;
    }

    // Implementing get method
    @Override
    public T get() {
        return content;
    }

    // Method to display content
    public void displayContent() {
        System.out.println("Content: " + content);
    }
}

public class GenericInterfaceDemo
{
    public static void main(String[] args) {
        
         // Creating a Box for Integer
         Container<Integer> integerBox = new Box<>();
         integerBox.set(123);
         System.out.println("Integer Content: " + integerBox.get()); // Output: Integer Content: 123
 
         // Creating a Box for String
         Container<String> stringBox = new Box<>();
         stringBox.set("Hello, Generics!");
         System.out.println("String Content: " + stringBox.get()); // Output: String Content: Hello, Generics!
 
         // Displaying content using the Box's method
         Box<String> anotherStringBox = new Box<>();
         anotherStringBox.set("Box with Generics");
         anotherStringBox.displayContent(); // Output: Content: Box with Generics
    }
    
}