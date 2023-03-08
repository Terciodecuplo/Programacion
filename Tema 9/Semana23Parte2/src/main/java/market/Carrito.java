package market;

import java.util.ArrayList;

public class Carrito {
    private final ArrayList<Elemento> listaElementos = new ArrayList<>();

    public void agrega(Elemento elemento) {
        this.listaElementos.add(elemento);
    }

    public int numeroDeElementos() {
        return this.listaElementos.size();
    }

    public double importeTotal() {
        double importe = 0;
        for (Elemento elemento : listaElementos) {
            importe += elemento.getPrecio() * elemento.getUnidades();
        }
        return importe;
    }

    @Override
    public String toString() {
        String messageHeader = "Contenido del carrito\n=====================\n";
        String showElementContent = "";
        for (Elemento elemento : this.listaElementos) {
            showElementContent += elemento.getNombreProducto();
            showElementContent +=
                    " PVP: " + String.format("%.2f", elemento.getPrecio()) +
                    " Unidades: " + elemento.getUnidades() +
                    " Subtotal: " + String.format("%.2f", (elemento.getUnidades() * elemento.getPrecio())) + "\n";
        }
        return messageHeader + showElementContent;
    }
}
