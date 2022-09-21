-   Modificadores de acesso (servem para diferenciar as permiss�es das implementa��es):
    public (+) -> Aberto para todos (acesso �s implementa��es p�blicas)
    private (-) -> Vis�vel apenas na pr�pria classe
    protected (#) ->
    package (~) ->

    -   s� � um m�todo se estiver dentro de uma classe, dentro do paradigma de orienta��o a objetos

-   Os modificadores de acesso n�o podem ser usados em vari�veis, mas podem ser usados em m�todos.

-   Fun��es em java s�o chamadas de M�TODO
-   Atributos: fica dentro da classe

-   Atributos devem ser encapsulados
    -   somente a classe que � dona do atributo, pode modificar diretamente o valor
    -   os atributos n�o podem ser p�blicos

CONSTRUTOR � respons�vel por criar um objeto e alocar ele na mem�ria

-   o construtor � a primeira coisa a ser executadas

Model = modelo da aplica��o, ou seja, classes que ir�o gerar objetos

POLIMORFISMO: quando existe um m�todo, que usamos e reescrevemos este m�todo

SOBRECARGA: acontece quando temos m�todos com o mesmo nome e diferentes assinaturas

ASSINATURA: public tipo_ref Nome_fun��o Par�metro

-   Posso criar um construtor com os dados que eu quero
-   Se eu n�o criar um construtor ele fica impl�cito na classe

DIAGRAMA DE CLASSE

<!--
_____________________
|    Nome_classe    |
|___________________|
|                   |
|   - Atributos     |
|___________________|
|                   |
|    - M�todos      |
|___________________|

-->

Classes abstratas n�o podem ser instanciadas
Criar superclasses sempre como abstratas

Colocar protected na superclasse
Manter private nas subclasses

M�todos abstratos em superclasses, DEVEM ser implementados (deve ter corpo)
M�todos n�o abstratos, podem ou n�o ser implementados

---

Pr�ximos passos:

-   Interfaces
-   Colletions

PROVA AT� AQUI

-   M�todos de organiza��o
    -   Merge sort
    -   Quik sort
-   Exceptions
-   BD
    Listas, pilhas e filas

Livros de Estrutura de dados e Orienta��o a Objetos

Ex: 2 a 3 atributos em cada classe
