import converter.Binario;

import java.util.List;

void main() {
    Scanner input = new Scanner(System.in);
    Binario converter = new Binario();

    System.out.print("Digite qual é o primeiro tipo do valor (B) para binario, (D) para decimal e (H)hexadecimal: ");
    char operacaoTipo1 = input.next().charAt(0);
    System.out.print("Qual conversão você quer fazer, digite (B) para binario, (D) para decimal e (H)hexadecimal: ");
    char operacaoTipo2 = input.next().charAt(0);

    String valorInput = "0";
    List<Integer> binarioConvertido = new ArrayList<>();

    switch (operacaoTipo1) {
        case 'B':
            System.out.print("Digite o número em binário: ");
            valorInput = input.next();
            for (int i = 0; i < valorInput.length(); i++) {
                binarioConvertido.add(Character.getNumericValue(valorInput.charAt(i)));
            }

            break;
        case 'D':
            System.out.print("Digite o número em decimal: ");
            valorInput = input.next();
            binarioConvertido = converter.decimal_binario(valorInput);
            break;
        case 'H':
            System.out.print("Digite o número em hexadecimal: ");
            valorInput = input.next();
            binarioConvertido = converter.hexadecimal_Binario(valorInput);
            break;
    }

    switch (operacaoTipo2) {
        case 'B':
            if (operacaoTipo1 == operacaoTipo2) {
                System.out.println("Convertido para o mesmo tipo: " + valorInput);
            } else {
                System.out.print("O valor convertido é : ");
                for (int i = 0; i < binarioConvertido.size(); i++) {
                    System.out.print(binarioConvertido.get(i));
                }
            }
            break;
        case 'D':
            if (operacaoTipo1 == operacaoTipo2) {
                System.out.println("Convertido para o mesmo tipo: " + valorInput);
            } else {
                int decimal = converter.binario_decimal(binarioConvertido);
                System.out.println("O valor convertido é :" + decimal);
            }
            break;
        case 'H':
            if (operacaoTipo1 == operacaoTipo2) {
                System.out.println("Convertido para o mesmo tipo: " + valorInput);
            } else {
                StringBuilder hexadecimal = converter.binario_hexadecimal(binarioConvertido);
                System.out.println("O valor convertido é :" + hexadecimal);
            }

            break;
    }

}

