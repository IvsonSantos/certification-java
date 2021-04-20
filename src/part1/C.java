package part1;

public interface C {

    default void m() {
        System.out.println("m from C");
    }
}
