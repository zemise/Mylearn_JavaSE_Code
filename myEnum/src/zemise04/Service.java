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
public class Service {

    public void getEntityPrint(Entity entity) {
        entity.print();
    }

    public <T extends Entity> void getTPrint(T entity) {
        entity.print();
    }
}
