package model;

public interface IModelView {
	public Celula[][] informaMatriz(); // informa para o componente view se esta td pronto para iniciar o jogo
	public boolean mudou();
	public int[] oQueMudou();
}
