
class Student
{
    int roll;
    String name;


    Student setRoll(int roll)
    {
        this.roll= roll;
        return this;
    }
    Student setName(String name)
    {
        this.name = name;
        return this;
    }
    void display()
    {
        System.out.println(roll);
        System.out.println(name);
    }

}
public class MethodChaining {
    public static void main(String[] args) {
        Student s=  new Student();
        s.setRoll(10).setName("AAA").display();  // Method Chaining
    }
}
