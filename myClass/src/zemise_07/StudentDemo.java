package zemise_07;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student  s= new Student();
        s.show();

        Student s2 = new Student("林青霞");
        s2.show();

        Student s3 = new Student(30);
        s3.show();

        Student s4 = new Student("林青霞", 33);
        s4.show();
    }
}
