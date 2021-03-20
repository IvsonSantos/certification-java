package error;

public class CompilationError2 {

    public void m1(String s) {
        System.out.println(s);
    }

    public void m2() {
        // compilation error
        //System.out.println(s);
    }
}
