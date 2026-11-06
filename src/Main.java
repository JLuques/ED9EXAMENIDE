public class Main {
    public static void main(String[] args) {

        double total1 = getTotal(12.5, 4);
        double descuento1 = getDescuento(total1);
        double totalFinal1 = getTotalFinal(total1, descuento1);
        System.out.println("Pedido 1: " + totalFinal1 + " euros");

        double total2 = getTotal(8,5);
        double descuento2 = getDescuento(total2);
        double totalFinal2 = getTotalFinal(total2, descuento2);
        System.out.println("Pedido 2: " + totalFinal2 + " euros");

        double plazo = getPlazo(totalFinal1, totalFinal2);
        System.out.println("Pago de cada plazo (3 plazos): " + plazo + " euros");

        double media = getMediaDeDosUnidades(4,5);
        System.out.println("Media de unidades por pedido: " + media);
    }

    private static double getMediaDeDosUnidades(double unidades1, double unidades2) {
        return (unidades1 + unidades2) / 2;
    }

    private static double getPlazo(double totalFinal1, double totalFinal2) {
        return (totalFinal1 + totalFinal2) / 3;
    }

    private static double getTotalFinal(double total1, double descuento1) {
        return total1 - descuento1;
    }

    private static double getDescuento(double total2) {
        return total2 * 10 / 100;
    }

    private static double getTotal(double pedido1, double unidades1) {
        return pedido1 * unidades1;
    }
}