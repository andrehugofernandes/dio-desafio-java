import java.util.Scanner;
public class NomeNaVerticalEmEscada {

   public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String nome = scanner.nextLine();

            for (int i = 1; i <= nome.length(); i++) {
                System.out.println(nome.substring(0, i));
            }
        }
    }

