package test;

public class BCTest implements B,C{

    public void m() {
        B.super.m();
    }
}
