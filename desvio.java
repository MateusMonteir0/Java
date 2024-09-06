import java.util.Arrays;

public class desvio {
    public static void main(String[] args) {
        double[] dados = { 10.0, 15.0, 20.0, 25.0 }; // Substitua pelos seus próprios dados

        double media = calcularMedia(dados);
        double somaQuadradosDiferencas = calcularSomaQuadradosDiferencas(dados, media);
        double desvioPadrao = Math.sqrt(somaQuadradosDiferencas / dados.length);

        System.out.println("Desvio Padrão: " + desvioPadrao);
    }

    private static double calcularMedia(double[] dados) {
        double soma = 0.0;
        for (double valor : dados) {
            soma += valor;
        }
        return soma / dados.length;
    }

    private static double calcularSomaQuadradosDiferencas(double[] dados, double media) {
        double soma = 0.0;
        for (double valor : dados) {
            double diferenca = valor - media;
            soma += diferenca * diferenca;
        }
        return soma;
    }
}
