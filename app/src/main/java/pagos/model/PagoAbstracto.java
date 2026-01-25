package pagos.model;

import pagos.interfaces.Pago;

public abstract class PagoAbstracto implements Pago {

    @Override
    public void pago(int monto) {
        if (monto <= 0) {
            System.out.println("El monto del pago debe ser mayor que cero.");
            return;

        }
        procesarPago(monto);
    }

    // Cada medio de pago implementa SOLO esto
    protected abstract void procesarPago(int monto);
}
