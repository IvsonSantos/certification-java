package simulate;

public class TestFor {

    public static void main(String[] args) {

        int x = 0;
        while(x < 100){
            if(x%3 == 0){
                x += 3;
            }
            if(x%2 == 0){
                x += 2;
                continue;
            }
            x++;
        }

    }
}
