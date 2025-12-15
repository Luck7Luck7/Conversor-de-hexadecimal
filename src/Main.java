import converter.Binario;

import java.util.List;

void main() {
    Scanner input = new Scanner(System.in);
    Binario converter = new Binario();

    System.out.print("Digite qual é o primeiro tipo do valor (B) para binario, (D) para decimal e (H)hexadecimal: ");
    char operacaoTipo1 = input.next().charAt(0);
    System.out.print("Qual conversão você quer fazer, digite (B) para binario, (D) para decimal e (H)hexadecimal: ");
    char operacaoTipo2 = input.next().charAt(0);

    String valorInput = input.next();
    List<Integer> binarioConvertido;

    switch (operacaoTipo1) {
        case 'B':
            System.out.print("Digite o número em binário: ");
            valorInput = input.next();
        case 'D':
            System.out.print("Digite o número em decimal: ");
            valorInput = input.next();

        case 'H':
            System.out.print("Digite o número em hexadecimal: ");
            valorInput = input.next();
            binarioConvertido = converter.hexadecimal_Binario(valorInput);
    }

    switch (operacaoTipo2) {
        case 'B':
            if (operacaoTipo1 == operacaoTipo2) {
                System.out.println("Convertido para o mesmo tipo: " + valorInput);
            } else {

            }
        case 'D':

            if (operacaoTipo1 == operacaoTipo2) {
                System.out.println("Convertido para o mesmo tipo: " + valorInput);
            } else {

            }
        case 'H':
            if (operacaoTipo1 == operacaoTipo2) {
                System.out.println("Convertido para o mesmo tipo: " + valorInput);
            } else {

            }


    }

}

