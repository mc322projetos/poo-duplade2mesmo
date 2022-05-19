package pt.c40task.l05wumpus;

public class Wumpus extends Componente{

	Wumpus (Caverna caverna, int coordLinhaSala, int coordColunaSala) {
	    super(caverna, coordLinhaSala, coordColunaSala);
		super.tipo = 'W';
		super.prior = 1;
	}
	
	public void criarFedores() {
		// Os Componentes primários (buraco e wumpus) que possuem componentes secundários associados a eles (brisa e fedor),
        // são responsáveis por criar objetos referentes a esses componentes e solicitar à Caverna que os inclua em suas respectivas coordenadas
        // (calculadas pelo Componente primário).
		int linha = super.getCoordLinha();
		int coluna = super.getCoordColuna();
		Fedor fedor;
		boolean erro; // nao ha necessidade de retorna-lo
		if (linha - 1 >= 0) { // w
			fedor = new Fedor(super.getCaverna(), linha - 1, coluna);
			erro = super.getCaverna().conectarComponente(fedor);
		}
		if (linha + 1 <= 3) { // s
			fedor = new Fedor(super.getCaverna(), linha + 1, coluna);
			erro = super.getCaverna().conectarComponente(fedor);
		}
		if (coluna - 1 >= 0) { // a
			fedor = new Fedor(super.getCaverna(), linha, coluna - 1);
			erro = super.getCaverna().conectarComponente(fedor);
		}
		if (coluna + 1 <= 3) { // d
			fedor = new Fedor(super.getCaverna(), linha, coluna + 1);
			erro = super.getCaverna().conectarComponente(fedor);
		}
	}
}
