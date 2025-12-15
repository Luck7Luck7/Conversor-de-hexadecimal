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
//        System.out.println(binario.size());

        for (int i = binario.size() - 1; i >= 0; i--) {


            if (i == 0 & binarioHexa.size() != 4) {
                cont = 4;
                binarioHexa.add(0, binario.get(i));
            }

            if (cont < 4){
                cont++;
                binarioHexa.add(0, binario.get(i));
            }

            if (cont == 4) {
                cont = 0;
                decimal = binario_decimal(binarioHexa);
                binarioHexa.clear();
                if (decimal > 9) {
                    switch (decimal) {
                        case 10: hexadecimal.insert(0,"A"); break;
                        case 11: hexadecimal.insert(0,"B"); break;
                        case 12: hexadecimal.insert(0,"C"); break;
                        case 13: hexadecimal.insert(0,"D"); break;
                        case 14: hexadecimal.insert(0,"E"); break;
                        case 15: hexadecimal.insert(0,"F"); break;

                    }

                } else {
                    hexadecimal.insert(0, decimal);
                }

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
    public List<Integer> decimal_binario(String decimal) {
        int dividendo = Integer.parseInt(decimal);
        int resto;
        List<Integer> binario = new ArrayList<>();
        do {
            resto = dividendo % 2;
            binario.add(0,resto);

            dividendo /= 2;

            if (dividendo == 1) {
                binario.add(0,dividendo);
            }
        }while (dividendo != 1);
        return binario;
    }
}
