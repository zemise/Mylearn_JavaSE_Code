# Mylearn_JavaSE_Code

## 一、前言

个人从零学习Java，看B站的黑马程序员视频教程，个人flag，2022年底学完第一系列

- 已完成第一系列基础阶段
- 进阶阶段陆续补充

## 二、基础阶段



| **区别**       | **成员变量**         | **局部变量**                                   |
| -------------- | -------------------- | ---------------------------------------------- |
| 类中位置不同   | 类中方法外           | 方法内或者方法申明上                           |
| 内存中位置不同 | 堆内存               | 栈内存                                         |
| 生命周期不同   | 随着对象的存在而存在 | 随着方法的调用而存在，随着方法的调用完毕而消失 |
| 初始化值不同   | 有默认的初始化值     | 没有默认的初始化值，必须先定义，赋值，才能使用 |

---

**构造方法的注意事项**

1. 构造方法的创建

   - 如果没有定义构造方法，系统将给出一个默认的无参数构造方法

   - 如果定义了构造方法，系统将不再提供默认的构造方法

2. 构造方法的重载

   - 如果自定义了带参构造方法，还要使用无参数构造方法，就必须再写一个无参数构造方法

3. 推荐的使用方式

   - ***无论是否使用，都手工书写无参数构造方法***

---

**标准类制作**

1. 成员变量

   - 使用private修饰

2. 构造方法

   - 提供一个无参构造方法

   - 提供一个带多个参数的构造方法

3. 成员方法

   - 提供每一个成员变量对应的setXxx()/getXxx() 提供一个显示对象信息的show()

4. 创建对象并为其成员变量赋值的两种方式
   - 无参构造方法创建对象后使用setXxx()
   - 赋值使用带参构造方法直接创建带有属性值的对象

---



## 三、进阶阶段

### 1. 枚举类型与泛型

#### 枚举

- 枚举类型本质上还是以类的形式存在的。泛型的出现不仅可以让程序员少写一些代码，更重要的是它可以解决类型安全问题。
- 泛型提供了编译时的安全检查，**不会因为将对象置于某个容器中而失去其类型**。

用户可以将一个枚举类型看作是一个类，它继承于java.lang.Enum类，当定义一个枚举类型时，每一个枚举类型成员都可以看作是枚举类型的一个实例，这些枚举类型成员都默认被final、public、static修饰，所以当使用枚举类型成员时直接使用枚举类型名称调用枚举类型成员即可。

优势：

- 类型安全。
- 紧凑有效的数据定义。
- 可以和程序其他部分完美交互。
- 运行效率高。

#### 泛型

Object类为最上层的父类，很多程序员为了使程序更为通用，设计程序时通常使传入的值与返回的值都以Object类型为主。
然而当需要使用这些实例时，必须正确地将该实例转换为原来的类型，此时强制转换有概率在运行时将会发生ClassCastException异常。

为了提前预防这种问题，Java提供了泛型机制。其语法如下：

```
类名<T>
```

其中T字母只是约定俗成，其他字母其实也行。
创建该类对象时需要指定T所代表哪种具体的类型。如果不指定具体类型，T则采用Object类型。

泛型的常规用法：

1. 定义泛型类时声明多个类型

   ```java
   class MyClass<T1,T2>{  }
   ```

   实例化指定类型的对象时，就可以指定多个类型，比如

   ```
   MyClass<Boolean,Float> m = new MyClass<Boolean,Float>();
   ```

2. 定义泛型类时声明多个类型
   虽然可以在使用泛型机制时声明一个数组，但是不可以使用泛型来建立数组的实例。

3. 集合类声明容器的元素
   例如：JDK中的集合接口、集合类都被定义了泛型，其中List<E>的泛型E实际上就是element元素的首字母，Map<K,V>的泛型K和V就是key键和value值的首字母。

泛型的高级用法：

1. 限制泛型可用类型
   默认可以使用任何类型来实例化一个泛型类对象，但Java中也对泛型类实例的类型作了限制。语法如下:

   ```java
   class 类名称<T extends anyClass>{}
   ```

   使用泛型限制后，泛型类的类型必须实现或继承anyClass这个接口或类

2. 使用类型通配符

   ```
   泛型类名称<? extends List> a=null;
   ```

   其中，<? extends List>表示类型未知，当需要使用该泛型对象时，可以单独实例化

   ```
   A<? extends List> a = null;
   a = new A<ArrayList>();
   a = new A<LinkedList>();
   ```

   除了可以实例化一个限制泛型类型的实例，还可以将该实例放置在方法的参数中。例如：

   ```
   public void doSomething(A<? extends List> a){ }
   ```

   在上述代码中，定义方式有效地限制了传入doSomething()方法的参数类型。
   如果使用A<?>这种形式实例化泛型类对象，则默认表示可以将A指定为实例化Object及以下的子类类型。
   例如：

   ```
   // 实例化一个ArrayList对象
   List<String> L1 = new ArrayList<String>();
   // 在集合中添加内容
   L1.add("成员");
   List<?> L2 = L1;
   List<?> L3 = new LinkedList<Integer>()
   ```

   这里值得考究的一点是，以上“List<?> l2 = l1”语句与“List l2 = l1”语句是存在区别的：
   使用通配符声明的名称实例化的对象**不能对其加入新的信息**，只能获取或删除。
   比如上述的L2、L3使用类通配符方式创建出来的，不能使用List类带有的set方法改变集合中的值。

   `note: 泛型类型限制除了可以向下限制，还可以进行向上限制，只要在定义时使用super关键字即可。例如，“A<? super List> a = null;”这样定义后，对象a只接受List接口或上层父类类型，如“a = new A<Object>();”。`

