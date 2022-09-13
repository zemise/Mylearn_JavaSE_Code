package zemise_10;

public class Dog extends Animal{
    public Dog(){}
    public Dog(String name, int age){
        super(name,age);
    }
    public void keep(){
        System.out.println("我是狗，我能玩命看家");
    }
}
