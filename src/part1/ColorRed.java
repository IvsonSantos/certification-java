package part1;

public interface ColorRed extends ColorBlack {

    default void getColor() {
        System.out.println("red");
    }
}
