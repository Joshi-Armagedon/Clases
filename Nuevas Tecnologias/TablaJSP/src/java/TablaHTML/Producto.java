package TablaHTML;

public class Producto {
    int numeroBase = 0;
    
    public Producto(int numero){
        this.numeroBase=numero;
    }
    
    public int retornar(int iteracion){
        return numeroBase * (iteracion + 1);
    }
}

