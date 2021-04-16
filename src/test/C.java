package test;

public interface C {

    default void m() {
        System.out.println("m from C");
    }
}
