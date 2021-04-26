package simulate2;

class Demo
{
    String title ="Demo";
}

public class S3 {

    public static void m1(Demo d)
    {
        d.title = "NewDemo";
    }
    public static void main(String[] args)
    {
        Demo d =new Demo();
        m1(d);
        System.out.println(d.title);
    }
}
