public class ConcatLambda {
    public static void main(String[] args) {
        ConcatInterfaceLambda l =(String s1,String s2)->s1+s2;
        System.out.println(l.concat("Hello", " How Are You"));
    }
}
