package practica;


public class Profesor extends Persona {
    int numero;
    
    public Profesor(String nombre, String apellidoPat, String apellidoMat, int numero) {
        super(nombre, apellidoPat, apellidoMat);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }
    
    @Override
    public String toString() {
        return "Alumno: " + nombre + " " + apellidoPat + " " + apellidoMat +
               " | Boleta: " + numero;
    }
}
