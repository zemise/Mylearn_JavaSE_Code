package zemise_02;

public class Student {
    private String name;
    int age;
    public String address;

    //构造方法，一个私有，一个默认，两个公共
    public Student() {
    }

    private Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    //成员方法，一个私有，四个公共
    private void function() {
        System.out.println("function");
    }

    public void method1() {
        System.out.println("method1");
    }

    public void method2(String name) {
        System.out.println(name);
        System.out.println("method2");
    }

    public String method3(String name, int age) {
        System.out.println(name + ": " + age);
        System.out.println("method3");

        return name + "=======" + age;
    }

    public void method4() {
        System.out.println("method4");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
