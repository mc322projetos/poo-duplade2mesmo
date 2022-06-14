package pt.game.l06game.controller;

public class Loja implements IcontroleView{
    private Model modelo;
    private int moeda;
    private int precos;
    private View view;

    public void clickQuitJogo() {

    }

    public void clickShowLoja() {

    }

    public void clickCloseLoja() {

    }

    public void clickAdoptGato(int especie) {
        if (moeda >= preco[especie])
            modelo.adotouGato(especie);
        else
            view.moedaInsuficiente();
    }
}
