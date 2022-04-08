import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Negocio {
    List<Venta> ventas;

    public Negocio(List<Venta> ventas){
        this.ventas = ventas;
    }

    public List<Venta> ventasEnUnaDeterminadaFecha(LocalDate unaFecha){
        return ventas .stream()
                    .filter(venta -> venta.mismaFecha(unaFecha))
                    .collect(Collectors.toList());
    }

    public double gananciaEnUnaFecha(LocalDate unaFecha){
        return ventasEnUnaDeterminadaFecha(unaFecha)
                                            .stream()
                                            .mapToDouble(unaVenta -> unaVenta.importe())
                                            .sum();
    }
}
