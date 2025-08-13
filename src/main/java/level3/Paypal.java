package level3;

public class Paypal implements MetodoPago {
    private String email;

    public Paypal(String email) {
        this.email = email;

    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con Paypal: " + email);

    }
}
