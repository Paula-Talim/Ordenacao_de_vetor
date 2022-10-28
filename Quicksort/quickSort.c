#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/*
Descricao: essa funcao troca dois elementos de um vetor double
Parametros: um vetor double (vetor que tera os 
elementos trocados) e dois inteiros (indice dos 
dois elementos a serem trocados)
*/
void swap (int vet[], int i, int j) {
    int aux = vet[i];
    vet[i] = vet[j];
    vet[j] = aux;
}

/* 
Descricao: essa funcao ordena um vetor de inteiros 
em ordem crescente com o metodo quicksort

Parametro: um vetor de inteiros (vetor a ser ordenado) 
e dois inteiros (indice do primeiro e do ultimo elemento do vetor)
*/
void quicksort (int vet[], int esq, int dir) {
    int i, j, posicao;
    int pivo;
    i = esq;
    j = dir;
    posicao = (esq + dir) / 2;
    pivo = vet[posicao];

    while (i <= j) {
        while (vet[i] < pivo) {
            i ++;
        }

        while (vet[j] > pivo) {
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
        quicksort(vet, esq, j);
    }

    if (i < dir) {
        quicksort(vet, i, dir);
    }
}