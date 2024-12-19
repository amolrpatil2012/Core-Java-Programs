class HelloWorldLambda
{
    public static void main(String[] args) {

        // First Syntax
        HelloWorldInterface h = ()->{

            return "Hello World";
        };

        // Another Syntax

        HelloWorldInterface g1 = ()->"Hello World";

        System.out.println(h.sayHelloWorld());
        System.out.println(g1.sayHelloWorld());

        
    }
}