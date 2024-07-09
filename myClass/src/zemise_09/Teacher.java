package zemise_09;

/**
 * <p>
 * 体会不同构造函数的参数命名
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zhaowang</a>
 * @Date 2024/7/9
 * @since 1.0
 */
public class Teacher {
    String name;

    String salary;

    public Teacher(String aName, String aSalary) {
        name = aName;
        salary = aSalary;
    }

    public Teacher(String name) {
        this.name = name;
    }
}
