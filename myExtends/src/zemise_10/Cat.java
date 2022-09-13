package zemise_10;

public class Cat extends Animal{
    public Cat(){}

    public void show(){
        System.out.println("我是猫，你可以死命撸我");
    }

    public Cat(String name, int age){
        super(name,age);
    }
}
