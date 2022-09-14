package zemise_03;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创造对象，调用方法
        Jumpping j = new Cat();
        j.Jumpping();
        System.out.println("==================");

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(233);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
//        a.Junpping();
        System.out.println("==================");


        a = new Cat("加菲",22);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println("==================");

        Cat c = new Cat();
        c.setName("jiafei");
        c.setAge(22);
        System.out.println(a.getName() + "," + a.getAge());
        c.eat();
        c.Jumpping();
        System.out.println("==================");

        //创造狗类对象，调用方法
        Jumpping k = new Dog();
        k.Jumpping();
        System.out.println("==================");

        Animal b = new Dog();
        b.setName("Tom");
        b.setAge(11);
        System.out.println(b.getName() + "," + b.getAge());
        b.eat();
        System.out.println("==================");

        b = new Dog("acer",99);
        System.out.println(b.getName() + "," + b.getAge());
        b.eat();
        System.out.println("==================");

        Dog d = new Dog();
        d.setName("最后一只");
        d.setAge(22);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
        d.Jumpping();
        System.out.println("==================");








    }
}
