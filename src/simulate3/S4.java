package simulate3;

public class S4 {

    int j = -100;

    S4(int i) { // um construtor nao poder ter retorno
        if (i > 1)
            return; // um construtor pode ter um retorno vazio
        j = i;
    }
}
