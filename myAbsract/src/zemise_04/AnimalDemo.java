package zemise_04;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，按照多态的方式
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(33);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        System.out.println("===========================");
        a= new Cat("加菲", 55);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        System.out.println("===========================");
        Animal b = new Dog();
        b.setName("板凳");
        b.setAge(33);
        System.out.println(a.getName() + "," + a.getAge());
        b.eat();

        System.out.println("===========================");
        b= new Dog("加菲", 55);
        System.out.println(b.getName() + "," + b.getAge());
        b.eat();
    }
}
