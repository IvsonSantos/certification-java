package test;

public interface B {

    default void m() {
        System.out.println("m from B");
    }
}
