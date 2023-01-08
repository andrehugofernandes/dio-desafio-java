// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int ano;

        ano = ent.nextInt();

        //ano = ano % 100;

        if (ano % 4 == 0){
            System.out.println("Bissexto");
        }else {
            System.out.println("Nao Bissexto");
        }

        //TODO: Descubra se o ano é bissexto ou não

    }
}

/*
# dio-desafios-java

### - Nome na Vertical em Escada
### - Loja de Tintas
### - Taxa de Crescimento
### - Tempo de Download
### - Ano Bissexto?
*/