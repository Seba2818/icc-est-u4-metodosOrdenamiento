public class BubbleSort {

    public BubbleSort() {
    }


    public void sortAscendente (int numeros []) {
        for (int i = 0; i< numeros.length; i++) {
            for (int j = i+1 ; j < numeros.length; i++) {

                if (numeros[i] > numeros[j]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }

        }
    }
}
