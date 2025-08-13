package level3;

public class CuentaBancaria implements MetodoPago {
    private String cuenta;

    public CuentaBancaria(String cuenta) {
        this.cuenta = cuenta;

    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con cuenta bancaria: " + cuenta);

    }
}