package zemise_08;

/**
 * <p>
 *  Consumer: 消费性接口;
 *  Consumer通过名字可以看出它是一个消费函数式接口，主要针对的是消费（1..n 入参， 无返回）这个场景
 * </p>
 * @author <a href= "https://github.com/zemise">zemise</a>
 * @Date 2023/11/13
 * @since 1.0
 */

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
