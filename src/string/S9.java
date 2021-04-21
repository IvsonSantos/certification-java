package string;

public class S9 {

    public static void main(String[] args) {
        int i;
        try {
            i = 0;
            System.out.println("i =" + 10 / i++);
        } catch (RuntimeException e) {

        } finally {
           // System.out.println("i = " + i);
        }
    }
}
