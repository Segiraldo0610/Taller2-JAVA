import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarInventario() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        System.out.println("Producto no encontrado.");
        return null;
    }

    public void modificarCantidad(String nombre, int nuevaCantidad) {
        Producto producto = buscarProducto(nombre);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            System.out.println("Cantidad modificada.");
        } else {
            System.out.println("El producto no existe.");
        }
    }
}
