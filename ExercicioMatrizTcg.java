
public class ExercicioMatrizTcg {
    public static void main(String[] args) {

        // Vetor com os nomes dos decks — o índice aqui casa com a linha/coluna da
        // matriz
        String[] decks = {
                "Dragapult ex",
                "Mega Chandelure ex",
                "Decidueye ex",
                "Mega Zygarde ex",
                "Gardevoir ex"
        };

        // matchups[i][j] = vitórias do deck i contra o deck j (em 10 partidas)
        int[][] matchups = {
                { 5, 6, 4, 7, 3 }, // Dragapult ex
                { 4, 5, 6, 3, 8 }, // Mega Chandelure ex
                { 6, 4, 5, 5, 6 }, // Decidueye ex
                { 3, 7, 5, 5, 4 }, // Mega Zygarde ex
                { 7, 2, 4, 6, 5 } // Gardevoir ex
        };
        int q = 0;

        for (int i = 0; i < matchups.length; i++) {
            for (int j = 0; j < matchups[i].length; j++) {
                if (j % matchups.length == 0) {
                    System.out.printf("%-20s", "" + decks[i]);
                    System.out.print(":");

                }
                System.out.print("\t" + matchups[i][j]);
                q++;
                if (q % 5 == 0) {
                    System.out.println(" ");
                }
            }
        }

        System.out.println("\n\n");
        for (int z = 0; z < decks.length; z++) {
            System.out.printf("%-20s%3d%n", decks[z], totalVitorias(matchups, z));
          
        }
    }

    public static int totalVitorias(int[][] matchups, int deck) {
        int soma = 0;
        for (int i = 0; i < matchups.length; i++) {
            soma = soma + matchups[deck][i];

        }
        return soma;
    }

    public static void melhorDeck(int[][] matchups){ //trocar o void por int
        int maiorvitoria =0;
        for (int i = 0; i < matchups.length; i++) {
            if (totalVitorias(matchups, i)>maiorvitoria){
            maiorvitoria=totalVitorias(matchups, i);
            }
            
        }
    }


}
