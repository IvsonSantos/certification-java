package simulate2;

public class S6 {

    public static void main(String[] args)
    {
        String [] x = {"Core","Java","Advanced", "Java"};
        String[] argv = new String[2];
        argv = x;
        for(String v : argv)
        {
            System.out.print(v);
        }
    }
}
