package test;

public class Test4 {

    public static void main(String[] args) {

        var teste = "uol";
        var teste2 = 3;

        var obj = (Object) null;

        // nao compila
        //String obj = (Object) null;

        System.out.println(teste);
        System.out.println(teste2);
        System.out.println(obj);
    }
}
