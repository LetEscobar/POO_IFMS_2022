package lp;

// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class OrdenaVetores {

    public static void main(String[] args) {

        int n = 10;
        int vetor[] = new int[n];
        int min = 0;
        int max = 100;
        Random rand = new Random();

        System.out.println("\nVETOR DESORDENADO: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = rand.nextInt(max - min) + min;
            System.out.print(vetor[i] + "\t");
        }

        System.out.println("\n\nVETOR ORDENADO: ");
        Arrays.sort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\t");
        }

    }
}
