import java.util.*;

public class Check {
    public static void main(String[] args) {

      Map<Integer,String> map = new TreeMap<>();

      map.put(3 , "Rohit");
      map.put(2,"Rahul");
      map.put(2,"Rohit");
      map.put(4,null);

      for ( Map.Entry<Integer,String>  e :  map.entrySet() )
        {
            System.out.println( e.getKey());
            System.out.println( e.getValue());
        }



    }
}
