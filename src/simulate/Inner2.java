package simulate;

public class Inner2 {

    private int num1 = 100;
    class N {
        private int num2 = 200;
    }

    public static void main(String[] args) {
        Inner2 outer = new Inner2();
        Inner2.N inner = outer.new N();
        System.out.println(outer.num1 + inner.num2);
    }
}
