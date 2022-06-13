package model;

public interface InformaView {
	public boolean play(); // informa para o componente view se esta td pronto para iniciar o jogo
	public boolean mudou();
	public int[] oQueMudou();
}
