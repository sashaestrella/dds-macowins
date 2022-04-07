public class PrendaVendida {
    Prenda prenda;
    int cantidad;

    public PrendaVendida(Prenda prenda, int cantidad){
        this.prenda = prenda;
        this.cantidad = cantidad;
    }
    public double importePrenda(){
        return prenda.precio() * cantidad;
    }
}
