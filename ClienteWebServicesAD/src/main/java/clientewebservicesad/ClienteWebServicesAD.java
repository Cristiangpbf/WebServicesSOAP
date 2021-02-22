
package clientewebservicesad;

import javax.swing.JFrame;

public class ClienteWebServicesAD extends JFrame{
    
    public static void main(String[] args){
        int y = 12;
        int x = 21;
        System.out.println(primo(y));
        System.out.println(suma(x,y));        
    }
    
    private static String primo(int primo){        
        uddi.ServicioPrimo_Service service = new uddi.ServicioPrimo_Service();
        uddi.ServicioPrimo port = service.getServicioPrimoPort();        
        return port.primo(primo);
    }
    
    private static double suma(double a, double b){        
        uddi.ServicioOperaciones_Service service = new uddi.ServicioOperaciones_Service();
        uddi.ServicioOperaciones port = service.getServicioOperacionesPort();       
        return port.suma(a,b);
    }
    
    
    



            
}
