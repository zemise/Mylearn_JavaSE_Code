package zemise_06;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat("Tom",22);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        //向下传递，强转
        Cat c = (Cat)a;
        c.playGame();


        Animal b = new Dog("板凳", 3);
        b.eat();

        //向下传递，强转
        Dog d = (Dog)b;
        ((Dog) b).lookDoor();

    }
}
