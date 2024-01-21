package lambda.zemise_02;

/*
    Lambda表达式的格式：（形式参数）-> {代码块}

    练习1：
        1：定义一个接口(Eatable)，里面定义一个抽象方法：void eat()；
        2：定义一个测试类(EatableDemo)，在测试类中提供两个方法
            一个方法是：useEatable(Eatable e)
            一个方法是主方法，在主方法中调用useEatable方法
 */
public class EatableDemo {
    // 1. 前置条件，必须式函数式接口
    // 2. 参数的传递
    // 3. 代码的编写方式
    // 4. 方法引用
    public static void main(String[] args) {
        //一个方法是主方法，在主方法中调用useEatable方法
        // 1. 编写一个接口的实现类
        Eatable e = new EatableImp();
        useEatable(e);

        // 2. 匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，医生远离我");
            }
        });

        // 3. Lambda表达式
        /**
         * 代码的编写特性：
         * 1. 单行表达式，省略掉 return
         * 2. 代码块
         * 3.
         */
        useEatable(() -> {
            System.out.println("一天一苹果，医生远离我");
        });
    }



    public static void useEatable(Eatable e) {
        e.eat();
    }
}
