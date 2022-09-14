package zemise_01;

public class Zi extends Fu{

    public final int age = 20;
    public void show(){
        //final修饰的变量会变为常量，也不能再更改了
        //age = 100;
        System.out.println(age);
    }


    //被final修饰的方法是最终方法了，不能再复写了
/*    @Override
    public void method(){
        System.out.println("Zi method");
    }*/

}
