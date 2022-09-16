package zemise_02;
/*
    构造方法:
        public Integer(int value):根据 int 值创建 Integer 对象（过时）
        public Integer(String s):根据 String 值创建 Integer 对象（过时）
    静态方法获取对象:
        public static Integer valueof (int i);返回表示指定的 int 值的 Integer 实例
        public static Integer vaLueof (String s);返回一个保存指定值的 Integer 对象 String
 */
public class IntegerDemo {
    public static void main(String[] args) {
/*        //public Integer(int value);根据int值创建Integer对象（过时）
        Integer il = new Integer(100);
        System.out.println(il);

        //public Integer(String s):根据 String 值创建 Integer 对象（过时）
        Integer il2 = new Integer("100");

        //NumberFormatException
        //Integer il2 = new Integer("abc");
        System.out.println(il2);*/

        // public static Integer valueof (int i);返回表示指定的 int 值的 Integer 实例
        Integer il = Integer.valueOf(100);
        System.out.println(il);

        //public static Integer vaLueof (String s);返回一个保存指定值的 Integer 对象 String
        Integer il2 = Integer.valueOf("100");
        System.out.println(il2);
    }
}
