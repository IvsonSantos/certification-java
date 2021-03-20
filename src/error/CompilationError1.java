package error;

public class CompilationError1 {

    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10; i++)
            j++;
        // compilation error
        //System.out.println(j);
    }
}
