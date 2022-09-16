package zemise_03;
/*
    int和String的相互转换
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //int ---- String
        int num = 100;
        //方式1
        String s1 = "" + num;
        System.out.println(s1);

        //方式2
        //public static String vauleof(int i)
        String s2 = String.valueOf(num);
        System.out.println(s1);

        System.out.println("====================");
        //String ---- int
        String  s = "100";
        //方式1：
        //String ------ Integer ------ int
        Integer i = Integer.valueOf(s);

        //public int intValue()
        int x = i.intValue();
        System.out.println(i);

        //方式2：
        //public static int parseInt(String s)
        int y = Integer.parseInt(s);
        System.out.println(y);
    }
}
