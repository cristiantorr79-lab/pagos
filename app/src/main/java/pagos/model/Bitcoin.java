package pagos.model;

import pagos.abstratcs.BasePagos;

public class Bitcoin extends BasePagos {

    private String billetera;

    public Bitcoin(String billetera) {
        this.billetera = billetera;
    }

    @Override
    protected void porPagar(int monto) {
        System.out.println(
                "Pago de " + monto + " realizado con Bitcoin a la billetera " + billetera);
    }
}
