import java.util.Locale;
import java.util.Scanner;

public class Programa {
   
   public static void main(String[] args) {
   
      Scanner scanner = new Scanner(System.in);
      Ingresso ingresso = new Ingresso(1, "01/04/2024", 35);
      IngressoVip ingressoVip = new IngressoVip(10,35);
           
      System.out.println("Escolha entre Ingresso(1) ou IngressoVip(2):");
      int escolha = scanner.nextInt();
      
      switch (escolha) {
         case 1:
            System.out.println("Valor do seu ingresso e: " + ingresso.getValor() + " Data de Validade: " + ingresso.getdataValidade());
            break;
         case 2:
            System.out.println("Valor do seu ingressoVip e: " + ingressoVip.valorIngressoVip() + " Data de Validade: " + ingresso.getdataValidade());
            break;
         default:
            System.out.println("ERRO! DIGITE (1) ou (2)");
      }
      
      scanner.close();
   }
}
