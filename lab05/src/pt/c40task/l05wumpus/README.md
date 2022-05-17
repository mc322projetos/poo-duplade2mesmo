# Classes implementadas por nós em UML
 
<i>@ significa: a ser decidido</i>
 
## Caverna
 
Caverna   |
----------|
Atributos:|
\- salas: Sala[][]|
Metodos:|
\@ criarSalas(): void|
\@ conectarComponente(): void|
\@ getSala(): Sala|

## Sala
Sala|
----------|
Atributos:|
\- arrayComp: ArrayList<Componente>|
\- hero: Heroi|
\- w: Wumpus|
\- gold: Ouro|
\- trap: Buraco|
\- breeze: Brisa|
\- fed: Fedor|
Metodos:|
\@ Sala(hero: Heroi, w: Wumpus, gold: Ouro, trap: Buraco, breeze: Brisa, fed: Fedor)|
\@ getMaiorPrior(i: int): Componente|
\@ podeMesmaSala(): boolean|
\@ eliminarComponente(): void|
 
## Componente
Componente|
--------|
Atributos:
\@ caverna: Caverna|
\@ coordLinhaSala: int|
\@ coordColunaSala: int|
Metodos:|
\+ getcaverna();
\+ getCoordLinha: int|
\+ getCoordColuna: int|
\+ executarAcao(): boolean|
 
HERDEIROS:
 
Heroi|
-----|
Atributos:|
\- qntFlecha: int|
\- flechaDisp: boolean|
\- pontuacao: int|
Metodos:|
\+ podeFlecha(): boolean|
\+ equiparFlecha(): void|
\+ atirarFlecha(): void|
\+ cairBuraco(): boolean|
\+ acharWumpus(): boolean|
\+ executarAcao(): boolean|
\+ mover(i: int, j: int): void|
\+ getPontuacao(): int|
\+ setPontuacao(): void|
 
Wumpus|
------|
Metodos:|
\ @criarFedores(): void

Fedor|
-----|
Atributos:|
Metodos:|

Buraco|
------|
Atributos:|
Metodos:|
\ @criarBrisas(): void|

Brisa|
Atributos:|
Metodos:|

Ouro|
----|
Atributos:|
Metodos:|



## Controle
|Controle|
---------|
Atributos:
\- command: String|
\- hero: Heroi|
Metodos:
\- Controle(hero: Heroi)|
\- receberMovimento(command: String): void|
\- executarMovimento(): void|
\- pontuar(): void|

## Montador
