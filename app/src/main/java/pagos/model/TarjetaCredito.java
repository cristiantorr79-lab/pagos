package pagos.model;

import pagos.interfaces.Pago;

public class TarjetaCredito implements Pago {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pago(int monto) {
        System.out.println("Pago de " + monto + " realizado con Tarjeta de Crédito número " + numeroTarjeta);
    }
}
