interface ParametersDemo
{
    double getArea( int l, int w);
}

public class Parameters {
    public static void main(String[] args) {
        ParametersDemo d = (l,w) -> l*w;
        System.out.println(d.getArea(10,20));
    }
}
