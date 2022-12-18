public class heapsortCharCrescente {
	/*
	* Descricao: essa funcao troca dois elementos de um vetor de inteiros
	* Parametros: um vetor de inteiros (vetor que tera os 
	* elementos trocados) e dois inteiros (indice dos 
	* dois elementos a serem trocados)
	*/
	public static void swap (int[] vet, int i, int j) {
		int aux = vet[i];
		vet[i] = vet[j];
		vet[j] = aux;
	}

	/* 
	* Descricao: essa funcao calcula o indice o elemento pai no heap
	* Parametro: um inteiro (indice do elemento filho)
	* Retorno: um inteiro (indice do elemento pai)
	*/
	public static int indice_pai (int filho) {
		int flag = filho;

		filho /= 2;

		if (flag %2 == 0) {
			filho --;
		}
		return filho;
	}

	/* 
	* Descricao: essa funcao constroi o heap de um vetor de inteiros
	* 
	* Parametros: um vetor de inteiros (vetor a ser construido 
	* a arvore heap) e um inteiro (tamanho valido do vetor)
	*/
	public static void construir (int[] vet, int tam) {
		int indice = indice_pai(tam);
		int i = tam;

		while (i > 0 && vet[i] > vet[indice]) {
			swap (vet, i, indice);

			i = indice_pai(i);

			if (indice % 2 == 0) {
				indice = indice_pai(indice);
			} else {
				indice /= 2;
			}
		}
	}

	/*
	* Descricao: essa funcao reconstroi um vetor 
	* de numeros de inteiros com a arvore heap ja construida 
	* 
	* Parametros: vetor de inteiros (vetor a ser reconstruido) 
	* e um inteiro (tamanho valido do vetor)
	*/
	public static void reconstruir (int[] vet, int tam) {
		int filho;
		int meio = indice_pai(tam);
		int i = 0;

		//Verifica se ainda possui filhos
		while(i <= meio) {
			//Seleciona o maior filho
			if (2*i+1 == tam || vet[2*i+1] > vet[2*i+2]) {
				filho = 2*i+1;
			} else {
				filho = 2*i + 2;
			}

			//reconstroi o vetor
			if (vet[i] < vet[filho]) {
				swap (vet, i, filho);
				i = filho;
			} else {
				i = tam;
			}
		}
	}

	/* 
	* Descricao: essa funcao ordena um vetor com numeros 
	* do tipo inteiro em ordem crescente com o metodo HeapSort
	* 
	* Parametro: um vetor de inteiros (vetor a ser ordenado)
	*/
	public static void heapsort (int[] vet) {
		int tam;

		//Construcao do heap
		for (tam = 1; tam < vet.length; tam++) {
			construir(vet, tam);
		}

		//Ordenacao do vetor
		tam = vet.length - 1;
		while (tam > 0) {
			swap(vet, 0, tam--);
			reconstruir(vet, tam);
		}
	}
}
