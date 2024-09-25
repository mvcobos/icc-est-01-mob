public class App {
    public static void main(String[] args) throws Exception {

        Metodos metodos = new Metodos();
        int[] arreglo = {5, 7, 30, 12, 9};
        int[] arregloOrdenado = metodos.sortByBubble(arreglo);
        metodos.printArreglo(arregloOrdenado);
        int[] arregloDescendente = metodos.sortByBubbledescendente(arreglo);
        metodos.printArreglodescendente(arregloDescendente);
        String cadena = "este es un ejemplo de texto para Ordenar";
        String[] palabras = cadena.split(" ");
        String[] palabrasOrdenar = metodos.sortByBubblePalabras(palabras);
        metodos.printArregloPalabras(palabrasOrdenar);
    }

    

}
