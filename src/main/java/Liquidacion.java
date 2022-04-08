public class Liquidacion implements Estado {
    @Override
    public double precioFinal(double precio) {
        return precio * 0.5;
    }
}
