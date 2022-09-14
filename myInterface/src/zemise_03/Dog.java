package zemise_03;

public class Dog extends Animal implements Jumpping{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void Jumpping() {
        System.out.println("狗也能跳高了");
    }
}
