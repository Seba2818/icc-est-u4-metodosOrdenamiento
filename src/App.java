public class App {
    
    


    public static void main(String[] args) throws Exception {
        int [] numeros = {10, 0, -5, 5, 12, 2};
        runBubbleSort(); 

    }
    public static void runBubbleSort() {
        //Instanciamos la clase 
        System.out.println("Metodo burbuja" );
        int [] numeros = {-5, 10, 2, 0, 7};
        

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.printArreglo (numeros);
        // bubbleSort.sortAscendente(numeros);
        // bubbleSort.printArreglo (numeros);
        // bubbleSort.sortDescendente(numeros);
        // bubbleSort.printArreglo (numeros);

        bubbleSort.sort(numeros, true);
        bubbleSort.printArreglo (numeros);
        bubbleSort.sort(numeros, false);
        bubbleSort.printArreglo (numeros);
    }
}
    