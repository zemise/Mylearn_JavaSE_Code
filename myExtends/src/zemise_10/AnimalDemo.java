package zemise_10;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("Tom");
        c1.setAge(10);
        System.out.println(c1.getName() + "," +c1.getAge() + "岁");
        c1.show();

        System.out.println("==============================");

        Cat c2 = new Cat("orange",2);
        System.out.println(c2.getName() + "," +c2.getAge() + "岁");
        c2.show();


        System.out.println("==============================");

        Dog d1 = new Dog();
        d1.setName("板凳");
        d1.setAge(3);
        System.out.println(d1.getName() + "," +d1.getAge() + "岁");
        d1.keep();

        System.out.println("==============================");
        Dog d2 = new Dog("板凳的仔仔", 20);
        System.out.println(d2.getName() + "," +d2.getAge() + "岁");
        d2.keep();


    }
}
