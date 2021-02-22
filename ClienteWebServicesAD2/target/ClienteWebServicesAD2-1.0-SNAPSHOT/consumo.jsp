<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    </head>
    <body>
        <h1>Calculo de sueldo total por horas trabajadas</h1>

        <%!
            String a = null;
            String b = null;
        %>

        <form action="consumo.jsp" method="POST">
            <div class="form-group">
                <label for="txt_palabra">Horas</label>
                <input type="text" name="txt_horas"/>    
                <label for="txt_palabra">Pago por hora</label>
                <input type="text" name="txt_pago"/> 
            </div>
            <div class="form-group text-left">
                <hr/>
                <button type="submit" class="btn btn-primary">Calcular pago</button>
            </div>
        </form>
        
        <% a = request.getParameter("txt_horas"); %>
        <% b = request.getParameter("txt_pago"); %>
        
        
        <%-- start web service invocation --%><hr/>
        <%
            uddi.ServicioCalculosPrueba_Service service = new uddi.ServicioCalculosPrueba_Service();
            uddi.ServicioCalculosPrueba port = service.getServicioCalculosPruebaPort();
            try { // Call Web Service Operation

                // TODO initialize WS operation arguments here
                double horas = Double.parseDouble(a);
                double pagoHoras =Double.parseDouble(b);
                // TODO process result here
                double result = port.calculoHorasSueldo(horas, pagoHoras);
                out.println("Total pago = " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        <%-- end web service invocation --%><hr/>

    </body>
</html>








