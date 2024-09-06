public class Equacao {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 5.0;
        double c = 3.0;

        double delta = calcularDelta(a, b, c);

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Raiz 1 (x1): " + x1);
            System.out.println("Raiz 2 (x2): " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Raiz única: " + x);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }
    }

    private static double calcularDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}



