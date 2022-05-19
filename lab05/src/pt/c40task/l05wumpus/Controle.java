package pt.c40task.l05wumpus;

public class Controle {
    private String command;
	private Heroi hero;
	char[][] caverna = {
		{'P', '-', '-', '-'},
		{'-', '-', '-', '-'},
		{'-', '-', '-', '-'},
		{'-', '-', '-', '-'},
	};
	
	Controle(Heroi hero) {
		this.hero = hero;
	}

	public Heroi getHeroi() {
		return hero;
	}
	
    public void receberMovimento(String command) {
        this.command = command;
    }
    
	public boolean executarMovimento() {
		int linhaHeroi = hero.getCoordLinha();
		int colunaHeroi = hero.getCoordColuna();

		if (command.equals("w")) {
			if (linhaHeroi - 1 >= 0 && linhaHeroi - 1 < 3) {
				hero.mover(linhaHeroi - 1, colunaHeroi);
				hero.getCaverna().getSala(linhaHeroi - 1, colunaHeroi).adicionaHeroi(hero);
				caverna[linhaHeroi - 1][colunaHeroi] = hero.getCaverna().getSala(linhaHeroi - 1, colunaHeroi).getMaiorPrior().getTipo();
				caverna[linhaHeroi][colunaHeroi] = '#';

			}
		} else if (command.equals("s")) {
			if (linhaHeroi + 1 > 0 && linhaHeroi + 1 <= 3) {
				hero.mover(linhaHeroi + 1, colunaHeroi);
				hero.getCaverna().getSala(linhaHeroi + 1, colunaHeroi).adicionaHeroi(hero);
				caverna[linhaHeroi + 1][colunaHeroi] = hero.getCaverna().getSala(linhaHeroi + 1, colunaHeroi).getMaiorPrior().getTipo();
				caverna[linhaHeroi][colunaHeroi] = '#';
			}
		} else if (command.equals("a")) {
			if (colunaHeroi - 1 >= 0 && colunaHeroi - 1 < 3) {
				hero.mover(linhaHeroi, colunaHeroi - 1);
				hero.getCaverna().getSala(linhaHeroi, colunaHeroi - 1).adicionaHeroi(hero);
				caverna[linhaHeroi][colunaHeroi - 1] = hero.getCaverna().getSala(linhaHeroi, colunaHeroi - 1).getMaiorPrior().getTipo();
				caverna[linhaHeroi][colunaHeroi] = '#';
			}
		} else if (command.equals("d")) {
			if (colunaHeroi + 1 > 0 && colunaHeroi + 1 <= 3) {
				hero.mover(linhaHeroi, colunaHeroi + 1);
				hero.getCaverna().getSala(linhaHeroi, colunaHeroi + 1).adicionaHeroi(hero);
				caverna[linhaHeroi][colunaHeroi + 1] = hero.getCaverna().getSala(linhaHeroi, colunaHeroi + 1).getMaiorPrior().getTipo();
				caverna[linhaHeroi][colunaHeroi] = '#';
			}
		} else if (command.equals("k")) {
			hero.equiparFlecha();
		} else if (command.equals("c")) {
			if (hero.acharOuro())
				hero.capturarOuro();
			else
				return false;
		}
		return true;
	}

	public char[][] getCaverna() {
		return caverna;
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
