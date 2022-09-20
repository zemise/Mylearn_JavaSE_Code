package zemise_02;
/*
    哈希值：
        是JDK根据对象的地址或者字符串或者数字算出来的int类型的数值

    Object类中有一个方法可以获取对象的哈希值
        public int hashCode()：返回对象的哈希码值
 */
public class HashDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 =new Student("林青霞",22);

        System.out.println(s1.hashCode());//918221580
        System.out.println(s1.hashCode());

        System.out.println("==============");

        Student s2 =new Student("林青霞",22);

        //默认情况下，不同对象的哈希值是不相同的

        //通过方法重写，可以实现不同对象的哈希值是相同的
        System.out.println(s2.hashCode());//2055281021
        System.out.println(s2.hashCode());

        System.out.println("=================");
        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("jaca".hashCode());//3254229

        System.out.println("world".hashCode());//113318802

        System.out.println("=================");
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
