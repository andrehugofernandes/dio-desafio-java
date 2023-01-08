
import java.util.Scanner;

public class LojaDeTintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaCoberta = scanner.nextDouble();

        double valorLata = 80;
        double valorGalao = 25;
        double quantidadeLatas = Math.ceil((areaCoberta/6)/18);
        double quantidadeGaloes = Math.ceil((areaCoberta/6)/3.6);


// TODO: Utilize a função Math.ceil() para arredondamento


        System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): " + (int) quantidadeLatas + " no valor R$ "  + quantidadeLatas * valorLata );
        System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): " + (int) quantidadeGaloes + " no valor R$ "  + quantidadeGaloes * valorGalao);
    }
}
