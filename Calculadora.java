import java.util.Scanner;

public class Calculadora {
   public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      boolean loop = true;

      do {
         System.out.println("\nEscolha sua opção no menu:\n");
         System.out.println("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Resto da Divisão\n6-Exponenciação\n7-Sair");
         int escolha = leitor.nextInt();
         switch (escolha) {
            case 1:
               Soma.executar(leitor);
               break;
            case 2:
               Subtracao.executar(leitor);
               break;
            case 3:
               Multiplicacao.executar(leitor);
               break;
            case 4:
               Divisao.executar(leitor);
               break;
            case 5:
               RestoDivisao.executar(leitor);
               break;
            case 6:
               Exponenciacao.executar(leitor);
               break;
            case 7:
               loop = false;
               break;
         
            default:
               System.out.println("\nOpcao invalida!");
               break;
         }
      }
      while(loop);
      leitor.close();

   }
}
