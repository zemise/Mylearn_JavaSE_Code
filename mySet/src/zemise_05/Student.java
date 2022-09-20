package zemise_05;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
//        return 0;
//        return 1;
//        return -1;
        //按照年龄从小到大排序
        int num = this.age - o.age;
//        int num = o.age - this.age;
        int num2 = num == 0 ? this.name.compareTo(o.name) : num;
        return num2;

    }
}