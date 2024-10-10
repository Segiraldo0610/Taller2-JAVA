public class Principal {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto producto1 = new Producto("Laptop", 10, 1500.99);
        Producto producto2 = new Producto("Mouse", 50, 19.99);

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);

        System.out.println("Inventario completo:");
        inventario.mostrarInventario();

        System.out.println("\nBuscando 'Mouse':");
        Producto productoBuscado = inventario.buscarProducto("Mouse");
        if (productoBuscado != null) {
            System.out.println(productoBuscado);
        }

        System.out.println("\nModificando cantidad de 'Laptop':");
        inventario.modificarCantidad("Laptop", 15);
        inventario.mostrarInventario();
    }
}
