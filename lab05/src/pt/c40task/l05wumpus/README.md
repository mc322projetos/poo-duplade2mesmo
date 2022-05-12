# Classes implementadas por nós em UML
 
<i>@ significa: a ser decidido</i>
 
## Caverna
 
Caverna     |
:----------:|
Atributos:|
\- salas: Sala[][]|
Metodos:|
\@ criarSalas(): void|
\@ conectarComponente(): void|
 
## Sala
Sala|
:----------:|
Atributos:|
\- comp: Componente[]|
Metodos:|
\@ Sala()|
\@ verificarComp(): boolean|
 
## Componente
Componente|
:--------:|
Atributos:
\@ tipo: Char|
\@ coordSala: int[]|
\@ caverna: Caverna|
Metodos:|
 
Herdeiros:
 
Heroi|
:---:|
Atributos:|
\- qntFlecha: int|
\- verificarFlecha(): boolean|
\- equiparFlecha(): void|
Metodos:|
\- mover(): void|
 
Wumpus|
:----:|
Atributos:|
\ criarFedores(): void
 
## Controle
:----------:|
Atributos:
\-command: String|
\-caverna: Sala[][]|
\-hero: Heroi|
Metodos:
\@Controle(command: String)|

## Montador
