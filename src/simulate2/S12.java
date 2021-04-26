package simulate2;

public class S12 {

    public static void main(String[] args)
    {
        int[] a = {10,20,30};
        int[] b = {10,20};
        a=b;
        for(int i :a)
        {
            System.out.print(i);
        }


        double e = 123.456;
        //double f = 123._456;
        //double g = 123.456_;
        double h = 123.4_5_6;

    }
}
