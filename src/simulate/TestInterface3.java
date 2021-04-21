package simulate;

public class TestInterface3 implements TestInterface1, TestInterface2{

    public static void main(String[] args) {
        TestInterface3 theInstance = new TestInterface3();
        theInstance.method();
    }
}
