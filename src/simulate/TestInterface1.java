package simulate;

public interface TestInterface1 {

    int field = 99;
    default void method() {
        System.out.print(field);
    }
}