3. 继承泛型类与实现泛型接口
   定义为泛型的类和接口也可以被继承与实现。例如，让SubClass类继承ExtendClass的泛型，代码如下：

   ```java
   class ExtendClass<T1>{ }
   class SubClass<T1,T2,T3> extends ExtendClass<T1>{ }
   ```

   如果在SubClass类继承ExtendClass类时保留父类的泛型类型，需要在继承时指明，如果没有指明，直接使用“extends ExtendsClass”语句进行继承操作，则SubClass类中的T1、T2和T3都会自动变为Object类型，所以在一般情况下都将父类的泛型类型保留。

   定义为泛型的接口也可以被实现。例如，让SubClass类实现SomeInterface接口，并继承接口的泛型，代码如下

   ```java
   interface SomeInterface<T1>{ }
   class SubClass<T1,T2,T3> implements SomeInterface<T1>{ }
   ```

**总结：**

- 泛型的类型参数只能是类类型，不可以是简单类型，如A<int>这种泛型定义就是错误的。
- 泛型的类型个数可以是多个。
- 可以使用extends关键字限制泛型的类型。
- 可以使用通配符限制泛型的类型。



### 2. Lambda表达式

#### 1. 简介

Lambda 表达式是 Java 1.8 跟 Stream 机制一同推出的。Lambda 表达式极大地减少了代码量，增加了代码的可读性。
引入 Lambda 表达式之后，Java 开始支持把函数作为参数传递。



**其实简单来说，就是如何在java中的方法中将另一方法作为参数传入。**



可以理解为**一段带有输入参数的可执行语句块**，这种语法表达式也可以称之为**函数式表达**

#### 2. 前置条件

使用 Lambda 表达式的前置条件，作为参数的接口必须是**函数式接口**

1. 首先类型必须是接口 `interface`，不能是类 `class`。比如，抽象类就不可以。

2. 函数式接口有且仅有一个未被覆写的抽象方法

   - 这里展开来说第2点的有且仅有一个，顶级的Object方法不算

   ```java
   // Example 仍然算是一个“函数式接口”
   public interface Example extends Runnable {
       String toString();
       boolean equals(Object obj);
       int hashCode();
   }
   
   ```

   - 接口中如果定义了default方法，也是不算的，顺带一提，default方法是有方法体的

   ```java
   // Example 仍然算是一个“函数式接口”
   public interface Example extends Runnable {
       default void test() {}
   }
   
   ```

#### 3. 注解的帮助

`@FunctionalInterface` 可以帮助我们在编译期识别出一个接口是否是“函数式接口”：

```java
// 编译期报错
@FunctionalInterface 
public interface Example{
    void test1();
 		void test2();
}

// 编译期无错误
@FunctionalInterface 
public interface Example {
    void test1();
}
```

#### 4. 参数的传递

举例示意

```java
public interface Flyable {
    void fly(String s);
}
```

```java
/*
    Lambda表达式的格式：（形式参数）-> {代码块}

    练习2：
    1：定义一个接口(Flyable)，里面定义一个抽象方法：void fly(string s)；
    2：定义一个测试类(FlyableDemo)，在测试类中提供两个方法
        一个方法是：useFlyable(Flyable f)
        一个方法是主方法，在主方法中调用useFlyable方法
 */
public class FlyableDemo {
    public static void main(String[] args) {
        //在主方法中调用useFlyable方法
        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });

        System.out.println("====================");

        //Lambda表达式
        useFlyable((String str) -> {
            System.out.println(str);
            System.out.println("火车自驾游");
        });

        System.out.println("====================");

        // Lambda表达式
        // 可以省略类型
        useFlyable(str -> {
            System.out.println(str);
            System.out.println("坦克自驾游");
        });

    public static void useFlyable(Flyable f) {
        f.fly("风和日丽，晴空万里");
    }
}

```

##### 1. 参数数目

- 多个参数：可以选择省略所有参数类型声明。

- 单个参数： 除了可以省略参数类型，还可以进一步省略掉括号。

##### 2. 返回值

- 有
- 无

这里可以具体参考下一节，方法引用

##### 5. 方法引用

将方法作为参数引用，分为两类

1. 静态方法引用
2. 成员方法引用

静态方法直接引入就行，对于成员方法则需新建该成员所在的类



