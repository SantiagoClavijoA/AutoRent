public class Motocicleta extends Vehiculo {
    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo, int año, EstadoVehiculo estado, double tarifa, int cilindraje) {
        super(placa, marca, modelo, año, estado, tarifa);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularTarifa() {
        return getTarifa() * getTarifabase();
    }

    @Override
    public String toString() {
        return super.toString() + ", Motocicleta{" +
                "cilindraje=" + cilindraje +
                '}';
    }
}
