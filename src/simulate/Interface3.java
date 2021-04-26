package simulate;

interface I1 {
    void print();
}

public class Interface3 {

    public static void main(String[] args) {
        I1 obj = () -> System.out.println("Hello");
    }

}
