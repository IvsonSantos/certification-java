package simulate4;

public class S3 {

    public static void main(String[] args) {

        byte b1 = 3; // compila, dá um desconto
        //b1 = b1 + 4; // não compila, conta com int devolve int

        byte b2 = 3; // compila, dá um desconto
        b2 += 4; // compila também, compilador gente boa!

        int a = 10;
        a += ++a + a + ++a;
        /*Como a execução é do primeiro para o último elemento das somas, temos
        as reduções:
        a += ++a + a + ++a;
        a = a + ++a + a + ++a;
        a = 10 +11 + a + ++a;
        a = 10 + 11 + 11 + ++a;
        a = 10 + 11 + 11 + 12;
        a = 44; // a passa a valer 44
         */
        System.out.println(a);

        int j = 0;
        int i = (j++ * j + j++);
        System.out.println(i);
        System.out.println(j);
        /*
        Pois:
        i = (0 * j + j++); // j vale 1
        i = (0 * 1 + j++); // j vale 1
        i = (0 * 1 + 1); // j vale 2
        i = 1; // j vale 2
         */
        System.out.println(j);
    }
}
