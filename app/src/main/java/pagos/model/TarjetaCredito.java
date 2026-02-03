package pagos.model;

import pagos.abstratcs.BasePagos;

public class TarjetaCredito extends BasePagos {

    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    protected void porPagar(int monto) {
        System.out.println("Pago de " + monto + " realizado con Tarjeta de Crédito número " + numeroTarjeta);
    }
}
