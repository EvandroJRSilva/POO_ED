# Aula 04

## Revisão Rápida

Para programar em Java, você precisa:

* Ter instalado
  * Um `JDK`.
  * Uma `IDE`.
* Definir um espaço de trabalho (_workspace_): basicamente a pasta onde estará ou estarão os seus projetos.
  * Criar um `Projeto Java`, o qual vai ser todo preparado pela IDE, contendo todo o básico para programar em Java.
    * Dentro do `Projeto`, criar o `pacote` `scr`, onde estarão os códigos fonte do seu programa. O pacote é como se 
      fosse uma pasta.
    * Criar subpacotes dentro do `src`, para organizar seu código. Por exemplo, esta aula está no pacote `src.aula04.
      texto`. Os códigos estão no `pacote` `src.aula04.codigos`.
* Aprender a `sintaxe` do `Java` (você **só vai conseguir aprender** se praticar com frequência)
  * Existem muitos materiais de apoio na Internet, gratuitos e pagos.
  * Com uma pesquisa rápido você conseguirá a resposta para praticamente qualquer dúvida sobre a `sintaxe`.
  * Absolutamente ninguém conhece a `sintaxe` inteira de cor. Pesquisas na `documentação oficial` e em sites como 
    `stackoverflow` são constantes na vida de um programador.

A programação em Java é feita através de `classes`: 

* Cada arquivo deve ser uma `classe` diferente.
  * Cada arquivo deve ter exatamento o mesmo nome da `classe`. Ex.: a classe `Pessoa` deverá ser programada em um 
    arquivo chamado `Pessoa.java`.
* Deve haver o `método main` em pelo menos uma `classe`, que é a classe a partir de onde será iniciada a execução.
* Toda `classe` deve ter, na primeira linha do arquivo, o nome do `pacote` ao qual pertence.
* Por convenção os nomes das classes começam com letra maiúscula. Cada nova palavra no nome deve ser escrita junta e 
  começando com outra letra maiúscula. Ex.: PessoaFisica.
* Cada `classe` pode ter quantos `construtores` forem necessários
  * Cada `construtor` deve ter o exato mesmo nome da `classe`.
  * O `construtor padrão` não recebe qualquer `parâmetro` e também não faz nada.
  * O `construtor padrão` será sempre implícito enquanto você não declarar qualquer outro `construtor`.
  * A partir do momento em que você declara um `construtor`, você precisa declarar o `construtor padrão`, caso 
    queira utilizá-lo.
* Um `construtor` serve para que você crie `objetos` daquela `classe` com valores iniciais diferentes dos valores 
  padrões.
  * Valores padrões são os valores iniciais de cada `tipo`. Ex.: para uma `String`, o valor padrão inicial é `null`, 
    ou seja nulo.
* Toda `classe` é constituída (não obrigatoriamente) por `atributos` e `métodos`.
* Toda `classe` é a descrição de um `objeto`. Todo `objeto` é a `instância` de uma `classe`. Uma `classe` pode ter 
  múltiplas `instâncias`, ou seja, múltiplos `objetos`.

## Sobrecarga

Como vimos, cada `classe` pode ter uma quantidade indeterminada de `construtores` e que cada `construtor` terá o 
mesmo nome da `classe`. Como o `construtor` é um `método`, temos então vários `métodos` com o mesmo nome. O termo 
técnico para esse acontecimento é `sobrecarga`.

É possível, então, fazer `sobrecarga` de outros `métodos`? Sim!

Da mesma forma que nos `construtores`, cada método `sobrecarregado` precisa ter um conjunto de `parâmetros` 
diferentes, em relação ao tipo. Exemplos:

```java
public class Exemplo {
    public int adicionar() {
        return 1 + 1;
    }

    public int adicionar(int a) {
        return a + 1;
    }

    public int adicionar(int a, int b) {
        return a + b;
    }
}
```

Os três métodos acima possuem o mesmo nome, mas a `assinatura` é diferente. Isso faz com que sejam métodos 
sobrecarregados. Os métodos a seguir não terão `assinatura` diferente, portanto **não temos uma sobrecarga válida**:

```java
public class Exemplo {
    public int adicionar(int a, int b) {
        return a + b;
    }

    public int adicionar(int var1, int var2) {
        return var1 + var2;
    }
}
```

Formalmente, a `assinatura` de um método possui: **nome**, **quantidade de parâmetros** (ou argumentos), **tipo dos 
parâmetros** e **ordem dos parâmetros**.

## Exercícios

1. Crie uma classe Pessoa que possua, entre seus atributos: _nome_, _nome do meio_ e _sobrenome_. Crie três métodos 
   sobrecarregados de forma que no primeiro seja impresso somente o nome, no segundo nome e sobrenome, e no terceiro 
   o nome completo.
2. Crie uma classe chamada cachorro, com um método sobrecarregado chamado `apresentação`. A partir desse método, 
   deverá ser impresso no `console` somente o nome do cachorro, ou nome e raça, ou nome, raça e idade.
3. Você trabalha em uma empresa especialista em máquinas de fazer café e sua equipe é a responsável por desenvolver 
   uma classe para o novo modelo de cafeterias que irão fabricar. No modelo anterior das cafeterias, os usuários 
   podiam selecionar se era para ser adicionado açúcar ou não, mas a nova versão da Super Cafeteria Tabajara Plus++ 
   deve ser capaz de receber a quantidade (em gramas) de açúcar a ser colocada no café. Mesmo com essa nova 
   possibilidade, o usuário não será obrigado a informar quanto de açúcar deseja. Deve-se adicionar 10 gramas de 
   açúcar por padrão caso nenhum valor seja informado. Fonte : [Thiago Faria](https://pt.scribd.com/document/364387101/5-19-Exercicio-sobrecarga-pdf#).
4. Crie uma calculadora para as quatro operações básicas da matemática: adição, subtração, divisão e multiplicação. 
   Na classe da calculadora devem existir métodos sobrecarregados para cada operação matemática, de forma que o 
   usuário possa inserir dois, três ou quatro operandos. O programa deve informar o usuário se a quantidade de 
   parâmetros não for suportada, ou seja, com apenas um ou mais de quatro parâmetros.
5. Implementar os exemplos de 1 a 5 desse site: https://www.includehelp.com/java-programs/method-overloading-programs.aspx