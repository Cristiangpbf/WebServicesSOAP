
package uddi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CalculoHorasSueldo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CalculoHorasSueldo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pago_hora" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="horas_dia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculoHorasSueldo", propOrder = {
    "pagoHora",
    "horasDia"
})
public class CalculoHorasSueldo {

    @XmlElement(name = "pago_hora")
    protected double pagoHora;
    @XmlElement(name = "horas_dia")
    protected double horasDia;

    /**
     * Obtiene el valor de la propiedad pagoHora.
     * 
     */
    public double getPagoHora() {
        return pagoHora;
    }

    /**
     * Define el valor de la propiedad pagoHora.
     * 
     */
    public void setPagoHora(double value) {
        this.pagoHora = value;
    }

    /**
     * Obtiene el valor de la propiedad horasDia.
     * 
     */
    public double getHorasDia() {
        return horasDia;
    }

    /**
     * Define el valor de la propiedad horasDia.
     * 
     */
    public void setHorasDia(double value) {
        this.horasDia = value;
    }

}
