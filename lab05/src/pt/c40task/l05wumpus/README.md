# Classes implementadas por nós em UML
 
<i>@ significa: a ser decidido</i>
 
## Caverna
 
Caverna     |
----------|
Atributos:|
\- salas: Sala[][]|
Metodos:|
\@ criarSalas(): void|
\@ conectarComponente(): void| 
//met acima chama o met homonimo da Sala e ela faz a conexao propriamente dita, fiquei na duvida se eh isso
eh isso msm acho

 
## Sala
Sala|
----------|
Atributos:|
\- comp: Componente[]|
Metodos:|
\@ Sala()|
\@ verificarComp(): boolean|
\@ conectarComponente(): void| 
 
## Componente
Componente|
--------|
Atributos:
\@ tipo: Char|
\@ coordSala: int[]|
\@ caverna: Caverna|
Metodos:|
 
HERDEIROS:
 
Heroi|
-----|
Atributos:|
\- qntFlecha: int|
\- verificarFlecha(): boolean|
\- equiparFlecha(): void|
Metodos:|
\- mover(): void|
 
Wumpus|
------|
Atributos:|
\ criarFedores(): void
 
## Controle
|Controle|
---------|
Atributos:
\-command: String|
\-caverna: Sala[][]|
\-hero: Heroi|
Metodos:
\@ Controle(command: String)|

## Montador
