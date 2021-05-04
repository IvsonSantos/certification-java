package simulate4;

public class S4 {

    public static void main(String[] args) {

        byte b1 = 5;
        byte b2 = 3;
        //byte b3 = b1 + b2;

        int i;
        for (i = 0; i < 5; i++) {
            if (i++ % 3 == 0) {
                break;
            }
        }
        System.out.println(i);
    }
}
