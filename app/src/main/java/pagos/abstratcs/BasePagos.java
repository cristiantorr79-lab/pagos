package pagos.abstratcs;

import pagos.interfaces.Pago;
import pagos.utils.Validar;

public abstract class BasePagos implements Pago {

    @Override
    public void pago(int monto) {
        if (!Validar.validarMonto(monto)) {
            return;
        }
        porPagar(monto);
    }

    protected abstract void porPagar(int monto);

}
