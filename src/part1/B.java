package part1;

public interface B {

    default void m() {
        System.out.println("m from B");
    }
}
