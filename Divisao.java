import java.util.Scanner;

public class Divisao {
   public static void executar(Scanner leitor) {
      double valorTotal = 0;
      boolean continuar = true;
      boolean primeiro = true;
      System.out.println("Digite números para dividir (digite FIM para encerrar): ");
      while (continuar) {
         String entrada = leitor.next();
         if (entrada.equalsIgnoreCase("FIM")) {
            continuar = false;
         } else {
            double y = Double.parseDouble(entrada);
            if (primeiro) {
               valorTotal = y;
               primeiro = false;
            } else if (y == 0) {
               System.out.println("Impossível realizar divisões com 0");
            } else {
               valorTotal /= y;
            }
         }
      }
      System.out.println("\nO resultado eh de " + valorTotal);
   }
}
