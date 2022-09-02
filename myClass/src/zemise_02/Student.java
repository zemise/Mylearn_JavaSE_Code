package zemise_02;
/*
    学生类
 */
public class Student {
    //成员变量
    String name;
    private int age;

    //提供get/set方法
    public void setAge(int a){
        //age = a;
        if(a<0 || a >120){
            System.out.println("你给你的年龄有误");

        }else{
            age = a;
        }
    }

    public int getAge(){
        return age;
    }

    public void study(){
        System.out.println("好好学习，天天向上");
    }

    public void deHomework(){
        System.out.println("键盘敲烂，月薪过万");
    }

}
