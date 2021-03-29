package test;

public class Test6 {

    public static void main(String[] args) {

        String teaTxt = "Tea";
        String b = "Tea";

        System.out.println(teaTxt == b);
        System.out.println(teaTxt.equals(b));

        String c = new String("Tea");

        System.out.println(teaTxt == c);
        System.out.println(teaTxt.equals(c));

        System.out.println(c.intern());

        String d = c.intern();
        System.out.println(teaTxt == d);
        System.out.println(teaTxt.equals(d));


        c = teaTxt + ' ' + b;
        System.out.println(c);

        System.out.println(c.indexOf('T'));
        System.out.println(c.indexOf('T',1));
        System.out.println(c.lastIndexOf('T'));

        StringBuilder txt = new StringBuilder(c);
        System.out.println(txt.length());
        System.out.println(txt.capacity());


    }
}
