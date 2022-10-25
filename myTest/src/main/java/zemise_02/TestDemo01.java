package zemise_02;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class TestDemo01 {
    public static void main(String[] args) throws IOException {

        Yaml yaml = new Yaml();
        FileReader reader = new FileReader("myTest/src/main/resources/config.yml");
        BufferedReader br = new BufferedReader(reader);

        Map<?, ?> map = yaml.load(br);
        System.out.println(map.get("op-group"));
        Object o = map.get("blacklist:word");
        System.out.println(o);

        reader.close();

    }


    public void write() throws IOException {
        Map<String, Object> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);

        Yaml yaml = new Yaml();
        FileWriter writer = new FileWriter("myTest/src/main/resources/config.yml");
        BufferedWriter bw = new BufferedWriter(writer);
        bw.newLine();
        yaml.dump(map, bw);
        writer.close();
    }
}
