package io.github.zemise;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zhaowang</a>
 * @Date 2024/7/10
 * @since 1.0
 */
public class CreatingStream {
    public static <T> void show(String title, Stream<T> stream) {
        final int SIZE = 10;
        List<T> firstElements = stream
                .limit(SIZE + 1)
                .toList();

        System.out.println(title + ": ");
        for (int i = 0; i < firstElements.size(); i++) {
            if (i > 0) System.out.println(", ");
            if (i < SIZE) System.out.println(firstElements.get(i));
            else System.out.println("...");
        }
    }

    public static void main(String[] args) throws IOException {
        String content = new String(CreatingStream.class.getResourceAsStream("alice.txt").readAllBytes());

        Stream<String> words = Stream.of(content.split("\\PL+"));
        show("words", words);

        Stream<String> song = Stream.of("gently", "down", "the", "stream");
        show("song", song);
    }
}
