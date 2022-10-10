package zemise_01;
@FunctionalInterface
public interface MyInterface {
    void show();

    default void method(){
        System.out.println("我只是用来测试的");
    };

//    void method();
}
