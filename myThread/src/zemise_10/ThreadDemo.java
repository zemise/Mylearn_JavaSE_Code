package zemise_10;

import java.util.*;

/*
    线程安全的类：
        StringBuffer
        Vector
        Hashtable
 */
public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Vector<String> ve = new Vector();
        ArrayList<String> arrayList = new ArrayList<>();

        Hashtable<String,String> hashtable = new Hashtable();
        HashMap<String,String> hashMap = new HashMap<>();

        //stotic <T> List<T> synchronizedList (List‹T> List〉返回由指定列表支持的同步（线程安全）列表
        List<String> lists = Collections.synchronizedList(new ArrayList<String>());
    }
}
