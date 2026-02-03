package pagos.utils;

public class Validar {

    public static boolean validarMonto(int monto) {
        if (monto <= 0) {
            System.out.println("El monto debe ser mayor que cero.");
            return false;
        }
        return true;
    }
}
