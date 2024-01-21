package lambda.zemise_04;

/*
    Lambda表达式的格式：（形式参数）-〉{代码块}

    练习3：
        1：定义一个接口(Addable)，里面定义一个抽象方法：int add(int x，int y)；
        2：定义一个测试类 (AddableDemo)，在测试类中提供两个方法
            一个方法是：useAddable(Addable a)
            一个方法是主方法，在主方法中调用useAddable方法

    不需要实现类，而且只需要调用一个方法，传参写具体实现，就OK了。方便很多很多
    只不过他局限于，只有一个抽象方法的接口。准确来说，就是给多线程准备的吧。多线程Run接口就是只有一个抽象方法。

 */
public class AddableDemo {
    public static void main(String[] args) {
        //在主方法中调用useAddable方法
        //匿名内部类
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        });

        //Lambda表达式
        useAddable((int x, int y) -> {
            return x + y;
//            return x - y;
        });
    }

    public static void useAddable(Addable a) {
        int sum = a.add(4, 6);
        System.out.println(sum);
    }
}
