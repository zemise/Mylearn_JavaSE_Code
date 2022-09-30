package zemise_07;

import java.io.*;
import java.net.Socket;

/*
    客户端：数据来自于键盘录入，直到输入的数据是886，发送数据结束
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        Socket s = new Socket("192.168.0.116", 12000);

        //数据来自于键盘录入，自己封装
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            //获取输出流，写数据
//          OutputStream os = s.getOutputStream();
//          os.write(line.getBytes());

            bw.write(line);
            bw.newLine();
            bw.flush();

            //获取输入流，读数据
            InputStream is = s.getInputStream();
            byte[] bys = new byte[1024];
            int len = is.read(bys);
            System.out.println(new String(bys, 0, len));
        }
        //释放资源
//        s.close();
    }
}
