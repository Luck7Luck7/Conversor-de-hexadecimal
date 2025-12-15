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

    public StringBuilder binario_hexadecimal(List<Integer> binario) {
        StringBuilder hexadecimal = new StringBuilder();
        int cont = 0;
        int decimal;
        List<Integer> binarioHexa = new ArrayList<>();

        for (int i = binario.size() - 1; i <= 0; i--) {
            cont++;


            if (cont == 4) {
                cont = 0;
                decimal = binario_decimal(binarioHexa);

                if (decimal > 9) {
                    switch (decimal) {
                        case 10: hexadecimal.append("A");
                        case 11: hexadecimal.append("B");
                        case 12: hexadecimal.append("C");
                        case 13: hexadecimal.append("D");
                        case 14: hexadecimal.append("E");
                        case 15: hexadecimal.append("F");

                    }
                    binarioHexa.clear();
                } else {
                    hexadecimal.append(decimal);
                }

            } else {
                binarioHexa.add(i);
            }
        }
        return hexadecimal;
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
    public List<Integer> Decimal_binario(String decimal) {
        int dividendo = Integer.parseInt(decimal);
        List<Integer> binario = new ArrayList<>();
        do {

        }while (dividendo != 1);
        return binario;
    }
}
