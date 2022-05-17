package pt.c40task.l05wumpus;

public class Controle {
    private String command;
	private Heroi hero;
	
	Controle(Heroi hero) {
		this.hero = hero;
	}
	
    public void receberMovimento(String command) {
        this.command = command;
    }

	public void executarMovimento() {
		int linhaHeroi = hero.getCoordLinha();
		int colunaHeroi = hero.getCoordColuna();
		if (command.equals("w")) {
			hero.mover(linhaHeroi - 1, colunaHeroi);
		} else if (command.equals("s")) {
			hero.mover(linhaHeroi + 1, colunaHeroi);
		} else if (command.equals("a")) {
			hero.mover(linhaHeroi, colunaHeroi - 1);
		} else if (command.equals("d")) {
			hero.mover(linhaHeroi, colunaHeroi + 1);
		} else if (command.equals("k")) {
			hero.equiparFlecha();
		} else if (command.equals("c")) {
			hero.capturarOuro(); 
		} 		
	}
	
	public void pontuar() {
		int pontuacao = hero.getPontuacao();
		if (command.equals("w") || command.equals("s") || command.equals("a") || command.equals("d")) {
			pontuacao -= 15; 
			if (hero.cairBuraco()) {
				pontuacao -= 1000; 
			}
			else if (hero.podeAtirar()) {
				hero.atirarFlecha();
				pontuacao -= 100;
			} 
			if (hero.acharWumpus()) {
				if (!hero.matarWumpus())
					pontuacao -= 1000;
				else
					pontuacao += 500;
			}
		} if (hero.capturarRecompensa() == true) { // eh que esse metodo precisa ser do componente, se n n consigo usar
			// ele na Sala, e tipo eu acho q se o jogador n pegou o ouro paciencia, uma hora ele vai precisar pegar, a nao
			// ser que ele saia do jogo.
			// o que a gente tem que tratar na verdade eh se o jogador aperta algum botao que n seja do comando do jogo
			pontuacao += 1000;
		}
	}
}
