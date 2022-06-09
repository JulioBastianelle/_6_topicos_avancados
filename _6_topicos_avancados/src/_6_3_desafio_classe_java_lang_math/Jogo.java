package _6_3_desafio_classe_java_lang_math;

public class Jogo {

    private static final int QUANTIDADE_NUMEROS = 6;
    private static final int NUMERO_MAXIMO = 60;
    private int[] numerosSorteados;

    public void sortear() {
        numerosSorteados = new int[QUANTIDADE_NUMEROS];

        for (int i = 1; i <= QUANTIDADE_NUMEROS; i++){
            int numeroSorteado = (int) Math.round(Math.random() * NUMERO_MAXIMO)
            if(!jaFoiSorteado(numeroSorteado) && numeroSorteado != 0){
                numerosSorteados[i-1] = numeroSorteado;
            } else {
                i--;
            }
        }
    }

    public void exibirNumeros() {
        for (int numeroSorteado : numerosSorteados){
            System.out.println(numeroSorteado + " ");
        }
        System.out.println();
    }

    private boolean jaFoiSorteado(int numero) {
        boolean resultado = false;
        for (int i = 0; i < numerosSorteados.length; i++){
            if (numerosSorteados[i] == numero){
                resultado = true;
                break;
            }
        }
        return resultado;
    }
}
