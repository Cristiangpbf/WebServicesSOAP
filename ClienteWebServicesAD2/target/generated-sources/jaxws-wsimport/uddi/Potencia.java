
package uddi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Potencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Potencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="exponente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Potencia", propOrder = {
    "base",
    "exponente"
})
public class Potencia {

    protected int base;
    protected int exponente;

    /**
     * Obtiene el valor de la propiedad base.
     * 
     */
    public int getBase() {
        return base;
    }

    /**
     * Define el valor de la propiedad base.
     * 
     */
    public void setBase(int value) {
        this.base = value;
    }

    /**
     * Obtiene el valor de la propiedad exponente.
     * 
     */
    public int getExponente() {
        return exponente;
    }

    /**
     * Define el valor de la propiedad exponente.
     * 
     */
    public void setExponente(int value) {
        this.exponente = value;
    }

}
