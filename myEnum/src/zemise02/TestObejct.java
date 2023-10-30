package zemise02;

import java.util.concurrent.CancellationException;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">Zemise</a>
 * @since 2023/10/28
 */
public class TestObejct {
    private Object b;

    public Object getB() {
        return b;
    }

    public void setB(Object b) {
        this.b = b;
    }

    public static void main(String[] args) {
        TestObejct t = new TestObejct();

        // 向上转型操作----一直都是安全无误的
        t.setB(Boolean.valueOf(true));
        System.out.println(t.getB());

        t.setB(Float.valueOf("12.3"));
        // 向下转型操作----就不一定安全了----Object类型转为Float是安全的
        Float f = (Float) t.getB();
        System.out.println(f);

        System.out.println("=========================");

        // 向下转型操作----以下就会出现错误，虽然被编译器接受，但执行时会出现ClassCastException异常
        t.setB(Float.valueOf("12.3"));
        try {
            Integer s = (Integer) t.getB();
        }catch (ClassCastException e){
            System.out.println("出现ClassCastException异常");
        }
    }
}
