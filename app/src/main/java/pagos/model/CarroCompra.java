package pagos.model;

import java.util.ArrayList;

import pagos.interfaces.Pago;

public class CarroCompra {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void removerProducto(Producto producto) {
        productos.remove(producto);
    }

    public int calcularTotal() {
        return productos.stream().map(Producto::getPrecio).reduce(0, Integer::sum);
    }

    public void checkout(Pago metodoPago) {
        if (productos.isEmpty()) {
            System.out.println("El carro de compra está vacío. No se puede procesar el pago.");
            return;
        }
        int total = calcularTotal();
        metodoPago.pago(total);

    }

    public void removerProductoPorNombre(String nombre) {
        productos.removeIf(producto -> producto.getNombre().equalsIgnoreCase(nombre));
        System.out.println("Producto con nombre " + nombre + " removido del carro de compra.");
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El carro de compra está vacío.");
            return;
        }
        System.out.println("Productos en el carro de compra:");
        productos.forEach(producto -> System.out.println("- " + producto.getNombre() + ": " + producto.getPrecio()));

        int total = calcularTotal();
        System.out.println("Total a pagar: " + total);
    }

}
