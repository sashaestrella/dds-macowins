public class Promocion implements Estado {
    int valor;

    public Promocion(int valor){
        this.valor = valor;
    }

    @Override
    public double precioFinal(double precio) {
        return precio-valor;
    }
}
