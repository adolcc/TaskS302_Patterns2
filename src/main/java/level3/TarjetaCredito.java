package level3;


public class TarjetaCredito implements MetodoPago {
    private String numero;

    public TarjetaCredito(String numero) {
        this.numero = numero;

    }


    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con tarjeta de crédito: " + numero);

    }
}
