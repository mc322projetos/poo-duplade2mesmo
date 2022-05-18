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
			if (linhaHeroi - 1 >= 0 && linhaHeroi - 1 < 3) {
				hero.mover(linhaHeroi - 1, colunaHeroi);
			}
		} else if (command.equals("s")) {
			if (linhaHeroi + 1 > 0 && linhaHeroi + 1 <= 3) {
				hero.mover(linhaHeroi + 1, colunaHeroi);
			}
		} else if (command.equals("a")) {
			if (colunaHeroi - 1 >= 0 && colunaHeroi - 1 < 3) {
				hero.mover(linhaHeroi, colunaHeroi - 1);
			}
		} else if (command.equals("d")) {
			if (colunaHeroi + 1 > 0 && colunaHeroi + 1 <= 3) {
				hero.mover(linhaHeroi, colunaHeroi + 1);
			}
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
		} if (hero.acharOuro() == true) {
			hero.capturarOuro();
			pontuacao += 1000;
		}
		hero.setPontuacao(pontuacao);
	}
}
