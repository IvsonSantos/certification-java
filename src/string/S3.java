package string;

public class S3 {

    public static void main(String[] args) {
        int i = 0;
        int j = 5;
        int k = 10;

        int loopIterations = 0;

        while ((i++ < j) || (j < --k)) {

            loopIterations++;
        }
        System.out.println(loopIterations);

    }
}
