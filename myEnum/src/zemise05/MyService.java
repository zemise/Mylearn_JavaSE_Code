package zemise05;

import zemise04.Entity;
import zemise04.EntityA;
import zemise04.EntityB;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">Zemise</a>
 * @Date 2023/10/30
 * @since 1.0
 */
public class MyService implements Service {
    Repository<EntityA, Long> messageDao = new MessageAAA();

    Repository<EntityB, Long> userDao = new UserAAA();


    Repository<?, Long> getRepositoryEntity(Class<?> entityClass) {
        if (entityClass.equals(EntityA.class)) {
            return messageDao;
        } else if (entityClass.equals(EntityB.class)) {
            return userDao;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        MyService myService = new MyService();
        Repository<?, Long> repositoryEntity = myService.getRepositoryEntity(EntityA.class);
        repositoryEntity.print();

        repositoryEntity = myService.getRepositoryEntity(EntityB.class);
        repositoryEntity.print();
    }
}
