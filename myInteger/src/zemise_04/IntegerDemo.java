package zemise_04;

/*
    装箱：把基本数据类型转换为对应的包装类类型
    拆箱：把包装类类型转换为对应的基本数据类型
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //装箱：把基本数据类型转换为对应的包装类类型
        Integer i = Integer.valueOf(100);

        Integer ii = 100;//自动装箱，其实里面也包含了Integer.valueOf(100)

        //拆箱：把包装类类型转换为对应的基本数据类型
        ii += 200;//隐含了自动装箱和拆箱，ii = ii.intValue() + 200;

        System.out.println(ii);

        Integer iii = null;
        if(iii!=null){
            iii += 300;//NullPointerException
        }
    }
}
