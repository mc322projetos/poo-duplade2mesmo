package model;

public class Gato implements Atores {
	private int qtdPeixes;
	private char tipo;
	private Labirinto maze;
	
	Gato(Labirinto maze, int qtdPeixes, char tipo) {
		this.maze = maze;
		this.qtdPeixes = qtdPeixes;
		this.tipo = tipo;
	}
	
	public void setQtdPeixes(int qtdPeixes) {
		this.qtdPeixes = qtdPeixes;
	}
	
	public int getQtdPeixes() {
		return qtdPeixes;
	}
	
	public char getTipo() {
		return tipo;
	}
	
	public int[] mover() { // preciso das coordenadas de movimento dadas pelo control na interface requerida para passar
		// para o labirinto e ele decidir se o gato pode se mover ou n, que no caso eh esse i,j
		int[] movimento = new int[2];
		movimento[0] = i;
		movimento[1] = j;
		return movimento;
	}
	
	public void capturar() {
		
	}
}
