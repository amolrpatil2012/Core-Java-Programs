/*The Box class is defined with a type parameter T. 
This means that T can be any type 
(e.g., Integer, String, CustomClass).*/

class Gen <T1,T2>
{
  T1 name;
  T2 value;

  Gen(T1 o1,T2 o2)
  {
    name = o1;
    value = o2;
  }

  public T1 getName()
  {
    return name;
  }

  public T2 getValue()
  {
    return value;
  }

}
// Generic class definition
class Box<T> {
    private T content;

    // Constructor
    public Box(T content) {
        this.content = content;
    }

    // Getter
    public T getContent() {
        return content;
    }

    // Setter
    public void setContent(T content) {
        this.content = content;
    }

    // Method to display content
    public void displayContent() {
        System.out.println("Content: " + content);
    }
}

public class GenericsClassDemo{

    public static void main(String[] args) {
        // Creating a Box for Integer
        Box<Integer> integerBox = new Box<>(123);
        integerBox.displayContent(); // Output: Content: 123

        // Creating a Box for String
        Box<String> stringBox = new Box<>("Hello, Generics!");
        stringBox.displayContent(); // Output: Content: Hello, Generics!

        // Changing the content of the string box
        stringBox.setContent("Updated Content");
        stringBox.displayContent(); // Output: Content: Updated Content

        // Getting the content from the integer box
        Integer intContent = integerBox.getContent();
        System.out.println("Integer Content: " + intContent); // Output: Integer Content: 123

        Gen < String,Integer> obj = new Gen<>("StudyTonight",1);

        String  s = obj.getName();
        System.out.println(s);

       Integer i = obj.getValue();
       System.out.println(i);
    }
}