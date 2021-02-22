
package UDDI;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServicioDeberCasa")
public class ServicioDeberCasa {


    @WebMethod(operationName = "TotalLetras")
    public int totalLetras (@WebParam(name = "palabra") String s){        
        return s.length();
    }
    
        @WebMethod(operationName = "Potencia")
    public int potencia (@WebParam(name = "base")int x, @WebParam(name = "exponente")int y){        
        int r=1;
        for(int i = 1; i<=y; i++){
            r = r*x;
        }
        return r;
    }
    
}
