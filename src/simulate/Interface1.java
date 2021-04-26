package simulate;

interface Interface1 {

    void m1();

    interface I2 {
        void m2();
    }

    abstract class A1 {
        public abstract void m3();
    }

    class A2 {
        public void m4() {
            System.out.println(4);
        }
    }
}
