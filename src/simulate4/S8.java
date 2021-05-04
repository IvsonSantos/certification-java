package simulate4;

public class S8 {

    public static void main(String[] args) {

        int value = 20;
        final int FIVE = 5;
        int thirty = 30;
        switch (value) {
            case FIVE: // constante
                System.out.println(5);
            case 10: // literal
                System.out.println(10);
            case FIVE * 4: // operação com constante e literal
                System.out.println(20);
                //case thirty: // compile error, variável
                //    System.out.println(30);
                //case thirty + FIVE: // compile error, operação envolvendo variável
                //    System.out.println(35);
                //case null: // compile error, explicit null
                //    System.out.println("null");
        }
    }
}
