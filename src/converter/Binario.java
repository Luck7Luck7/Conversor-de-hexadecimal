package converter;

import java.util.ArrayList;
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

    public List<Integer> hexadecimal_Binario(String hexadecimal) {
        List<Integer> binario = new ArrayList<>();
        for (int i = 0; i < hexadecimal.length(); i++) {
            switch (hexadecimal.toLowerCase().charAt(i)) {
                case '0':
                    binario.add(0);
                    binario.add(0);
                    binario.add(0);
                    binario.add(0);
                    break;
                case '1':
                    binario.add(0);
                    binario.add(0);
                    binario.add(0);
                    binario.add(1);
                    break;
                case '2':
                    binario.add(0);
                    binario.add(0);
                    binario.add(1);
                    binario.add(0);
                    break;
                case '3':
                    binario.add(0);
                    binario.add(0);
                    binario.add(1);
                    binario.add(1);
                    break;
                case '4':
                    binario.add(0);
                    binario.add(1);
                    binario.add(0);
                    binario.add(0);
                    break;
                case '5':
                    binario.add(0);
                    binario.add(1);
                    binario.add(0);
                    binario.add(1);
                    break;
                case '6':
                    binario.add(0);
                    binario.add(1);
                    binario.add(1);
                    binario.add(0);
                    break;
                case '7':
                    binario.add(0);
                    binario.add(1);
                    binario.add(1);
                    binario.add(1);
                    break;
                case '8':
                    binario.add(1);
                    binario.add(0);
                    binario.add(0);
                    binario.add(0);
                    break;
                case '9':
                    binario.add(1);
                    binario.add(0);
                    binario.add(0);
                    binario.add(1);
                    break;
                case 'a':
                    binario.add(1);
                    binario.add(0);
                    binario.add(1);
                    binario.add(0);
                    break;
                case 'b':
                    binario.add(1);
                    binario.add(0);
                    binario.add(1);
                    binario.add(1);
                    break;
                case 'c':
                    binario.add(1);
                    binario.add(1);
                    binario.add(0);
                    binario.add(0);
                    break;
                case 'd':
                    binario.add(1);
                    binario.add(1);
                    binario.add(0);
                    binario.add(1);
                    break;
                case 'e':
                    binario.add(1);
                    binario.add(1);
                    binario.add(1);
                    binario.add(0);
                    break;
                case 'f':
                    binario.add(1);
                    binario.add(1);
                    binario.add(1);
                    binario.add(1);
                    break;
            }

        }
        return binario;
    }
}
