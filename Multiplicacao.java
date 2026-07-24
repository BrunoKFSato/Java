import java.util.Scanner;

public class Multiplicacao {
   public static void executar(Scanner leitor) {
      double valorTotal = 1;
      boolean continuar = true;
      System.out.println("Digite números para multiplicar (digite FIM para encerrar): ");
      while (continuar) {
         String entrada = leitor.next();
         if (entrada.equalsIgnoreCase("FIM")) {
            continuar = false;
         } else {
            valorTotal *= Double.parseDouble(entrada);
         }
      }
      System.out.println("\nO resultado eh de " + valorTotal);
   }
}
