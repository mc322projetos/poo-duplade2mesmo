package pt.c40task.l05wumpus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Sala {
	private ArrayList<Componente> arrayComp;
	private Heroi hero;
	private Wumpus W;
	private Ouro gold;

	Sala() {
		arrayComp = new ArrayList<Componente> ();
	}

	public void sort() {
		Collections.sort(arrayComp, Comparator.comparing(Componente::getPrior));
	}

	public void conectaComponente(Componente comp) {
		arrayComp.add(comp);
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

	public void eliminarComponente() { // alterar isso para nao depender da inicializacao
		// previa de O e W isolados (fora do array)
		// percorra o array procurando pelos tipos 'P', O' e 'W',
		// armazene o indice
		// armazene o heroi no atributo hero,
		// ouro no gold
		for (int i = 0; i < arrayComp.size(); i++) {
			if (hero.acharOuro() == true) {
				if (arrayComp.get(i) == gold) { // se o tipo for 'O'
					arrayComp.remove(hero);
					arrayComp.set(i, hero);
				}
			} else if (hero.matarWumpus() == true) {
				if (arrayComp.get(i) == W) { // se o tipo for 'W'
					arrayComp.set(i, gold); // set usando o gold armazenado
					arrayComp.remove(hero);
					arrayComp.set(i - 1, hero);
				}
			}
		}
	}
} 
