package zemise_09;

import java.util.LinkedList;

/*
    LinkedList集合的特有功能:
        public void addFirst(E e):在该列表开头插入指定的元素
        public void addLast(E e):将指定的元素追加到此列表的末尾

        public E getFirst(),返回此列表中的第一个元素
        public E getLast(),返回此列表中的最后一个元漆

        public E removeFirst():从此列表中用除并返回第一个元素
        public E removeLast():从此列表中硎除并返回最后一个元素
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //创建集合
        LinkedList<Student> arr = new LinkedList<>();

        //创建学生对象
        Student s1 = new Student("林黛玉", 22);
        Student s2 = new Student("张曼玉", 12);
        Student s3 = new Student("温如玉", 23);

        //把学生添加到集合
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);


        //public void addFirst(E e):在该列表开头插入指定的元素
//        arr.addFirst(s3);
        // public void addLast(E e):将指定的元素追加到此列表的末尾
//        arr.addLast(s3);

        //public E getFirst(),返回此列表中的第一个元素
//        System.out.println(arr.getFirst().getName());
        //public E getLast(),返回此列表中的最后一个元漆
//        System.out.println(arr.getLast().getName());

        //public E removeFirst():从此列表中用除并返回第一个元素
        arr.removeFirst();
        //public E removeLast():从此列表中硎除并返回最后一个元素
        arr.removeLast();
        //遍历集合
        for(Student s:arr){
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
