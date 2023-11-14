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
public class EntityExtendA extends EntityA{
    @Override
    public void print() {
        System.out.println("实体类====继承于EntityA，而EntityA又是继承于Entity");
    }
}
