public abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int año;
    private EstadoVehiculo estado;
    private double tarifa;
    private static final double tarifaBase = 10000;

    public Vehiculo(String placa, String marca, String modelo, int año, EstadoVehiculo estado, double tarifa) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.estado = estado;
        this.tarifa = tarifa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public EstadoVehiculo getEstado() {
        return estado;
    }

    public void setEstado(EstadoVehiculo estado) {
        this.estado = estado;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public static double getTarifabase() {
        return tarifaBase;
    }

    public abstract double calcularTarifa();

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", estado=" + estado +
                ", tarifa=" + tarifa +
                '}';
    }
}