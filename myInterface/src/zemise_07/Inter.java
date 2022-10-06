package zemise_07;

public interface Inter {
    void show();
    default void method(){
        System.out.println("接口原method");
    };
    public static void test(){
        System.out.println("接口原静态test");
    };
}
