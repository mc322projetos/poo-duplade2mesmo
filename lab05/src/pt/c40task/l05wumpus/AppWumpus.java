package pt.c40task.l05wumpus;
import java.util.Scanner;

public class AppWumpus {

public static void main(String[] args) {
    AppWumpus.executaJogo(
            (args.length > 0) ? args[0] : null,
            (args.length > 1) ? args[1] : null,
            (args.length > 2) ? args[2] : null);
}

public static void executaJogo(String arquivoCaverna, String arquivoSaida,
                                String arquivoMovimentos) {
    Toolkit tk = Toolkit.start(arquivoCaverna, arquivoSaida, arquivoMovimentos);
    
    String cave[][] = tk.retrieveCave();

    Montador mont = new Montador();
    mont.iniciarLeituraCSV(cave);
    if (mont.getValidezCaverna()) {
        System.out.println("=== Caverna");
        for (int l = 0; l < cave.length; l++) {
            for (int c = 0; c < cave[l].length; c++)
                System.out.print(cave[l][c] + ((c < cave[l].length-1) ? ", " : ""));
            System.out.println();
        }
    }
    else {
        System.out.println("Caverna invalida");
        return;
    }
    
    String movements = tk.retrieveMovements();
    Controle control = new Controle(mont.getHeroi());

    if (movements.length() != 0) {
        System.out.println("=== Movimentos");
        System.out.println(movements);
        
    } else {
        while (true) {
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if (!command.equals("q")) {
                control.receberMovimento(command);
                if(control.executarMovimento());
                    control.pontuar();
                System.out.println("=== Caverna Intermediaria");
                char partialCave[][] = control.getCaverna();
                int score = control.getHeroi().getPontuacao();
                char status = 'x'; // 'w' para venceu; 'n' para perdeu; 'x' intermediárias
                tk.writeBoard(partialCave, score, status);
            } else {
                System.out.println("=== Última Caverna");
                char finalCave[][] = control.getCaverna();
                int score = control.getHeroi().getPontuacao();
                char status = 'n'; // 'w' para venceu; 'n' para perdeu; 'x' intermediárias
                tk.writeBoard(finalCave, score, status);
                tk.stop();
                break;
            }
        }
    }
}

}
     
