
import java.util.Scanner;

public class TaxaDeCrescimento {
    public static void main(String[] args) {
        double populacaoA, populacaoB;

        Scanner input = new Scanner(System.in);
        populacaoA = input.nextInt();
        populacaoB = input.nextInt();

        double taxaCrescimentoA = 0.03;
        double taxaCrescimentoB = 0.015;

        int anos = 0;

        while(populacaoA <= populacaoB){
            anos = anos + 1;
            populacaoA = populacaoA + (populacaoA * taxaCrescimentoA);
            populacaoB = populacaoB + (populacaoB * taxaCrescimentoB);
        }
        //TODO: retornar o número de anos necessários para que a população do país A ultrapasse ou iguale a população B

        System.out.println(anos + " anos");
    }
}