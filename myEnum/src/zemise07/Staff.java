package zemise07;

//职员
interface Staff{
    //工资
    public int getSalary();
}
//乘客
interface Passenger{
    //是否是站立状态
    public boolean isStanding();
}
//定义“我”这个类型的人
class Me implements Staff,Passenger{
    public boolean isStanding(){
           return true;
    }
    public int getSalary() {
           return 2000;
    }
}