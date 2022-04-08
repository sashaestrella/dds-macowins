import java.time.LocalDate;
import java.util.List;

public class VentaConTarjeta extends Venta{
    int coeficienteFijo;
    int cantidadCuotas;

    public VentaConTarjeta(List<PrendaVendida> prendasVendidas, LocalDate fecha, int coeficienteFijo, int cantidadCuotas) {
        super(prendasVendidas, fecha);
        this.coeficienteFijo = coeficienteFijo;
        this.cantidadCuotas = cantidadCuotas;
    }

    @Override
    public double importe(){
        return super.importe() + coeficienteFijo*cantidadCuotas + 0.01*super.importe();
    }
}
