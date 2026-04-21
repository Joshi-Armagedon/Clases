package practica;

public class Alumno extends Persona {
    int boleta;

    public Alumno(String nombre, String apellidoPat, String apellidoMat, int boleta) {
        super(nombre, apellidoPat, apellidoMat);
        this.boleta = boleta;
}

    public int getBoleta() {
        return boleta;
    }

    public void setBoleta(int boleta) {
        this.boleta = boleta;
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
               " | Boleta: " + boleta;
    }
}
