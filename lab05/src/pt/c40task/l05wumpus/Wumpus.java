package pt.c40task.l05wumpus;

public class Wumpus extends Componente{
    private static char tipo  = 'W';
	
	Wumpus (Caverna caverna, int coordLinhaSala, int coordColunaSala) {
	    super(caverna, coordLinhaSala, coordColunaSala);
	}
	
	public char getTipo() {
        return tipo;
    }
	
	public void criarFedores() {
		// Os Componentes primários (buraco e wumpus) que possuem componentes secundários associados a eles (brisa e fedor),
        // são responsáveis por criar objetos referentes a esses componentes e solicitar à Caverna que os inclua em suas respectivas coordenadas
        // (calculadas pelo Componente primário).
	}
}
