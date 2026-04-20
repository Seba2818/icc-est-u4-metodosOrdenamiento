public class BubbleSort {

    public BubbleSort() {
System.out.println("Se creo la clase en el constructor");
    }


    public void sortAscendente (int numeros []) {
        for (int i = 0; i< numeros.length; i++) {
            for (int j = i+1 ; j < numeros.length; i++) {

                if (numeros[i] > numeros[j]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }

        }
    }
}
