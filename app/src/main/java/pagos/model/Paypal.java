package pagos.model;

public class Paypal extends PagoAbstracto {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    protected void procesarPago(int monto) {
        System.out.println("Pago de " + monto + " realizado con Paypal a la cuenta " + email);
    }

}
