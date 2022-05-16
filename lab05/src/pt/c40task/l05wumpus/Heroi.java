public class Heroi extends Componente{
    private int qntFlecha;
    private boolean flechaPronta;
    private int pontuacao;

    public void equiparFlecha() {
        qntFlecha -= 1;
        flechapronta = true;
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

    public boolean acharWumpus() {
        return hero.caverna.getSala(i, j).getComp() == 'W';
    }

    public boolean matarWumpus() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public boolean acharOuro() {
        return hero.caverna.getSala(i, j).getComp() == 'o';
    }
    
    public void capturarOuro() {

    }
    
}
