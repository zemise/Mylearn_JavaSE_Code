package zemise04;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zemise</a>
 * @Date 2023/10/30
 * @since 1.0
 */
public class Demo01 {
    private static <T extends Number> double add(T a, T b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        Service service = new Service();

        System.out.println("========调用普通方法");
        service.getEntityPrint(new EntityA());
        service.getEntityPrint(new Entity() {
            @Override
            public void print() {
                System.out.println("新建的一个实体类");
            }
        });

        // 错误 service.getEntityPrint(new EntityOther());
        service.getEntityPrint(new EntityExtendA());

        System.out.println("========调用泛型方法");

        service.getTPrint(new EntityA());
        service.getTPrint(new Entity() {
            @Override
            public void print() {
                System.out.println("新建的一个实体类");
            }
        });

        // 错误 service.getTPrint(new EntityOther());
        service.getTPrint(new EntityExtendA());

    }
}
