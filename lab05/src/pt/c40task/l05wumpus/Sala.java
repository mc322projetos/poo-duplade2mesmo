package pt.c40task.l05wumpus;

// ## Sala
// Sala|
// ----------|
// Atributos:|
// \- comp: Componente[]|
// Metodos:|
// \@ Sala()|
// \@ verificarComp(): boolean|
// \@ determinarPrio(): int|
// \@ setComp(): void|
// \@ getComp(): Componente|

public class Sala {
	private Componente[] comp;
	
	Sala() {
		comp = new Componente[4];
	}

	public Componente[] getComp() {
		return comp;
	}
	
	public int determinarPrior() {
		int maior_prioridade = 1;
		for (int i = 0; i < comp.length; i++) {
			if (comp[i].hero) { // logica certa
				
			}
		}
	}
	
	public void setComp(Componente compo) {
		int i =  determinarPrior(compo);
		this.comp[i] = compo;
	}
	
	public void verificarComp() { // se pode colocar na mesma sala
		for (int i = 0; i < comp.length; i++) {
			if (comp[i])
		}
	}
} 
