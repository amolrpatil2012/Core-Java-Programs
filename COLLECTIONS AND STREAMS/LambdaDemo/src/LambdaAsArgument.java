
interface Calculator
{
    int calculate ( int x,int y);
}
public class LambdaAsArgument {

    public static void print(Calculator calculator)
    {
        System.out.println(calculator.calculate(40,20));
    }
    public static void main(String[] args) {

        Calculator add = (x,y) -> x+y;
        Calculator sub = (x,y) ->x-y;
        print(add);
        print(sub);

    }
}
