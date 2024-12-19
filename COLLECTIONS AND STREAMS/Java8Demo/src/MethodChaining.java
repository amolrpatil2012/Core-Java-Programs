class Student
{
    int roll;
    String name;
    public Student  setRoll(int x)
    {
        roll=x;
        return this;
    }
    public Student setName(String name)
    {
        this.name=name;
        return this;
    }
    public Student print()
    {
        System.out.println(roll);
        System.out.println(name);
        return this;
    }
}
public class MethodChaining {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("Amol").setRoll(10).print();
    }
}
