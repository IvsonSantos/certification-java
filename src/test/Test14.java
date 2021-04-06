package test;

public class Test14 {

    public static void main(String[] args) {

        Test14 t = new Test14();
        t.test(1,2,3,4);

    }

    public void test(int... number) {
        System.out.println(number.length);
    }
}
