package zemise_03;

public class Student {

    private String name;
    private String age;

    //无参构造方法
    public Student(){}
    //有参构造方法
    public Student(String name, String age){
        this.name =name;
        this.age =age;
    }

    //现在创建的方法，目的是为了返回name变量，而这个变量是String类型的
    public String getName(){
        return name;
    };
    public String getAge(){
        return age;
    };


    //这个方法，是为了修改name变量，不用返回，所以void类型就可以了
    public void setName(String name){
        this.name = name;
    }

    public void setAge(String age){
        this.age = age;
    }

    //为了验证我的理解，创建一个方法，既能修改，也能返回，那么也就String类型了
    public String setGetName(String name){
        this.name = name;
        return name;


    }

}
