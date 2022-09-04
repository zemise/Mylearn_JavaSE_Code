package zemise_03;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

/*
    需求：
        已知用户名和密码，请用程序实现模拟用户登录，总共给三次机会，登陆之后，给出相应的提示

     思路：
        1、已知用户名和密码，定义两个字符串表示即可
        2、键盘录入用登陆的用户名和密码，用Scanner实现
        3、拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。
            字符串的内容比较，用equals()方法实现
        4、用循环实现多次机会，这里的次数明确，采用for循环实现，并在登陆成功的时候，使用break结束循环
 */
public class StringTest {
    public static void main(String[] args) {
        //已知用户名和密码，定义两个字符串表示即可
        String nameID = "zemise_";
        String passWord = "123456";

        //用循环实现多次机会，这里的次数明确，采用for循环实现，并在登陆成功的时候，使用break结束循环
        for (int i = 0; i < 3; i++) {
            //键盘录入用登陆的用户名和密码，用Scanner实现
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入登陆用户名");
            String nameid = sc.nextLine();
            System.out.println("请输入登陆密码");
            String password = sc.nextLine();

            //拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。
            //字符串的内容比较，用equals()方法实现
            if (nameID.equals(nameid) && passWord.equals(password)) {
                System.out.println("登陆成功！");
                break;
            } else{
                System.out.println("登陆失败！");
                if(2-i ==0){
                    System.out.println("连续三次登陆失败，你的账户已经被锁定，请联系管理员！");
                    break;
                }else{
                    System.out.println("你的登陆账号或者密码错误，你还有" + (2- i) + "次机会！");
                }
            }
        }
    }
}
