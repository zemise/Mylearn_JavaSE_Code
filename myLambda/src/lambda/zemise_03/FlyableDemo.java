package lambda.zemise_03;

/*
    Lambda表达式的格式：（形式参数）-> {代码块}

    练习2：
    1：定义一个接口(Flyable)，里面定义一个抽象方法：void fly(string s)；
    2：定义一个测试类(FlyableDemo)，在测试类中提供两个方法
        一个方法是：useFlyable(Flyable f)
        一个方法是主方法，在主方法中调用useFlyable方法
 */
public class FlyableDemo {
    public static void main(String[] args) {
        //在主方法中调用useFlyable方法
        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });

        System.out.println("====================");

        //Lambda表达式
        useFlyable((String str) -> {
            System.out.println(str);
            System.out.println("火车自驾游");
        });

        System.out.println("====================");

        // Lambda表达式
        // 可以省略类型
        useFlyable(str -> {
            System.out.println(str);
            System.out.println("坦克自驾游");
        });



        // 以下例子，并不适合，传入的方法，应该与接口方法的传入参数和返回类型一致才好，见zemise_10
        // 可以传入方法
        // 也就是静态方法引用
        useFlyable(FlyableDemo::whoSay);

        // 普通方法引用
        // 也就是动态方法引用
        useFlyable(new FlyableDemo()::otherSay);
    }

    public static String whoSay(String param) {
        return param + "说：";
    }

    public  String otherSay(String param) {
        return param + "说：";
    }

    public static void useFlyable(Flyable f) {
        f.fly("风和日丽，晴空万里");
    }
}
