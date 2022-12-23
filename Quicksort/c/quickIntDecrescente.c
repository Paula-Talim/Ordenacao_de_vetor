#include <stdio.h>
#include <stdlib.h>

/*
Descricao: essa funcao troca dois elementos de um vetor de inteiros
Parametros: um vetor de inteiros (vetor que tera os 
elementos trocados) e dois inteiros (indice dos 
dois elementos a serem trocados)
*/
void swap (int vet[], int i, int j) {
    int aux = vet[i];
    vet[i] = vet[j];
    vet[j] = aux;
}

/* 
Descricao: esse procedimento ordena um vetor de inteiros 
em ordem decrescente com o metodo quicksort

Parametro: um vetor de inteiros (vetor a ser ordenado) 
e dois inteiros (indice do primeiro e do ultimo elemento do vetor)
*/
void quick (int vet[], int esq, int dir) {
    int i, j, posicao;
    int pivo;
    
    i = esq;
    j = dir;
    posicao = (esq + dir) / 2;
    pivo = vet[posicao];

    while (i <= j) {
        while (vet[i] > pivo) {
            i ++;
        }

        while (vet[j] < pivo) {
            j --;
        }

        if (i <= j) {
            //Troca dos valores no vetor
            swap(vet, i, j);
            i++;
            j--;
        }
    }
    
    if (esq < j) {
        quick (vet, esq, j);
    }

    if (i < dir) {
        quick (vet, i, dir);
    }
}

/*
Descricao: esse procedimento chama pelo procedimento quick 
para ordena o vetor em ordem decrescente, possuindo 
argumentos mais simplificados

Parametro: um vetor de inteiros (vetor a ser ordenado) 
e um inteiro (quantidade de numeros validos dentro do vetor)
*/
void quicksort (int vet[], int n) {
    quick(vet, 0, n-1);
}