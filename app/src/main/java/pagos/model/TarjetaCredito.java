package pagos.model;

public class TarjetaCredito extends PagoAbstracto {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    protected void procesarPago(int monto) {
        System.out.println("Pago de " + monto + " realizado con Tarjeta de Crédito número " + numeroTarjeta);
    }
}
