package string;


class SubClass {
    public static String classyName = "abc";

    public static String getClassyName() {
        return classyName;
    }
}

public class S8 extends SubClass {
    public static String classyName = "def";

    public static String getClassyName() {
        return classyName;
    }

    public static void main(String[] args) {
        S8 tt = new S8();
        Object t = tt;
        Object s = new SubClass();
        int abcCount = 0;
        int defCount = 0;

        int tempcount = ((S8) t).classyName == "abc" ? abcCount++ : defCount++;
        tempcount = ((SubClass) s).classyName == "abc" ? abcCount++ : defCount++;

        tempcount = tt.getClassyName(t) == "abc" ? abcCount++ : defCount++;
        tempcount = tt.getClassyName(s) == "abc" ? abcCount++ : defCount++;

        tempcount = tt.getClassyName((S8) t) == "abc" ? abcCount++ : defCount++;
        tempcount = tt.getClassyName((SubClass) s) == "abc" ? abcCount++ : defCount++;

        System.out.println("abcCount = " + abcCount);
    }

    public String getClassyName(Object t) {
        S8 tt = (S8) t;
        return tt.getClassyName();
    }

    public String getClassyName(SubClass sc) {
        return sc.getClassyName();
    }
}
