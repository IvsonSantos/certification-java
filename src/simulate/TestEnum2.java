package simulate;

enum TrafficLight {
    RED, YELLOW, GREEN;
}

public class TestEnum2 {


    public static void main(String[] args) {
        TrafficLight tl1 = TrafficLight.GREEN;
        //TrafficLight tl2 = tl1.clone(); //Line 10
        //System.out.println(tl2); //Line 11
    }
}
