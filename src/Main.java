import converter.Binario;

import java.util.ArrayList;
import java.util.List;
/*
public static int multiplicar(int a, int b) {
   return a * b;
}
*/
void main() {
    Scanner input = new Scanner(System.in);
    Binario converter = new Binario();

    System.out.print("Digite o valor em Hexadecimal: ");
    String decima_H = input.next();

    System.out.print("Qual conversão você quer fazer, digite (B) para binario e (D) para decimal: ");
    char operacao = input.next().charAt(0);



    List<Integer> binario = new ArrayList<>();
    for (int i = 0; i < decima_H.length(); i++) {
        switch (decima_H.toLowerCase().charAt(i)) {
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
    if (operacao == 'B' | operacao == 'b') {
        System.out.print("O Hexadecimal " + decima_H + " para binario : ");

        for (int i = 0; i < binario.toArray().length; i++) {
            System.out.print(binario.get(i));
        }
    } else if (operacao == 'D' | operacao == 'd'){
        int soma = converter.binario_decimal(binario);
        System.out.print("O Hexadecimal " + decima_H + " para decimal: " + soma);

    }
}

