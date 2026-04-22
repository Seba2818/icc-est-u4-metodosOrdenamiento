public class App {
   
    public static void main(String[] args) throws Exception {
        // int [] numeros = {10, 0, -5, 5, 12, 2};
        // runBubbleSort(); 
        runBubbleSortAvz();

    }
    public static void runBubbleSort() {
        //Instanciamos la clase 
        // System.out.println("Metodo burbuja" );
        // int [] numeros = {-5, 10, 2, 0, 7};
        

        // BubbleSort bubbleSort = new BubbleSort();
        // bubbleSort.printArreglo (numeros);
        // // bubbleSort.sortAscendente(numeros);
        // // bubbleSort.printArreglo (numeros);
        // // bubbleSort.sortDescendente(numeros);
        // // bubbleSort.printArreglo (numeros);

        // bubbleSort.sort(numeros, true);
        // bubbleSort.printArreglo (numeros);
        // bubbleSort.sort(numeros, false);
        // bubbleSort.printArreglo (numeros);

    }

    public static void runBubbleSortAvz(){
        int[] array = new int[]{9,2,3,0,8,5,10,50,100};
        // int[] array2 = new int[]{94,2,3,20,8,5};
        // int[] array3 = new int[]{9,2,43,0,8,5};

        //instanciamos la clase
        BubbleSortAvz bSortAvz = new BubbleSortAvz(array);
        // BubbleSortAvz bSortAvz2 = new BubbleSortAvz(array2);
        // BubbleSortAvz bSortAvz3 = new BubbleSortAvz(array3);
        bSortAvz.printArray();
        bSortAvz.sort (true);
        bSortAvz.printArray();
        
    }
}
    