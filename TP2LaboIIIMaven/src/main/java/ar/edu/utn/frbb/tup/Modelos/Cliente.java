package ar.edu.utn.frbb.tup.Modelos;

public class Cliente {
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String numTelefono;

    public Cliente(String dni, String nombre, String apellido, String direccion, String numTelefono){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    @Override
    public String toString() {
        return "Cliente{ " +
                "DNI='" + dni + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", Dirección='" + direccion + '\'' +
                ", Teléfono='" + numTelefono + '\'' +
                '}';
    }

    
    

    
}
