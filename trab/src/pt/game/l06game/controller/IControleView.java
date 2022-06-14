public interface IControleView {
    /**
     * Notifica o Controle que o usuario clicou para sair.
     */
    public void clickQuitJogo();

    /**
     * Notifica o Controle que o usuario clicou para mostrar a loja.
     */
    public void clickShowLoja();

    /**
     * Notifica o Controle que o usuario clicou para fechar a loja.
     */
    public void clickCloseLoja();

    /**
     * Notifica o Controle que o usuario adotou um gato.
     */
    public void clickAdoptGato(int especie);
}
