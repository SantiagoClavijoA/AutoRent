public class Residente extends Persona {
    private String direccion;

    public Residente(String nombre, String documento, String correo, String direccion){
        super(nombre,documento,correo);
        this.direccion= direccion;

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Residente{" +
                "direccion='" + direccion + '\'' +
                '}';
    }
}
