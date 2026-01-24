package pagos.model;

import pagos.interfaces.Pago;

public class Paypal implements Pago {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void pago(int monto) {
        System.out.println("Pago de " + monto + " realizado con Paypal a la cuenta " + email);
    }

}
