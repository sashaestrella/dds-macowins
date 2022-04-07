public class Prenda {
    double precio;
    TipoDePrenda tipo;
    Estado estado;

    public Prenda(Float precio, TipoDePrenda tipo, Estado estado){
        this.precio = precio;
        this.tipo = tipo;
        this.estado = estado;
    }

    public double precio() { return estado.precioFinal(precio); }
    public TipoDePrenda getTipo() { return tipo; }
}
