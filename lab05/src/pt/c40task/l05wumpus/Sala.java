package pt.c40task.l05wumpus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sala {
	private ArrayList<Componente> arrayComp;
	private Heroi hero;
	private Componente W;
	private Componente gold;

	Sala() {
		arrayComp = new ArrayList<Componente> ();
	}

	public void sort() {
		Collections.sort(arrayComp, Comparator.comparing(Componente::getPrior));
	}

	public boolean conectarComponente(Componente comp) {
		// o retorna true se nao der erro
		if (podeMesmaSala(comp)) {
			arrayComp.add(comp);
			return false;
		}
		else
			return true;
	} 

	public void adicionaHeroi(Componente heroi) {
		arrayComp.add(heroi);
		sort();
		eliminarComponente();
	}

	public Componente getMaiorPrior() {
		return(arrayComp.get(0));
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
			Componente aux = arrayComp.get(i);
			if (aux.getTipo() == 'O')
				gold = (Ouro)aux;
			else if (aux.getTipo() == 'W')
				W = (Wumpus)aux;
			else if (aux.getTipo() == 'P')
				hero = (Heroi)aux;
		}
		for (int i = 0; i < arrayComp.size(); i++) {
			if (hero.acharOuro() == true) {
				if (arrayComp.get(i) == gold) {
					arrayComp.remove(hero);
					arrayComp.set(i, hero);
				}
			} else if (hero.matarWumpus() == true) {
				if (arrayComp.get(i) == W) { 
					arrayComp.set(i, gold); 
					arrayComp.remove(hero);
					arrayComp.set(i - 1, hero);
				}
			}
		}
	}
} 
