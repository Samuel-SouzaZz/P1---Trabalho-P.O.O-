import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Manipulacao de Strings");
        System.out.println("--------------------------------");
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

       
        int numVogais = ManipulacaoString.contarVogais(entrada);
        String stringInvertida = ManipulacaoString.inverterString(entrada);
        boolean palindromo = ManipulacaoString.verificarPalindromo(entrada);

        
        System.out.println("Numero de vogais na string: " + numVogais);
        System.out.println("String invertida: " + stringInvertida);
        System.out.println("E um palindromo? " + (palindromo ? "Sim" : "Nao"));

        scanner.close();
    }
}
