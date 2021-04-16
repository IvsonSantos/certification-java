package multiples;

public interface Interface1 {

    int field = 99;
    default void m() {
        System.out.println(field);
    }
}
