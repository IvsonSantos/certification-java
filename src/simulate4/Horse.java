package simulate4;

public class Horse extends Animal{

    public Horse() {
        // se nao tiver uma chamada para o super construtor nao funciona
        super(3);
        System.out.println("horse");
    }

    public static void main(String[] args) {
        new Animal(5);
    }
}
