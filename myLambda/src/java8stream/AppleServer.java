package java8stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">Zemise</a>
 * @Date 2024/1/20
 * @since 1.0
 */
public class AppleServer {
    private static final List<Apple> appleStore = new ArrayList<Apple>();

    static {

        appleStore.add(new Apple(1, "red", 500, "湖南"));
        appleStore.add(new Apple(2, "blue", 300, "湖南"));
        appleStore.add(new Apple(3, "green", 500, "上海"));
        appleStore.add(new Apple(4, "yellow", 200, "北京"));
        appleStore.add(new Apple(5, "purple", 900, "广东"));

    }

    /**
     * 找出红色的苹果
     */
    public void test1() {
        for (Apple apple : appleStore) {
            // 传统写法
            if ("red".equals(apple.getColor())) {
                // add
            }
        }
    }

    public void test2(Predicate<? super Apple> pr) {
        appleStore.stream()
                // 第一种写法
                // .filter(a -> a.getColor().equals("red"))
                // .filter((a -> a.getWeight() > 300))
                // 第二种写法，参数传入
                .filter(pr)
                .collect(Collectors.toList());
    }

    // 求出每个颜色的平均重量
    // 传统写法
    public void test3() {
        // 1. 基础颜色分组
        Map<String, List<Apple>> maps = new HashMap<String, List<Apple>>();

        for (Apple apple : appleStore) {
            List<Apple> list = maps.computeIfAbsent(apple.getColor(), key -> new ArrayList<Apple>());
            list.add(apple);
        }

        // 2. 求出每个颜色的平均重量
        for (Map.Entry<String, List<Apple>> entry : maps.entrySet()) {
            int weights = 0;
            for (Apple apple : entry.getValue()) {
                weights += apple.getWeight();
            }
            System.out.printf("颜色: %s, 平均重量: %s%n", entry.getKey(), weights / entry.getValue().size());
        }
    }

    public void test4() {

        // Map<String, List<Apple>> collect = appleStore.stream().collect(Collectors.groupingBy(a -> a.getColor()));

        // Map<String, List<Apple>> collect = appleStore.stream().collect(Collectors.groupingBy(Apple::getColor));

        appleStore.stream()
                .collect(Collectors.groupingBy(Apple::getColor,
                        Collectors.averagingInt(Apple::getWeight)))
                .forEach((k, v) -> {
                    System.out.printf("颜色: %s, 平均重量: %s%n", k, v);
                });

    }

    public static void main(String[] args) {
        // 第二种写法
        new AppleServer().test2(a -> "red".equals(a.getColor()) && a.getWeight() > 300);


        new AppleServer().test3();

        // 第二种写法
        new AppleServer().test4();

        // 1. 流的生成 与不可重复使用
        // list -> stream
        Stream<Apple> stream1 = appleStore.stream();
        Stream<Apple> stream2 = stream1.filter(apple -> "red".equals(apple.getColor()));
        // 比如以下，重复使用了stream1，结果报错
        // Stream<Apple> stream3 = stream1.filter(apple -> "red".equals(apple.getColor()));

        Arrays.stream(new int[]{1, 2, 3});

        Stream.of(1, 2, 3);

        // 中间节点---懒节点是不执行的
        appleStore.stream().filter(apple -> {
            System.out.println("hello");
            return true;
        });

        // 如果在后面加上终止节点，中间节点就会执行了
        appleStore.stream().filter(apple -> {
            System.out.println("hello");
            return true;
        }).toArray();

        // 流的处理顺序
        appleStore.stream()
                .peek(apple -> System.out.println(apple.getColor()))
                .peek(apple -> System.out.println(apple.getWeight()))
                .toArray();


        appleStore.stream()
                .filter(apple -> "red".equals(apple.getColor()))
                .map(apple -> apple.getColor())
                .peek(color -> System.out.println(color))
                .toArray();
    }
}
