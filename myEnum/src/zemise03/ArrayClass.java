package zemise03;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">Zemise</a>
 * @since 2023/10/28
 */
public class ArrayClass<T> {
    // 定义泛型数组
    private T[] arrary;

    public T[] getArrary() {
        return arrary;
    }

    public void setArrary(T[] arrary) {
        this.arrary = arrary;
    }

    public static void main(String[] args) {
        ArrayClass<String> demo = new ArrayClass<>();

        String value[] = {"成员1", "成员2", "成员3", "成员4", "成员5"};
        demo.setArrary(value);

        String[] arrary1 = demo.getArrary();
        for (String s : arrary1) {
            System.out.println(s);
        }

    }
}
