import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product
{
    int id;
    String name;
    float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class IntermediateOperations {
    public static void main(String[] args) {

        List<Product> list = new LinkedList<>();
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(2,"Dell Laptop",30000f));
        list.add(new Product(3,"Lenovo Laptop",28000f));
        list.add(new Product(4,"Sony Laptop",28000f));
        list.add(new Product(5,"Apple Laptop",90000f));

        // Filter laptops having price greatter than 30000
        // boilerplate code
        for ( Product p : list)
            if ( p.getPrice()>=30000)
                System.out.println(p);

        // using streams
        list.stream().filter(p->p.getPrice()>30000).forEach(System.out::println);

        List<String> list1 = new LinkedList<>();
        Collections.addAll(list1,"Rohit","Rahul","Ajinkya","Virat");

        //map operationns
        list1.stream().map(p->p.toUpperCase()).forEach(System.out::println);

        list1.stream().map(p->p.toUpperCase()).filter(p->p.startsWith("R")).forEach(System.out::println);

        list1.stream().sorted().forEach(System.out::println);

        // Filter Operation
        List<String> courseList = Arrays.asList("Java","Advanced Java","Python","Core Java","C");
        courseList.stream().filter(s->s.contains("Java")).forEach(System.out::println);

        // Map Operation
        List<String> nosList = Arrays.asList("34","32","45","12");
        List<Integer> newList=nosList.stream().map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(newList);

        //flatMap Operation
        List<Integer> evns = Arrays.asList(2,4,6,8);
        List<Integer> odds =Arrays.asList(3,5,7);
        List<Integer> prims =Arrays.asList(2,3,5,7,11);
        List<Integer> nos = Stream.of(evns,odds,prims).flatMap(lt->lt.stream()).collect(Collectors.toList());

        //distinct
        List<Integer> list2 = Arrays.asList(2,4,2,4,6,7,8,8);
        list2.stream().distinct().forEach(System.out::println);

        //limit
        List<Integer> list3 = list2.stream().limit(3).collect(Collectors.toList());
        System.out.println(list3);

        //peek
        List<Integer> list4 = list2.stream().filter(n->n>3).peek(n-> System.out.println(n)).collect(Collectors.toList());

        //forEachOrdered

        list2.stream().map(n->n+10).forEachOrdered(System.out::println);

        // toArray
       Object s[] =  list2.stream().toArray();

        // reduce
        System.out.println(list2.stream().reduce((a,b)->a+b));

        //anyMatch
        System.out.println( courseList.stream().anyMatch(s1->s1.contains("Java")));
        //allMatch
        System.out.println( courseList.stream().allMatch(s2->s2.contains("Java")));
        //noneMatch
        System.out.println( courseList.stream().noneMatch(s3->s3.contains("Java")));
        // findFirst
        System.out.println( courseList.stream().findFirst());
        // findAny
        System.out.println( courseList.stream().findAny());
        // min

        System.out.println(list2.stream().min((a,b)->a.compareTo(b)));
    }
}
