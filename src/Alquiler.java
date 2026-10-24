import java.time.LocalDate;

public class Alquiler {
    private String codigo;
    private LocalDate fecha;
    private Persona persona;
    private Vehiculo vehiculo;
    private int dias;

    public Alquiler(String codigo, LocalDate fecha, Persona persona, Vehiculo vehiculo, int dias) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.persona = persona;
        this.vehiculo = vehiculo;
        this.dias = dias;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double calcularCostoTotal() {
        return vehiculo.calcularTarifa() * dias;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "codigo='" + codigo + '\'' +
                ", fecha=" + fecha +
                ", persona=" + persona +
                ", vehiculo=" + vehiculo +
                ", dias=" + dias +
                '}';
    }
}