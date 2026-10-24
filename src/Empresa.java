import java.util.ArrayList;
import java.util.List;

    public class Empresa {

        private String nombre;
        private String ciudad;
        private List<Persona> listEmpresaPersona = new ArrayList<>();
        private List<Vehiculo> listEmpresaVehiculo = new ArrayList<>();
        private List<Alquiler> listEmpresaAlquiler = new ArrayList<>();

        public Empresa(String nombre, String ciudad) {
            this.nombre = nombre;
            this.ciudad = ciudad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public List<Persona> getListEmpresaPersona() {
            return listEmpresaPersona;
        }

        public List<Vehiculo> getListEmpresaVehiculo() {
            return listEmpresaVehiculo;
        }

        public List<Alquiler> getListEmpresaAlquiler() {
            return listEmpresaAlquiler;
        }
        
        public void agregarAlquiler(Alquiler alquiler) {
            listEmpresaAlquiler.add(alquiler);
        }

        public void mostrarReporte() {
            for (Alquiler alquiler : listEmpresaAlquiler) {
                System.out.println(alquiler + " | Costo Total: $" + alquiler.calcularCostoTotal());
            }
        }

        @Override
        public String toString() {
            return "Empresa{" +
                    "nombre='" + nombre + '\'' +
                    ", ciudad='" + ciudad + '\'' +
                    ", listEmpresaPersona=" + listEmpresaPersona +
                    ", listEmpresaVehiculo=" + listEmpresaVehiculo +
                    ", listEmpresaAlquiler=" + listEmpresaAlquiler +
                    '}';
        }
    }

