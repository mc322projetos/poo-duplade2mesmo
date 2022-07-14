# Projeto
* CatRinto

# Descrição
* A ideia principal do jogo é o gato completar o labirinto no menor tempo possível e não morrer para o cachorro.

# Equipe
* Anderson Murillo Tito Lira Leite, 248221
* Isaac do Nascimento Oliveira, 247175

# Arquivo executável do jogo
> [Link jogo](https://github.com/mc322projetos/poo-duplade2mesmo/blob/main/catrinto/src/CatRinto.jar)

# Slides do projeto

## Link slides prévia
> [Slides Prévia](https://github.com/mc322projetos/poo-duplade2mesmo/blob/main/catrinto/assets/duplade2mesmo.pdf)

## Slides da apresentação final
> [Slides da apresentação final](https://github.com/mc322projetos/poo-duplade2mesmo/blob/main/catrinto/assets/final.pdf)

## Relatório de Evolução

Neste projeto, aprendemos a implementar uma arquitetura fundamental para qualquer programador (o MVC), o qual foi muito importante para que pudessemos concluir o jogo, pois além de dar mais consistência ao código, nos deu uma visão mais clara do que estavamos fazendo durante a produção do jogo. 

Em relação às dificuldades enfrentadas, tivemos em fazer a comunicação entre os componentes, principalmente em o View e os outros os dois, além disso, também tivemos dificuldade em adicionar um design pattern ao nosso jogo e de implementar o view com o JFrame, ou seja, sem um FrameWork como o LibGDX, o qual também tivemos dificuldade em aprender a implementar.

Agora em relação às melhorias, podemos listar varias, mas as mais importantes seriam implementar a View com o LibGDX, fazer labirintos de forma automática e adicionar outros atores no jogo, como por exemplo mais cachorros.

# Destaques de código

~~~java
@Override
public void actionPerformed(ActionEvent e) { // metodo que recebe evento vindo do usuario e volta para a tela desejada
    if (e.getSource() == back) {
        super.changeScreen(0);
    }
}
~~~

~~~java
public interface IControlView { // interface que é implementada pela Classe Control e que se comunica diretamente com a view
    ...
    public Cronometro getTimer();
    ...
    public void tempoAcabou(boolean ganhou);
    public boolean gatoMorto();
    public boolean moveAttempt(char key);
    public int[] moveAttempt();
 }
~~~

# Destaques de Orientação a Objetos

## Código de Destaque OO
 
~~~java
 public class MainScreen extends ScreenAdapter { // uso de herança para todas as telas da view, que herdam da classe abstrata ScreenAdapter
 ...
    MainScreen(View view) {
        super(view);
        ...
        super.getFrame().getContentPane().setBackground(Color.CYAN);
        ...
    }
}
~~~

~~~java
public class Control implements IControlView, IControlModel { // classe que implementa essas duas interfaces
    ...
    
    public boolean moveAttempt(char key) {
        // tratamento da exceção de quando o gato tenta sair da grid
        try {
            return model.moverGato(key);
        } catch (IndexOutOfBounds erro) {
            return false;
        }
    }
}
~~~

~~~java
public abstract class Atores { // uso de classe abstrata para representar todos os atores do jogo, que no caso herdam dessa classe genérica
    public abstract char getType();
}
~~~

# Destaques de Pattern

## Código do Singleton

~~~java
public class View {
    JFrame frame;
    ...
    public View(Control control) {
        ...
        frame = MyJFrame.getMyFrame();
        ...
    }
}
~~~

~~~java
public class MyJFrame extends JFrame {
    private static MyJFrame myFrame;
    
    private MyJFrame() {
        ...
    }
    
    public static MyJFrame getMyFrame() { 
        if (myFrame == null) {
            myFrame = new MyJFrame();
        return myFrame;
        }
   }
}
~~~

O Singleton foi utilizado pois precisávamos de uma único frame na aplicação. O motivo é que sem o frame, ao mudar de tela, abrir-se-ia uma nova janela do jogo,
o que não seria bom para a experiência do usuário.
\
Agora sobre a implementação, criamos a classe MyJFrame, herdeira de JFrame, para poder usar um construtor privado e um método que o chama uma única vez e retorna a instância de MyJFrame, que está armazenada num atributo estático. 
\
Assim, da primeira vez que o método é chamado, um MyJFrame é criado e retornado, das outras vezes é retornada essa mesma instância.


## Código do Factory

~~~java
public abstract class ScreenAdapter {
    private JFrame
    private View view;
	
	private JPanel panel;
	
	ScreenAdapter(View view) {
		this.view = view;
        
		frame = view.getFrame();
		frame.getContentPane().removeAll();
		...
		panel = new JPanel();
		...
		frame.add(panel);
	}
    
    protected void changeScreen(int screen) {
		...
		view.changeScreen(screen, false);
        ...
	}
}
~~~

~~~java
...
TutorialScreen(View view) {
	super(view);
    ...
}
~~~

~~~java
back = new JButton("Back");
back.addActionListener(this);
...
@Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == back) {
         super.changeScreen(0);
    } 
}
~~~

O Factory foi utilizado para facilitar a criação de telas para o nosso jogo. A implementação foi feita com a classe <i>ScreenAdapter</i>, suas herdeiras e a classe principal: View.
\
A primeira é o molde das telas, por exemplo, a TutorialScreen começa com as características do frame estabelecidas da classe mãe. Depois, são feitas alterações conforme a tela.
\
A View possui o método changeScreen(int screen, boolean ganhou), no qual está a lógica de qual classe será criada conforme os argumentos, então ela age como a fábrica e os produtos são as telas.
\
Podemos citar como exemplo de uso da fabricação o terceiro bloco de código. Nele temos um botão da TutorialScreen que chama o método protected changeScren(int screen) da ScreenAdapter, que por sua vez chama o método homônimo da View. 
\
Temos dois métodos, porque há dois tipos de mudança de tela na nossa aplicação: intracomponente e intercomponente. Quanto a primeira, esta foi abordada neste parágrado, a alteração de tela é feita com botões nesse caso: Play, Tutorial, Back, Play Again. São alterações em que o usuário não está jogando em si, por isso sempre ganhou = false. Quanto a segunda, essa sim envolve se o usuário ganhou ou não e classes extracomponente precisam passar isso para o componente view, por essa razão é utilizado o método public changeScreen(...) da View.

# Conclusões e Trabalhos Futuros

Uma possível melhoria que poderia ser aplicada no nosso jogo seria a implementação do Pattern Observer, pois temos um objeto que se move aleatoriamente no jogo (cachorro) e o seu movimento poderia ser notificado para o gato o tempo todo, porém não o implementamos e com certeza em um trabalho futuro nós o usariamos.

# Diagramas

## Componente `<Controller>`


## Detalhamento das Interfaces

### Interface `IControlView`

Interface que se comunica diretamente com a View

~~~java
package controller;

import view.View;

public interface IControlView {
    public void setView(View view);
    public Cronometro getTimer();
    public Montador getMontador();
    public void tempoAcabou(boolean ganhou);
    public boolean gatoMorto();
    public boolean moveAttempt(char key);
    public int[] moveAttempt();
}
~~~

Método | Objetivo
-------| --------
`setView` | Recebe como parâmetro a View e passa para o atributo de instância da classe Control
`getTimer` | Retorna o cronometro que é usado na View.
`getMontador` | Retornar um objeto da Classe Montador
`tempoAcabou` | Para o cronometro na View e troca as Screen
`gatoMorto` | Retorna um boolean que informa se o gato entrou na mesma célula do cachorro ou não
`moveAttempt` | Retorna um boolean que informa à View se o gato pode se mover ou não através de um parâmetro que é o comando recebido do teclado e convertido em char
`moveAttempt` | Retorna um vetor de inteiros que informa as coordenadas sorteadas para o movimento do cachorro

### Interface `IControlModel`

Interface que se comunica diretamente com o Model

~~~java
package controller;

public interface IControlModel {
    public boolean isRunning();
}
~~~

Método | Objetivo
-------| --------
`isRunning` | Retorna um boolean que informa ao Model se o temporizador ainda está rodando


# Plano de Exceções

## Descrição sobre as exceções
Foram feitos apenas tratamentos de exceções com base no IndexOutOfBounds para o movimento do gato e do cachorro caso tentasse acessar uma posição não existente do labirinto, não foram criadas classes e subclasses para o tratamento dessa exceção identificada

