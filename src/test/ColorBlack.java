package test;

public interface ColorBlack {

    default void getColor() {
        System.out.println("black");
    }
}
