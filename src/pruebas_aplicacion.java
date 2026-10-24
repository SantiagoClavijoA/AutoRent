import java.time.LocalDate;

public class pruebas_aplicacion {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("AutoFast", "Manizales, Caldas");

        Persona cliente1 = new Turista("88776655", "Lucía Pérez", "lucia@correo.com", "VISA-CA-123");
        Persona cliente2 = new Residente("1010203040", "Mateo Gómez", "mateo@correo.com", "Calle 21 # 5-42");

        Vehiculo vehiculo1 = new Automovil("XYZ987", "Chevrolet", "Joy", 2023, EstadoVehiculo.BUENO, 1.0, 5);
        Vehiculo vehiculo2 = new Motocicleta("QWE12A", "Bajaj", "Pulsar NS", 2022, EstadoVehiculo.BUENO, 1.0, 160);
        Vehiculo vehiculo3 = new Camioneta("MNO456", "Ford", "Ranger", 2021, EstadoVehiculo.MALO, 1.0, 1500);

        empresa.agregarAlquiler(new Alquiler("ALQ-01", LocalDate.of(2026, 6, 10), cliente1, vehiculo1, 4));
        empresa.agregarAlquiler(new Alquiler("ALQ-02", LocalDate.of(2026, 6, 15), cliente2, vehiculo2, 3));
        empresa.agregarAlquiler(new Alquiler("ALQ-03", LocalDate.of(2026, 6, 20), cliente1, vehiculo3, 7));

        empresa.mostrarReporte();
    }
}