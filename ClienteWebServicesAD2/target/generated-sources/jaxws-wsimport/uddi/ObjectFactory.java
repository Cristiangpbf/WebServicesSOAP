
package uddi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uddi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalculoHorasSueldo_QNAME = new QName("http://UDDI/", "CalculoHorasSueldo");
    private final static QName _CalculoHorasSueldoResponse_QNAME = new QName("http://UDDI/", "CalculoHorasSueldoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uddi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculoHorasSueldo }
     * 
     */
    public CalculoHorasSueldo createCalculoHorasSueldo() {
        return new CalculoHorasSueldo();
    }

    /**
     * Create an instance of {@link CalculoHorasSueldoResponse }
     * 
     */
    public CalculoHorasSueldoResponse createCalculoHorasSueldoResponse() {
        return new CalculoHorasSueldoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculoHorasSueldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "CalculoHorasSueldo")
    public JAXBElement<CalculoHorasSueldo> createCalculoHorasSueldo(CalculoHorasSueldo value) {
        return new JAXBElement<CalculoHorasSueldo>(_CalculoHorasSueldo_QNAME, CalculoHorasSueldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculoHorasSueldoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "CalculoHorasSueldoResponse")
    public JAXBElement<CalculoHorasSueldoResponse> createCalculoHorasSueldoResponse(CalculoHorasSueldoResponse value) {
        return new JAXBElement<CalculoHorasSueldoResponse>(_CalculoHorasSueldoResponse_QNAME, CalculoHorasSueldoResponse.class, null, value);
    }

}
