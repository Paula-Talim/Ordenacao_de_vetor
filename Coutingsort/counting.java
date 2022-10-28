public class counting {
	/*
	 * Descricao: essa funcao verifica e retorna o maior
	 * elemento de um vetor de inteiros
	 * Parametro: vetor de inteiros (vetor a ser verificado)
	 * Retorno: um inteiro (maior elemento do vetor)
	 */
    public static int getMaior (int[] vet) {
		int maior = vet[0];

		for (int i = 1; i < vet.length; i ++) {
			if (vet[i] > maior) {
				maior = vet[i];
			}
		}

		return maior;
	}

	/* 
	 * Descricao: essa funcao ordena um vetor de inteiros 
	 * em ordem crescente com o metodo counting sort
	 * 
	 * Parametro: um vetor de inteiros (vetor a ser ordenado)
	 */
	public static void countingsort (int[] vet) {
		//Array para contar o numero de ocorrencias de cada elemento
		int[] count = new int[getMaior(vet) + 1];
		int[] ordenado = new int[vet.length];
		
		//Inicializar cada posicao do array de contagem
		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		
		//Agora, o count[i] contem o numero de elemento iguais a i
		for (int i = 0; i < vet.length; i++) {
			count[vet[i]]++;
		}
		
		//Agora, o count[i] contem o numero de elemento menores ou iguais a i
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}
		
		//Ordenando
		for (int i = vet.length-1; i >= 0; i--) {
			ordenado[count[vet[i]]-1] = vet[i];
			count[vet[i]]--;
		}
	}
}
