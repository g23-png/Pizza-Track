public class Pizza {
    private String nombre;
    private String[] ingredientes;

    public Pizza(String nombre, String ingrediente1, String ingrediente2, String ingrediente3) {
        this.nombre = nombre;

        ingredientes = new String[3];
        ingredientes[0] = ingrediente1;
        ingredientes[1] = ingrediente2;
        ingredientes[2] = ingrediente3;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Pizza: " + nombre +
                " | Ingredientes: [" +
                ingredientes[0] + ", " +
                ingredientes[1] + ", " +
                ingredientes[2] + "]";
    }
}