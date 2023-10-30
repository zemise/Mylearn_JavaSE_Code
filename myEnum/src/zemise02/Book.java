package zemise02;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">Zemise</a>
 * @since 2023/10/28
 */
public class Book<T> { // 定义带泛型的Book<T>类
    // 类型形参：书籍信息
    private T bookInfo;

    public T getBookInfo() {
        return bookInfo;
    }

    // 参数为类型形参的构造方法
    public Book(T bookInfo) {
        this.bookInfo = this.bookInfo;
    }

    public static void main(String[] args) {
        // 创建参数为String类型的书名对象
        Book<String> bookName = new Book<>("《java入门到精通》");

        // 创建参数为String类型的作者对象
        Book<String> bookAuthor = new Book<>("zemise");

        // 创建参数为Double类型的价格对象
        Book<Double> bookPrice = new Book<>(69.8);

        // 创建参数为Boolean类型的附赠源码
        Book<Boolean> hasSource = new Book<>(true);


        System.out.println(bookName.bookInfo);
        System.out.println(bookAuthor.bookInfo);
        System.out.println(bookPrice.getBookInfo());
        System.out.println(hasSource.getBookInfo());


    }
}
