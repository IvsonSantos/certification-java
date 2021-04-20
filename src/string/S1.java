package string;

public class S1 {

    static String s;

    public static void main(String[] args) {
        String s;
        boolean isOk=true;
        if (isOk) s = S1.s+"";  // Line 1
        else s="";
        s.concat("Hello ");  // Line 2
        s.concat("World");
        s.toUpperCase();
        System.out.println("s = "+s);
    }
}
