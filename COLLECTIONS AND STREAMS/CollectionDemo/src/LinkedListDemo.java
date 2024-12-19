import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Adding Elements to Linked List

        LinkedList<String> friends = new LinkedList<>();
        friends.add("Sachin");
        friends.add("KG");
        friends.add("Rahul");
        friends.add("Suraj");
        System.out.println(friends);
        friends.addFirst("Sid");
        friends.addLast("Yogesh");
        System.out.println(friends);

        // Retrieving List Elements

        System.out.println(friends.get(4));
        System.out.println(friends.getFirst());
        System.out.println(friends.getLast());

        // Removing List Elements
        System.out.println("Before Removing" + friends);
        friends.removeFirst();
        System.out.println("After Removing First Element " + friends);
        friends.remove();
        System.out.println("After using remove function " + friends);
        friends.removeIf(friend->friend.startsWith("R"));
        System.out.println("After using removeIf function " + friends);

        // Searching
        System.out.println(friends.indexOf("Suraj"));
        System.out.println(friends.lastIndexOf("Suraj"));
        System.out.println(friends.contains("Suraj"));

        // Iterating

        LinkedList<String> humanSpecies = new LinkedList<>();

        humanSpecies.add("Homo Sapiens");
        humanSpecies.add("Homo Neanderthalensis");
        humanSpecies.add("Homo Erectus");
        humanSpecies.add("Home Habilis");

        // java 8 foreach using Lambda Expression

        humanSpecies.forEach(name-> System.out.println(name));

        // using iterator

        System.out.println("using iterator");
        Iterator<String> stringIterator = humanSpecies.iterator();
        while ( stringIterator.hasNext()) {
            System.out.println(stringIterator.next());

        }

        // using iterator and java 8 foreachremaining
        stringIterator = humanSpecies.iterator();
        System.out.println("using iterator and java 8 foreachremaining");
        stringIterator.forEachRemaining(specis -> System.out.println(specis));

        // using descendent iterator
        System.out.println("using descendent iterator");
        stringIterator = humanSpecies.descendingIterator();
        while ( stringIterator.hasNext())
            System.out.println(stringIterator.next());

        // using descendent iterator and foreachremaining
        stringIterator = humanSpecies.descendingIterator();
        stringIterator.forEachRemaining(name-> System.out.println(name));






    }
}
