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
			if (hero.cairBuraco() == 1) {
				pontuacao -= 1000; 
			}
			else if (hero.verificarFlecha() == 1) {
				pontuacao -= 100;
			} 
			if (hero.caverna.getSala(i, j).getComp() == 'W') { 
				if (hero.matarWumpus() == 0) {
					pontuacao -= 1000;
				} else if (hero.matarWumpus() == 1) {
					pontuacao += 500;
				}
			}
		} if (hero.capturarOuro() == true) {
			pontuacao += 1000;
		}
	}
}
