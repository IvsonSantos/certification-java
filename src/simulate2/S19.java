package simulate2;

public class S19 {

    static int i =10;
    int j = 20;
    public void m1()
    {
        i++;
        j++;
    }
    public static void main(String[] args)
    {
        S19 t1 = new S19();
        t1.m1();

        S19 t2 = new S19();
        t2.m1();

        System.out.print(t2.i+" "+t2.j);
    }
}
