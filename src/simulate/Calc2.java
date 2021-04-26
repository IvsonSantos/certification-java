package simulate;

public class Calc2 extends Calc1{

    public int calcArea(int x) {
        return super.calcArea(x * 6);
    }

    public static void main(String[] args) {
        //Calc2 shape = new Calc1();
        //System.out.println(shape.calcArea(1));
    }
}
