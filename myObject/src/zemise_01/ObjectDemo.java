package zemise_01;

import java.io.PrintStream;

/*
    Object是类层次结构的根，每个类都可以将Object作为超类，所有类都直接或间接继承自该类

    看方法的源码，选中方法，按下Command +B

    建议所有子类重写此方法
    如何重写呢？自动生成即可

*/
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(22);
        System.out.println(s);//zemise_01.Student@36baf30c
        System.out.println(s.toString());

    }

    /*public void println(Object x) { //x =s
        String s = String.valueOf(x);
        if (getClass() == PrintStream.class) {
            // need to apply String.valueOf again since first invocation
            // might return null
            writeln(String.valueOf(s));
        } else {
            synchronized (this) {
                print(s);
                newLine();
            }
        }
    }*/

/*    public static String valueOf(Object obj) {//obj = x
        return (obj == null) ? "null" : obj.toString();
    }
    */

/*    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }*/
}
