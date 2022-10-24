import java.util.Random;

public class quickInt {
    /* Trocar valores */
	public static void swap (int[] vet, int i, int j) {
		int aux = vet[i];
		vet[i] = vet[j];
		vet[j] = aux;
	}

    public static void quicksort (int[] vet, int esq, int dir) {
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

			if (i<=j) {
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
}