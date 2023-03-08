package market;

import java.util.ArrayList;

public class Carrito {
    private final ArrayList<Elemento> listaElementos = new ArrayList<>();
    public void agrega(Elemento elemento){
        this.listaElementos.add(elemento);
    }
    public int numeroDeElementos(){
        return this.listaElementos.size();
    }
    public double importeTotal(){
        double importe = 0;
        for(Elemento elemento : listaElementos){
           importe += elemento.getPrecio() * elemento.getUnidades();
        }
        return importe;
    }

}
