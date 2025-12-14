package converter;

import java.util.List;

public class Binario {
    public int binario_decimal(List<Integer> binario) {

        int soma = 0;
        int ex = 0;
        for (int i = binario.size() - 1; i >= 0; i--) {
            soma += binario.get(i) * Math.pow(2, ex);
            ex++;
        }
        return soma;
    }
}
