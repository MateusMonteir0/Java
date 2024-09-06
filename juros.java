public class juros {
    public static void main(String[] args) {
        double principal = 2000.00;
        double taxa = 0.03;
        int meses = 3;

        double montante = calcularMontante(principal, taxa, meses);
        double juros = montante - principal;

        System.out.println("O total de juros a ser pago é: " + juros);
        System.out.println("O montante a ser pago é: " + montante);
    }

    private static double calcularMontante(double principal, double taxa, int meses) {
        return principal * Math.pow((1 + taxa), meses);
    }
}
