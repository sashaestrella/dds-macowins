public interface Estado {
    default double Estado(double precio){return this.precioFinal(precio);}
    double precioFinal(double precio);
}
