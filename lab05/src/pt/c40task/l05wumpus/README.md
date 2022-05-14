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
\@ setComp(): void|
\@ getComp(): Componente|
 
## Componente
Componente|
--------|
Atributos:
\@ caverna: Caverna|
\@ coordLinhaSala: int|
\@ coordColunaSala: int|
\- getCoordLinha: int|
\- getCoordColuna: int|
\@ caverna: Caverna|
Metodos:|
 
HERDEIROS:
 
Heroi|
-----|
Atributos:|
\- qntFlecha: int|
\- verificarFlecha(): boolean|
\- equiparFlecha(): void|
\- capturarOuro(): void|
\- matarWumpus(): int|
\- capturarOuro(): boolean| 
Metodos:|
\- mover(i: int, j: int): void|
\@ getPontuacao(): int|
\@ setPontuacao(): void|
 
Wumpus|
------|
Atributos:|
\ @criarFedores(): void

Buraco|
------|
Atributos:|
Metodos:|
\ @criarBrisas(): void|

Ouro|
----|
Atributos:|
Metodos:|

Fedor|
-----|
Atributos:|


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

## Montador
