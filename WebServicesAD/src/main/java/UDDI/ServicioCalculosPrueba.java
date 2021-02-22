
package UDDI;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "ServicioCalculosPrueba")
public class ServicioCalculosPrueba {

    @WebMethod(operationName = "CalculoHorasSueldo")
    public double CalculoHorasSueldo (@WebParam(name = "pago_hora") double pago, @WebParam(name = "horas_dia") double horas_dia) {
        return pago*horas_dia*5;
    }
}
