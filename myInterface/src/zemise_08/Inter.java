package zemise_08;

public interface Inter {
    default void show1(){
        System.out.println("show1开始");
//        System.out.println("相同部分");
//        System.out.println("相同部分");
//        System.out.println("相同部分");
        show();
        System.out.println("show1结束");
    }
    default void show2(){
        System.out.println("show2开始");
//        System.out.println("相同部分");
//        System.out.println("相同部分");
//        System.out.println("相同部分");
        show();
        System.out.println("show2结束");
    }

    private void show(){
        System.out.println("相同部分");
        System.out.println("相同部分");
        System.out.println("相同部分");
    }


    static void method1(){
        System.out.println("method1开始");
//        System.out.println("相同部分");
//        System.out.println("相同部分");
//        System.out.println("相同部分");
        method();
        System.out.println("method1开始");
    }
    static void method2(){
        System.out.println("method2开始");
//        System.out.println("相同部分");
//        System.out.println("相同部分");
//        System.out.println("相同部分");
        method();
        System.out.println("method2开始");
    }

    private static void method(){
        System.out.println("相同部分");
        System.out.println("相同部分");
        System.out.println("相同部分");
    }
}
