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
> [Slides da apresentação final](https://www.canva.com/design/DAFFFVv_KqQ/cfWruzL7y53D38RErGeRlA/edit?utm_content=DAFFFVv_KqQ&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)

## Relatório de Evolução
Neste projeto, aprendemos a implementar uma arquitetura fundamental para qualquer programador(MVC), o qual foi muito importante para que pudessemos concluir o jogo, pois além de dar mais consistência ao código, nos deu uma visão mais clara do que estavamos fazendo durante a produção do jogo. 

Em relação às dificuldades enfrentadas, tivemos em fazer a comunicação entre os componentes, principalmente em o View e os outros os dois, além disso, também tivemos dificuldade em adicionar um design pattern ao nosso jogo e de implementar a View com o JFrame, ou seja, sem um FrameWork como o LibGDX, o qual também tivemos dificuldade em aprender a implementar.

Agora em relação às melhorias, podemos listar varias, mas as mais importantes seriam implementar a view com o LibGDX, fazer mais labirintos(de forma aleatória) e adicionar outros atores no jogo, como por exemplo mais cachorros. Por fim, podemos dizer que aprendemos diversas coisas, uma delas é começar pelo mais dificil no código, que no caso foi a View, pois nunca tinhamos estudado sobre isso antes.

# Destaques de código
```
@Override
public void actionPerformed(ActionEvent e) { // metodo que recebe evento vindo do usuario e volta para a tela desejada
    if (e.getSource() == back) {
        super.changeScreen(0);
    }
}
```

```
...

public interface IControlView { // interface que é implementada pela Classe Control e que se comunica diretamente com a view
    ...
    public Cronometro getTimer();
    ...
    public void tempoAcabou(boolean ganhou);
    public boolean gatoMorto();
    public boolean moveAttempt(char key);
    public int[] moveAttempt();
 }
 ```
 
 # Destaques de Orientação a Objetos
 ## Código de Destaque OO
 ```
 public class MainScreen extends ScreenAdapter { // uso de herança para todas as telas da view, que herdam da classe abstrata ScreenAdapter
 ...
    MainScreen(View view) {
        super(view);
        ...
        super.getFrame().getContentPane().setBackground(Color,CYAN);
        ...
    }
}
```
```
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
```
```
...
public abstract class Atores { // uso de classe abstrata para representar todos os atores do jogo, que no caso herdam dessa classe genérica e
/// implementam esse método getType()
    public abstract char getType();
}
```

# Destaques de Pattern
## Código do Pattern
```
// Singleton
public class View {
    JFrame frame;
    ...
    public View(Control control) {
        ...
        frame = MyJFrame.getMyFrame();
        ...
    }
}
```
```
// Singleton
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
```

```
// Factory
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
```
```
// Factory
...
TutorialScreen(View view) {
	super(view);
    ...
}
```
// Factory
back = new JButton("Back");
back.addActionListener(this);
```
```
// Factory
 @Override
 public void actionPerformed(ActionEvent e) {
     if (e.getSource() == back) {
         super.changeScreen(0);
     } 
 }
 ```
