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
\- comp: Componente[]|
Metodos:|
\@ Sala()|
\@ verificarComp(): boolean|
\@ determinarPrior(); int|
\@ setComp(): void|
\@ getComp(): Componente|
 
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
 
HERDEIROS:
 
Heroi|
-----|
Atributos:|
\- qntFlecha: int|
\- flechaDisp: boolean|
Metodos:|
\- podeFlecha(): boolean|
\- equiparFlecha(): void|
\- atirarFlecha(): void|
\- capturarOuro(): void|
\- capturarOuro(): boolean|
\- cairBuraco(): boolean|
\- matarWumpus(): boolean|
\- mover(i: int, j: int): void|
\@ getPontuacao(): int|
\@ setPontuacao(): void|
 
Wumpus|
------|
Atributos:|
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
