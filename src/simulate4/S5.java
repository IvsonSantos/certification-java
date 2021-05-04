package simulate4;

public class S5 {

    public static void main(String[] args) {

        String s1 = "s1";
        String s2 = "s" + "1";
        System.out.println(s1 == s2);
        System.out.println(s1 == ("" + s2));

        String s3 = "s1";
        String s4 = s3.substring(0, 1) + s3.substring(1, 1);
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        String s5 = "s1";
        String s6 = s5.substring(0, 2);
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
    }
}
