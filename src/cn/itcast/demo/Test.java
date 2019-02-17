package cn.itcast.demo;

public class Test {

    public static void main(String[] args) {
        J2EE_Test j = new J2EE_Test();
        j.setName("zs");
        j.setAge(1);

        J2EE_Test j1 = new J2EE_Test();
        j1.setName("zs");
        j1.setAge(1);

        System.out.println(j==j1);
        System.out.println(j.equals(j1));
        System.out.println(j1.equals(j));
    }
}
