package formularioempleados;


public class Empleado {
    private String nombre;
    private String apellido;
    private String cargo;

    public Empleado(String nombre, String apellido, String cargo ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        
    }

    Empleado(String nombre) {
        this.nombre = nombre+" "+this.apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido ;
    }
 
}
