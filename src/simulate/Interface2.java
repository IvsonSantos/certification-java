package simulate;

@FunctionalInterface
interface I4 {
    void print();

    boolean equals(Object obj);
}

public class Interface2 {
    public static void main(String[] args) {
        I4 obj = () -> System.out.println("Lambda expression");
        obj.print();
    }
}
