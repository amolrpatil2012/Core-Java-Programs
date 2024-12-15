class Calculator<T extends Number> {
    private T number;

    public Calculator(T number) {
        this.number = number;
    }

    public double getSquare() {
        return number.doubleValue() * number.doubleValue();
    }
}
public class BoundedTypeDemo {

    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>(5);
        System.out.println("Square of 5: " + intCalc.getSquare());

        Calculator<Double> doubleCalc = new Calculator<>(3.5);
        System.out.println("Square of 3.5: " + doubleCalc.getSquare());
    }
    
}