```java
@FunctionalInterface
public interface StaticMethodInterface {
    int method(int a, int b);
}
```

```java
public class StaticMethodDemo {
    static int add(int x, int y) {
        return x + y;
    }

    static int useMethod(StaticMethodInterface add) {
        return add.method(4, 5);
    }

    public static void main(String[] args) {

        // 静态方法引入
        // 这里相当于做了一个接口的实现
        StaticMethodInterface sm = StaticMethodDemo::add;
        int result = sm.method(15, 16);
        System.out.println("接口方法结果：" + result);

        // 静态方法引入的常见写法
        // 而这种写法，相当于直接把方法作为参数传入
        int otherResult = useMethod(StaticMethodDemo::add);
        System.out.println("接口方法结果：" + otherResult);

    }
}

```

动态方法引入，需要new一个方法所在的类

```java
@FunctionalInterface
public interface InstanceMethodInterface {
    String method(Date date);
}

```

```java
public class InstanceMethodDemo {
    public String format(Date date) {
        // 创建日期格式化对象，并指定日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    public static String useFormat(InstanceMethodInterface face) {
        return face.method(new Date());
    }

    public static void main(String[] args) {

        // 动态方法引入
        // 这里相当于做了一个接口的实现
        InstanceMethodDemo demo = new InstanceMethodDemo();
        InstanceMethodInterface im = demo::format;

        Date date = new Date();
        System.out.println("默认格式：" + date);
        System.out.println("接口输出的格式：" + im.method(date));

        // 动态方法引入的常见写法
        // 而这种写法，相当于直接把方法作为参数传入
        String otherResult = useFormat(new InstanceMethodDemo()::format);
        System.out.println(otherResult);

    }
}
```



### 3. Stream流处理

Stream 流处理，首先要澄清的是 java8 中的 Stream 与 I/O 流 InputStream 和 OutputStream 是完全不同的概念。

Stream 机制是针对集合迭代器的增强。

流允许用声明式的方式处理数据集合（通过查询语句来表达，而不是临时编写一个实现）。



#### 1. 流处理的特性

1. 不存储数据
2. 不会改变数据源
3. 不可以重复使用

```java
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

    }
}
```



#### 2. 创建流的方式

- 由集合对象创建流。对支持流处理的对象调用 **stream()**。支持流处理的对象包括 `Collection` 集合及其子类

```java
List<Integer> list = Arrays.asList(1,2,3);
Stream<Integer> stream = list.stream();
```

- 由数组创建流。通过静态方法 **Arrays.stream()** 将数组转化为流（Stream）

```java
IntStream stream = Arrays.stream(new int[]{3, 2, 1});
```

- 通过静态方法 **Stream.of()** ，但是底层其实还是调用 Arrays.stream()

```java
Stream<Integer> stream = Stream.of(1, 2, 3);
```

#### 3. 流处理的操作类型

Stream 的所有操作连起来组合成了管道，管道有两种操作：
第一种，中间操作（intermediate）。调用中间操作方法返回的是一个新的流对象。
第二种，终值操作（terminal）。在调用该方法后，将执行之前所有的中间操作，并返回结果。



只有中间操作的，是不会执行的，也被称为懒节点

```java
public static void main(String[] args) {
  // 中间节点---懒节点是不执行的
  // 以下无hello输出
  appleStore.stream().filter(apple -> {
    System.out.println("hello");
    return true;
  });
  
  
  
  // 如果在后面加上终止节点，中间节点就会执行了
  // 以下有hello输出
  appleStore.stream().filter(apple -> {
    System.out.println("hello");
    return true;
  }).toArray();

}
```

如何区分呢？可以看节点方法的返回值，如果返回的是Stream类型的，就是中间节点，因为产生了新的流。



| 流操作方法                                 | 流操作类型 |
| ------------------------------------------ | ---------- |
| **peek()**                                 | 中间操作   |
| **forEach()**                              | 终值操作   |
| 所以，我们可以用 peek 来证明流的执行顺序。 |            |
|                                            |            |



#### 4. 流处理的执行顺序

```java
// 流的处理顺序
appleStore.stream()
  .peek(apple -> System.out.println(apple.getColor()))
  .peek(apple -> System.out.println(apple.getWeight()))
  .toArray();

// 以上输出结果是
// red
// 500
// blue
// 300
// green
//  500
// yellow
// 200
// purple
// 900

// 总之，执行顺序会走一个“之”字形。
```

同时上个节点，可以影响下个节点

影响方式：

1. 过滤
2. 转换
3. 去重

```java
appleStore.stream()
  .filter(apple -> "red".equals(apple.getColor())) // 这一层做了过滤
  .map(apple -> apple.getColor())
  .peek(color -> System.out.println(color)) // 上层做了map映射，也就做了转换，所以这一层获得参数变为了字符串
  .toArray();
```

通过连续执行多个操作倒便就组成了 Stream 中的执行管道（pipeline）。需要注意的是这些管道被添加后并不会真正执行，只有等到调用终值操作之后才会执行。



