package pagos.model;

import java.util.LinkedList;
import java.util.List;

import pagos.interfaces.Pago;

public class CarroCompra {

    private List<Producto> productos = new LinkedList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void removerProducto(Producto producto) {
        productos.remove(producto);
    }

    private int calcularTotal() {
        return productos.stream()
                .map(Producto::getPrecio)
                .reduce(0, Integer::sum);
    }

    public void checkout(Pago metodoPago) {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío. No se puede realizar el pago.");
            return;
        }
        int total = calcularTotal();
        metodoPago.pago(total);
    }

    public void removerProductoPorNombre(String nombre) {
        productos.removeIf(producto -> producto.getNombre().equalsIgnoreCase(nombre));
        System.out.println("Producto con nombre '" + nombre + "' removido del carrito.");
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
            return;
        }
        System.out.println("Productos en el carrito:");
        productos.forEach(producto
                -> System.out.println("- " + producto.getNombre() + ": " + producto.getPrecio())
        );
        int total = calcularTotal();
        System.out.println("Total: " + total);
    }
}