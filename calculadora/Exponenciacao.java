package calculadora;
import java.util.Scanner;

   public class Exponenciacao {
    public static void executar(Scanner leitor) {
    System.out.println("Digite, separado por espaco, o numero base e o numero do seu expoente");
    double y = leitor.nextDouble();
    double x = leitor.nextDouble();
    double z = Math.pow(y,x);
    System.out.println("O resultado eh: " +z);
 
 }
}
