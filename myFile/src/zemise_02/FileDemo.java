package zemise_02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <p>
 *
 * </p>
 *
 * @author <a href= "https://github.com/zemise">zemise</a>
 * @Date 2023/11/14
 * @since 1.0
 */
public class FileDemo {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/zemise/Downloads", "word.zemise");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            fw.write("hello world");
            fw.close();

            FileReader fr = new FileReader(file);
            char[] chars = new char[1024];
            int length = fr.read(chars);
            System.out.println(new String(chars, 0, length));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
