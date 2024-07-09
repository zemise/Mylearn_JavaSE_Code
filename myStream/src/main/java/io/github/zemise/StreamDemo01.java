package io.github.zemise;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zhaowang</a>
 * @Date 2024/7/9
 * @since 1.0
 */
public class StreamDemo01 {
    public static void main(String[] args) throws IOException {
        var content = new String(StreamDemo01.class.getResourceAsStream("alice.txt").readAllBytes());
        List<String> words = List.of(content.split("\\PL+"));

        long t0 = System.nanoTime();
        int count = 0;
        for (String word : words) {
            if (word.length() > 12) {
                count++;
            }
        }
        System.out.println(count);
        long t1 = System.nanoTime();
        System.out.println(t1 - t0);



        // 以流的方式进行操作
        long count_stream = words.stream()
                .filter(w -> w.length() > 12)
                .count();

        System.out.println(count_stream);

        // 让流库以并行的方式来执行过滤和计数
        long count_stream_parallel = words.parallelStream()
                .filter(w -> w.length() > 12)
                .count();

        System.out.println(count_stream_parallel);

        // 比较三种方式的快慢
        t1 = System.nanoTime();
        long count_1 = words.stream()
                .filter(w -> w.startsWith("a"))
                .count();
        long t2 = System.nanoTime();
        System.out.println(t2 - t1);
        long count_2 = words.parallelStream()
                .filter(w -> w.startsWith("a"))
                .count();
        long t3 = System.nanoTime();
        System.out.println(t3 - t2);


    }
}
