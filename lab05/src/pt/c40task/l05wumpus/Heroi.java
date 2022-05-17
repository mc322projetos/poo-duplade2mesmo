package pt.c40task.l05wumpus;

public class Heroi extends Componente{
    private int pontuacao;
    private int qntFlecha;
    private boolean flechaPronta;

    public void setPontuacao(int i) {
        pontuacao = i;
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
        int i = coordLinhaSala;
        int j = coordColunaSala;
        if (super.getCaverna().getSala(i, j).getMaiorPrior(0) == 'W') {
            Random random = new Random();
            return random.nextBoolean();
        }
        return false;
    }
}
 
