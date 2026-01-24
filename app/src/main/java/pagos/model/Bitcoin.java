package pagos.model;

import pagos.interfaces.Pago;

public class Bitcoin implements Pago {
    private String billetera;

    public Bitcoin(String billetera) {
        this.billetera = billetera;

    }

    @Override
    public void pago(int monto) {
        System.out.println("Pago de " + monto + " realizado con Bitcoin a la billetera " + billetera);

    }

}
