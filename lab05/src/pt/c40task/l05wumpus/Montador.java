package pt.c40task.l05wumpus;

public class Montador {
    private Caverna caverna;
    private Heroi hero;
    private Componente comp;
    private boolean erro;
    
    Montador() {
        this.caverna = new Caverna();
    }
    
    public Caverna getCaverna() {
        return caverna;
    }
    
    public Heroi getHeroi() {
        return hero;
    }

    public boolean getValidezCaverna() {
        return erro;
    }

// Ao ler o arquivo de entrada, o seu programa deve realizar verificações para que a caverna não seja construída de forma inválida. A seguir é apresentado as verificações no arquivo de entrada:
// Deve haver no mínimo 2 e no máximo 3 buracos;
// Deve haver 1 monstro Wumpus;
// Deve haver 1 ouro;
// Deve haver 1 herói (sempre inicia na célula 1,1)

// 	Após a leitura do arquivo, o herói se movimenta pelas salas da caverna. As verificações das movimentações são as seguintes:
// O herói não pode ir a uma sala fora da caverna;
// Verificar se o usuário digitou uma saída inválida, ou seja qualquer caractere não compreendido pelas teclas de ação.

    public void iniciarLeituraCSV(String[][] cave) {
        this.erro = false;
        int linha, coluna;
        int nBuraco = 0;
        int nOuro = 0;
        int nHeroi = 0;
        int nWumpus = 0;

        for (int i = 0; i < cave.length; i++) {
            linha = Character.getNumericValue(cave[i][0].charAt(0)) - 1;
            coluna = Character.getNumericValue(cave[i][1].charAt(0)) - 1;
            if (cave[i][2].equals("P")) {
                if (linha == 0 && coluna == 0 && nHeroi != 0) {
                    hero = new Heroi(caverna, linha, coluna);
                    erro = hero.getCaverna().conectarComponente(hero);
                    nHeroi += 1;
                } else {
                    erro = true;
                }
            }
            else if (cave[i][2].equals("B")) {
                if (nBuraco < 4) {
                    comp = new Buraco(caverna, linha, coluna);
                    erro = comp.getCaverna().getSala(linha, coluna).conectarComponente(comp);
                    nBuraco += 1;
                } else {
                    erro = true;
                }
            }
            else if (cave[i][2].equals("O")) {
                if (nOuro < 1) {
                    comp = new Ouro(caverna, linha, coluna);
                    erro = comp.getCaverna().getSala(linha, coluna).conectarComponente(comp);
                    nOuro += 1;
                } else {
                    erro = true;
                }
            }
        }

        if (nBuraco < 2)
            erro = true;
        if (nWumpus != 1)
            erro = true;
    }
}
