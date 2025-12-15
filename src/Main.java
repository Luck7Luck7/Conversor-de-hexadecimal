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

    List<Integer> binario;
    binario = converter.hexadecimal_Binario(decima_H);

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

