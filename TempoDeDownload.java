
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class TempoDeDownload {

    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);
        double tmhMB = sc.nextFloat();
        double tmhMbps = sc.nextFloat();
        double tempo = tmhMB/tmhMbps;

        tempo = tempo/60;

        //TODO: Calcule o tempo aproximado de download:
        System.out.printf("%.2f",tempo);

        //TODO: Imprima o calculo do tempo, leve em consideração que a saída é um numero com duas casas decimais:

    }
}