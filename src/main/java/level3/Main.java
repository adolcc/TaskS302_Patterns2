package level3;

public class Main {
    public static void main(String[] args) {
        TiendaZapatos tienda = new TiendaZapatos();

        MetodoPago tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        MetodoPago paypal = new Paypal("cliente@email.com");
        MetodoPago cuenta = new CuentaBancaria("ES1234567890");

        tienda.venderZapatos(tarjeta, 50.0);
        tienda.venderZapatos(paypal, 75.5);
        tienda.venderZapatos(cuenta, 100.0);
    }
}