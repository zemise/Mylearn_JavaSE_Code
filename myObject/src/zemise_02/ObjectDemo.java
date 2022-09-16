package zemise_02;
/*
    测试类
    public boolean equals(Object obj);指示一些对象是否等于此
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(22);

        Student s2 = new Student();
        s2.setName("林青霞");
        s2.setAge(22);

        //需求，比较两个对象的内容是否相同
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


/*        public boolean equals(Object obj) {
            //this -----s1
            //obj ------s2
            return (this == obj);
        }*/
    }
}
