package calculadora;
import java.util.Scanner;

public class Soma {
   public static void executar(Scanner leitor) {
      double valorTotal = 0;
      boolean continuar = true;
      System.out.println("Digite números para somar (digite FIM para encerrar): ");
      while (continuar) {
         String entrada = leitor.next();
         if (entrada.equalsIgnoreCase("FIM")) {
            continuar = false;
         } else {
            valorTotal += Double.parseDouble(entrada);
         }
      }
      System.out.println("\nO resultado eh de " + valorTotal);
   }
}
