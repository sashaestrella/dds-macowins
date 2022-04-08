import java.time.LocalDate;
import java.util.List;

public class Venta {
    List<PrendaVendida> prendasVendidas;
    LocalDate fecha;

    public Venta(List<PrendaVendida> prendasVendidas, LocalDate fecha) {
        this.prendasVendidas = prendasVendidas;
        this.fecha = fecha;
    }

    public boolean mismaFecha(LocalDate unaFecha){
        return fecha.getMonth() == unaFecha.getMonth() && fecha.getDayOfMonth() == unaFecha.getDayOfMonth() && fecha.getYear() == unaFecha.getYear();
    }

    public double importe(){
        return prendasVendidas
                            .stream()
                            .mapToDouble(prendaVend -> prendaVend.importePrenda())
                            .sum();
    }
}
