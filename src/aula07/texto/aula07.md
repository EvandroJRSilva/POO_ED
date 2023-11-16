# Coleções e Exceções

* [Tutoriais oficiais da Oracle - _Java Tutorials_](https://docs.oracle.com/javase/tutorial/)
  * [Coleções ou _Collections_](https://docs.oracle.com/javase/tutorial/collections/index.html)
  * [Exceções ou _Exceptions_](https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html)

## Coleções

Uma `coleção`, `collection`, ou `container`, é um objeto que agrupa múltiplos objetos. Em `Java`, as `Collections` 
são utilizadas para armazenar, recuperar, manipular e permitir a comunicação entre dados agregados. O `collection 
framework` do `Java` é uma arquitetura unificada para representação e manipulação de coleções. Todos os `frameworks` 
contêm:

* **Interfaces**;
* **Implementações** [das `interfaces`] --- basicamente estruturas de dados reutilizáveis;
* **Algoritmos** --- os `métodos` (por exemplo: `sort` ou `search`).

### Interfaces

O núcleo de `interfaces` encapsula diferentes tipos de coleções, de forma que elas possam ser manipuladas 
independentemente dos detalhes de suas representações.

![Hierarquia das coleções](..\imagens\figura01.png)

* **Collection**: raiz da hierarquia. É o denominador comum de todas as `coleções` implementadas, e pode ser utilizada 
  como o mais genérico possível que alguma coleção possa ser. Não existe uma implementação direta desta `interface`.
* **Set**: uma `coleção` que não pode conter elementos duplicados.
* **List**: uma `coleção` ordenada (também chamada de `sequência`). Pode conter elementos duplicados.
* **Queue**: uma `coleção` usada para armazenar elementos antes de seu processamento. Tradução direta: **fila**. 
  Provê operações adicionais de inserção, extração e inspeção em relação à `interface` `Collection`.
* **Deque**: similar a `Queue`. A diferença é que o `Queue` segue por padrão o conceito `FIFO` (_First In First Out_)
  , ou seja, todo novo elemento é inserido no fim, e toda remoção acontece com o primeiro elemento da `coleção`. O 
  `Deque`, por sua vez, usa tanto o `FIFO` quanto o `LIFO` (_Last In First Out_), e todos os elementos podem ser 
  inseridos e removidos em ambas as pontas.
* **Map**: mapeia chaves e valores. Não pode haver chaves duplicadas, e cada chave deve mapear pelo menos um valor.
* **SortedSet**: um conjunto (`Set`) com ordenação ascendente.
* **SortedMap**: um `Map` com chaves ordenadas de forma ascendente.

### Implementações

As implementações são os objetos usados para armazenar as `coleções`, ou seja, no nosso contexto, são as 
implementações das `interfaces` de `coleção`. As implementações são divididas entre aquelas de **propósito geral** e 
**propósito especial**.

Lista de implementações de **propósito geral** (o * indica a implementação de uso mais comum de cada tipo):

* `Set`: `HashSet`*, `TreeSet` e `LinkedHashSet`.
  * ![Quadro de Resumo](..\imagens\figura02_02.png)
* `List`: `ArrayList`* e `LinkedList`.
  * ![Quadro de Resumo](..\imagens\figura02_03.png)
* `Queue`: `PriorityQueue` e `LinkedList`*.
* `Deque`: `ArrayDeque`* e `LinkedList`.
* `Map`: `HashMap`*, `TreeMap` e `LinkedHashMap`.
  * ![Quadro de Resumo](..\imagens\figura02_01.png)

![Implementações de Propósito Geral](..\imagens\figura03.png)

Lista de implementações de **propósito especial**:

* `Set`: `EnumSet` e `CopyOnWriteArraySet`.
* `List`: `CopyOnWriteArrayList`.
* `Queue`: não possui de propósito especial, mas possui implementações `concorrentes`: `LinkedBlockingQueue`, 
  `ArrayBlockingQueue`, `PriorityBlockingQueue`, `DelayQueue` e `SynchronousQueue`.
* `Deque`: mesma situação de `Queue`, tendo a implementação `concorrente` `LinkedBlockingDeque`.
* `Map`: `EnumMap`, `WeakHashMap` e `IdentityHashMap`.

### Algoritmos

Alguns `métodos` nativamente implementados para `coleções`:

* `sort`: serve para ordenar uma lista.
* `shuffle`: serve para embaralhar os elementos de uma lista.
* `reverse`: reverte a ordem dos elementos.
* `fill`: sobrescreve cada elemento de uma lista com um determinado valor.
* `frequency`: conta a quantidade de vezes que um elemento ocorre em uma coleção.

### Exercícios

[Lista de exercícios para Java Collections - ArrayList](https://www.w3resource.com/java-exercises/collection/index.php).

---

## Exceções

Durante a compilação e execução, quando algum erro ocorre, um objeto especial é criado. Esse objeto possui 
informações sobre o erro ocorrido, incluindo o seu tipo e o estado do programa quando o erro aconteceu. Esse objeto 
é "lançado" (_throw_) pelo `compilador` em busca de algum trecho do programa que possa lidar com ele. Se não houver 
nenhum código para lidar com o erro, a `compilação` ou `execução` é interrompida e o erro é mostrado no `console`. O 
nome dado a esses erros é `exceção`.

> **cheked exceptions** são os erros notificados durante a compilação.

> **unchecked exceptions** são os erros notificados durante a execução (_runtime_).

E se um desenvolvedor não quiser que a compilação ou execução do programa seja interrompida caso aconteça algum erro?

Para este caso é necessário o `tratamento de exceções`, ou seja, o desenvolvimento do trecho de programa que vai 
lidar com o erro. Em `Java` isso é feito com o bloco `try-catch`:

```java
try{
    // comandos ...
}catch (Exception e){
    // tratamento ...
}
```

Todo erro que ocorre dentro de um bloco `try` vai ser tratado pelo bloco `catch` correspondente (ou seja, é possível 
ter vários blocos `catch` seguidos). Se dois ou mais erros puderem ser tratados com as mesmas linhas de código, a 
partir do `Java SE 7` é possível especificá-los dentro do mesmo bloco:

```java
...
catch (IOException | SQLException ex){
    logger.log(ex);
    throw ex;
        }
```

Existe ainda a possibilidade de se acrescentar comandos no código que serão **SEMPRE** executados, independentemente 
se houve erro ou não (exemplo de uso: desconectar de um banco de dados). Essa possibilidade é dada pelo bloco `finally`:

```java
try{
        ...
} catch (ExceptionType e){
        ...
} finally{
        ...
        }
```

Dependendo da situação, às vezes você quer que determinado `método` de alguma `classe` possa _lançar_ uma `exceção`, 
caso venha ocorrer algum erro (por causa de alguma entrada inválida fornecida pelo usuário, por exemplo). Neste caso 
é possível declarar o `método` como _throwable_ (`throws`), ou apenas lançar uma `exceção` caso alguma condição seja 
satisfeita. Exemplo:

```java
import java.rmi.RemoteException;

public class Exemplo {
  public void depositar(double valor) throws RemoteException{
      // implementação ...
    throw new RemoteException();
  }
  ...
  ...
}
```

Exemplo 2:

```java
public Objetct pop(){
    Object obj;
    
    if (size == 0){
        throw new EmptyStackException();
        }
    obj = ...
    ...
}
```

O `Java` também permite que você possa criar sua própria `exceção`:

```java
class MinhaExcecao extends Exception{
  ...
}
```

Outro exemplo:

```java
public class ChequeSemFundoException extends Exception{
    private double valor;
    
    public ChequeSemFundoException(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return valor;
    }
}
```

Utilizando a `exceção` criada em outra `classe`:

```java
// implementações de alguma classe ...
public void sacar(double valor) throws ChequeSemFundoException{
    if (saldo - valor < 0)
        throw ChequeSemFundoException(valor);
        }
```

Como decorar todas as `exceções` nativas do Java?

Você não vai!

Na verdade, com o tempo, e bastante prática, você vai aprendendo sobre as `exceções` mais comuns, e também saber 
pesquisas quais `exceções` podem sre lançadas em determinadas situações.

### Exercícios

[Lista de exercícios para tratar exceções](https://www.w3resource.com/java-exercises/exception/index.php).