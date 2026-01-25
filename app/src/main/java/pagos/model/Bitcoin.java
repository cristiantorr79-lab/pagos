package pagos.model;

public class Bitcoin extends PagoAbstracto {

    private String billetera;

    public Bitcoin(String billetera) {
        this.billetera = billetera;
    }

    @Override
    protected void procesarPago(int monto) {
        System.out.println(
                "Pago de " + monto + " realizado con Bitcoin a la billetera " + billetera);
    }
}
