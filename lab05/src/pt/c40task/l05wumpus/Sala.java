package pt.c40task.l05wumpus;
import java.util.ArrayList;
import java.util.Arrays;

public class Sala {
	private ArrayList<Componente> arrayComp;
	private Heroi hero;
	private Wumpus W;
	private Ouro gold;
	private Buraco trap;
	private Brisa breeze;
	private Fedor fed;
	
	Sala() {
		arrayComp = new ArrayList<Componente> ();
	}

	public void conectaComponente(Componente comp) {
		arrayComp.add(comp);
	}

	public void sort() {

	}
	
	public Componente getMaiorPrior(int i) {
		return arrayComp.get(i);
	}
	
	public boolean podeMesmaSala(Componente comp) {
		char[] igualPrior = {'O', 'B', 'W'};
		if (Arrays.asList(igualPrior).contains(comp.getTipo()))
			if (Arrays.asList(igualPrior).contains(arrayComp.get(0).getTipo()))
				return false;
		return true;
	}

	public void eliminarComponente() {
		for (int i = 0; i < arrayComp.size(); i++) {
			if (hero.acharOuro() == true) {
				if (arrayComp.get(i) == gold) {
					arrayComp.remove(hero);
					arrayComp.set(i, hero);
				}
			} else if (hero.matarWumpus() == true) {
				if (arrayComp.get(i) == W) { // ta faltando remover o W
					arrayComp.set(i, gold);
					arrayComp.remove(hero);
					arrayComp.set(i - 1, hero);
				}
			}
		}
	}
} 
