public abstract class Persona {
    private String nombre;
    private String correo;
    private String documento;

    public persona(String correo, String nombre, String documento) {
        this.correo = correo;
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", documento='" + documento + '\'' +
                '}';
     }
}
