# Quicksort
<!-- 
## Funcionamento
-->

## Funcionalidades
Nesse diretório há códigos, os quais executam o quicksort, ordenando vários tipos de vetor em 3 linguagens de programação diferentes.

<details>
<summary>Ordenando vetor de inteiros</summary>

### *Ordem crescente*
- [C](./c/quickIntCrescente.c)
- [C++](./cpp/quickIntCrescente.cpp)
- [Java](./java/quickIntCrescente.java)

### *Ordem decrescente*
- [C](./c/quickIntDecrescente.c)
- [C++](./cpp/quickIntDecrescente.cpp)
- [Java](./java/quickIntDecrescente.java)
</details>

<details>
<summary> Ordenando vetor Float</summary>

### *Ordem crescente*
- [C](./c/quickFloatCrescente.c)
- [C++](./cpp/quickFloatCrescente.cpp)
- [Java](./java/quickFloatCrescente.java)

### *Ordem decrescente*
- [C](./c/quickFloatDecrescente.c)
- [C++](./cpp/quickFloatDecrescente.cpp)
- [Java](./java/quickFloatDecrescente.java)
</details>

<details>
<summary>Ordenando vetor Double</summary>

### *Ordem crescente*
- [C](./c/quickDoubleCrescente.c)
- [C++](./cpp/quickDoubleCrescente.cpp)
- [Java](./java/quickDoubleCrescente.java)

### *Ordem decrescente*
- [C](./c/quickDoubleDecrescente.c)
- [C++](./cpp/quickDoubleDecrescente.cpp)
- [Java](./java/quickDoubleDecrescente.java)
</details>

<details>
<summary>Ordenando vetor de caracteres</summary>

### *Ordem crescente*
- [C](./c/quickCharCrescente.c)
- [C++](./cpp/quickCharCrescente.cpp)
- [Java](./java/quickCharCrescente.java)

### *Ordem decrescente*
- [C](./c/quickCharDecrescente.c)
- [C++](./cpp/quickCharDecrescente.cpp)
- [Java](./java/quickCharDecrescente.java)
</details> 

<details>
<summary>Ordenando vetor de Strings</summary>

### *Ordem crescente*
- C++ (em breve)
- [Java](./java/quickStringCrescente.java)

### *Ordem decrescente*
- C++ (em breve)
- [Java](./java/quickStringDecrescente.java)
</details>

## Implantação do algoritmo

### 1º Passo

Para implementar o método quicksort no seu código primeiro copie e cole as funções e procedimentos

- `void swap (int vet[], int i, int j)`
- `void quick (int vet[], int esq, int dir)`
- `void quicksort (int vet[])`

### 2º Passo

Por fim, para ordenar seu array chame pela função `quicksort()`, passando por parâmentto o vetor que deseja ordenar

``` 
quicksort(nome_do_vetor); 
```

> 💡 Observação
>
> Os argumentos das funções podem mudar de acordo com a liguagem de programação utilizada.

## Modo desenvolvedor

Para a execussão dos códigos é aconselhável que os códigos em [C](./c) e [C++](./cpp) sejam executados na [IDE Code::Blocks](https://www.codeblocks.org/) ou no [Visual Studio Code](https://code.visualstudio.com/) (caso possua as extensões adequadas instaladas) e os códigos em [Java](./java) na [IDE Eclipse](https://www.eclipse.org/), no cmd ou no [Visual Studio Code](https://code.visualstudio.com/).
