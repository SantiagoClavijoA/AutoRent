public class Camioneta extends Vehiculo {
    private double capacidadCarga;

    public Camioneta(String placa, String marca, String modelo, int año, EstadoVehiculo estado, double tarifa, double capacidadCarga) {
        super(placa, marca, modelo, año, estado, tarifa);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularTarifa() {
        return getTarifabase() + 50000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Camioneta{" +
                "capacidadCarga=" + capacidadCarga +
                '}';
    }
}
