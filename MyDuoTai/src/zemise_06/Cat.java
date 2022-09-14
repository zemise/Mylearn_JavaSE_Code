package zemise_06;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼崽崽");
    }

    public void playGame(){
        System.out.println("猫戏耍老鼠");
    }
}
