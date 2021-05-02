package simulate3;

public class S12 {

    int v1 = 0_100_267_760; // ok
    //int v2 = 0_x_4_13; // erro, _ antes e depois do x
    //int v3 = 0b_x10_BA_75; // erro, _ depois do b
    //int v4 = 0b_10000_10_11; // erro, _ depois do b
    int v5 = 0xa10_AF_75; // ok, apesar de ser letra
    // representa dígito
    //int v6 = _123_341; // erro, inicia com _
    //int v7 = 123_432_; // erro, termina com _
    int v8 = 0x1_0A0_11; // ok
    int v9 = 144__21_12; // ok
}
