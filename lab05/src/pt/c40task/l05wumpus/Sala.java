package pt.c40task.l05wumpus;
import java.util.ArrayList;

public class Sala {
	private ArrayList<Componente> arrayComp;
	private Heroi hero;
	private Wumpus w;
	private Ouro gold;
	private Buraco trap;
	private Brisa breeze;
	private Fedor fed;
	
	Sala(Heroi hero, Wumpus w, Ouro gold, Buraco trap, Brisa breeze, Fedor fed) {
		arrayComp = new ArrayList<Componente> ();
		this.hero = hero;
		this.w = w;
		this.gold = gold;
		this.trap = trap;
		this.breeze = breeze;
		this.fed = fed;
	}
	
	public void determinarPrior() { 
		arrayComp.add(gold);
		arrayComp.add(w);
		arrayComp.add(trap);
		arrayComp.add(hero);
		arrayComp.add(fed);
		arrayComp.add(breeze);
	}
	
	public Componente getMaiorPrior(int i) {
		return(arrayComp.get(i));
	}
	
	public boolean podeMesmaSala() { // se pode colocar na mesma sala
		boolean pode = true;
		int i = 0;
		if (arrayComp.get(i) == gold && arrayComp.get(i + 1) == w && arrayComp.get(i + 2) == trap) {
			pode = false;
		}
		return pode;
	}

	public void eliminarComponente() { //
		for (int i = 0; i < arrayComp.size(); i++) {
			if (hero.capturarRecompensa() == true) {
				if (arrayComp.get(i) == gold) {
					arrayComp.remove(hero);
					arrayComp.set(i, hero);
				}
			} else if (hero.executarAcao() == true) {
				if (arrayComp.get(i) == w) {
					arrayComp.set(i, gold);
					arrayComp.remove(hero);
					arrayComp.set(i - 1, hero);
				}
			} else if (hero.executarAcao() == false) {
				arrayComp.remove(hero);
			}
		}
	}
} 
