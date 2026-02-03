package pagos.model;

import pagos.abstratcs.BasePagos;

public class Paypal extends BasePagos {

    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    protected void porPagar(int monto) {
        System.out.println("Pago de " + monto + " realizado con Paypal a la cuenta " + email);
    }

}
