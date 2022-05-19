package pt.c40task.l05wumpus;

public class Fedor extends Componente{
    
    Fedor(Caverna caverna, int coordLinhaSala, int coordColunaSala) {
        super(caverna, coordLinhaSala, coordColunaSala);
        super.tipo = 'f';
        super.prior = 3;
    }
    
}
