package pt.c40task.l05wumpus;

public class Buraco extends Componente{
	
	Buraco (Caverna caverna, int coordLinhaSala, int coordColunaSala) {
	    super(caverna, coordLinhaSala, coordColunaSala);
		super.tipo = 'B';
		super.prior = 1;
	}
	
	public void criarBrisas() { // continuar e depois verificar, a logica eh a mesma do criarFedores()
		int linha = super.getCoordLinha();
		int coluna = super.getCoordColuna();
		Brisa brisa;
		if (linha + 1 <= 3) {
			brisa = new Brisa(super.getCaverna(), linha + 1, coluna);
			super.getCaverna().conectarComponente(brisa);
		}
		if (linha - 1 > 0) {
			brisa = new Brisa(super.getCaverna(), linha - 1, coluna);
			super.getCaverna().conectarComponente(brisa);
		}
		if (coluna + 1 <= 3) {
			brisa = new Brisa(super.getCaverna(), linha, coluna + 1);
			super.getCaverna().conectarComponente(brisa);
		}
		if (coluna - 1 >= 0) {
			brisa = new Brisa(super.getCaverna(), linha, coluna - 1);
			super.getCaverna().conectarComponente(brisa);
		}
}
