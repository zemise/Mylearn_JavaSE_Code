package zemise_01;

public class StaticDemo {
    public static void main(String[] args) {

        Student.university = "意义大学";

        Student s1 = new Student();
        s1.name = "林青霞";
        s1.age = 30;
//        s1.university = "意义大学";
        s1.show();


        Student s2 = new Student();
        s2.name = "风青杨";
        s2.age = 33;
//        s2.university = "五色大学";
        s2.show();
    }
}
