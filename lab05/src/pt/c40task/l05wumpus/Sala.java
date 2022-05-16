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

	public ArrayList<Componente> getArrayComp() {
		return(arrayComp);
	}

	// estes metodos get voce vai usar?
	// na Sala tinha um metodo getComp(), que retornava o elem 0 na lista 
	// (o elemento de maior prioridade), preciso desse metodo
	// olha a linha 44 do Controle.java e a linha 56 do Componente.java
	// e se modificar o metodo acima para getArrayComp(int i),
	// return(arrayComp.get(i));
	// agora pensando talvez vc tenha achado que esse metodo getComp retornava a lista
	// toda, mas nao era isso nao murillo, kkkko nome tbm nao ajudou, comp era uma lista da Sala

	public Heroi getHero() {
		return hero;
	}

	public Wumpus getWumpus() {
		return w;
	}

	public Ouro getOuro() {
		return gold;
	}

	public Buraco getBuraco() {
		return trap;
	}

	public Brisa getBrisa() {
		return breeze;
	}
	
	public void determinarPrior() { 
		// nao era melhor colocar isso no construtor?
		// ta so adicionando no arrayList
		arrayComp.add(gold);
		arrayComp.add(w);
		arrayComp.add(trap);
		arrayComp.add(hero);
		arrayComp.add(fed);
		arrayComp.add(breeze);
	}
	
	public boolean ocuparMesmaSala() { // se pode colocar na mesma sala
		// o que vc acha de usar um metodo de verificar se as classes sao iguais
		// ai nao precisaria salvar cada comp como atributo
		// acho que pode usar essa ideia no eliminarComponente()
		// se for de tal classe, entao se capturarOuro bla bla bla
		// acabei de perceber que nao funcionaria, pois so daria pra chamar
		// metodo que cuja assinatura tem na classe mae
		boolean pode = true;
		int i = 0;
		if (arrayComp.get(i) == gold && arrayComp.get(i + 1) == w && arrayComp.get(i + 2) == trap) {
			pode = false;
		}
		return pode;
	}

	public void eliminarComponente() { //
		for (int i = 0; i < arrayComp.size(); i++) {
			if (hero.OuroCapturado() == true) {
				if (arrayComp.get(i) == gold) {
					arrayComp.remove(hero);
					arrayComp.set(i, hero);
				}
			} else if (hero.matarWumpus() == true) {
				if (arrayComp.get(i) == w) {
					arrayComp.set(i, gold);
					arrayComp.remove(hero);
					arrayComp.set(i - 1, hero);
				}
			}
		}
	}

} 
