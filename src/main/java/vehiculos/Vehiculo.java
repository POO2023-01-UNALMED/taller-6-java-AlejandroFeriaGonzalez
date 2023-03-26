package vehiculos;

public class Vehiculo {
    protected static int CantidadVehiculos;
    protected String nombre, placa, traccion;
    protected int puertas, velocidadMaxima, precio, peso;
    protected Fabricante fabricante;

    // hecilo por tipo
    protected int numAutomoviles;
    protected int numCamiones;
    protected int numCamionetas;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
            String traccion, Fabricante fabricante) {
        this.nombre = nombre;
        this.placa = placa;
        this.traccion = traccion;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        CantidadVehiculos++;
        fabricante.numeroVentas++;
    }

    /**
     * retornara la
     * cantidad de objetos creados por cada subclase de Vehículo.
     */
    String vehiculoPorTipo() {
        return "Automoviles: " + numAutomoviles + "\n" +
                "Camionetas: " + numAutomoviles + "\n" +
                "Camiones: " + numAutomoviles;
    }

    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

}
