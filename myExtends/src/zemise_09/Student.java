package zemise_09;

public class Student extends Person {
    public Student(){}
    public void study() {
        System.out.println("用心学习每一天");
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
