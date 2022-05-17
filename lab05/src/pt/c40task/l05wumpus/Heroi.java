package pt.c40task.l05wumpus;

public class Heroi extends Componente{
    private int pontuacao;
    private int qntFlecha;
    private boolean flechaPronta;

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void equiparFlecha() {
        qntFlecha -= 1;
        flechaPronta = true;
    }

    public int flechasDisp() {
        return qntFlecha;
    }

    public boolean podeAtirar() {
        if (flechasDisp() == 0)
            flechaPronta = false;
        return flechaPronta;
    }


    public void atirarFlecha() {
        flechaPronta = false;
    
    }
    
    public boolean capturarOuro() {
        return (super.getCaverna().getSala(i, j).getMaiorPrior(0) == 'o');

    }

    public boolean lutarContraWumpus() {
        super.lutarContraWumpus();
    }
}
 
