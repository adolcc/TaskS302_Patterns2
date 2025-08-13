package level3;

public class TiendaZapatos {
    private PasarelaPago pasarela = new PasarelaPago();

    public void venderZapatos(MetodoPago metodo, double monto) {
        System.out.println("Procesando venta de zapatos...");
        pasarela.procesarPago(metodo, monto);
        System.out.println("Venta completada.\n");
    }
}
