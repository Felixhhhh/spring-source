//
// \u6b64\u6587\u4ef6\u662f\u7531 JavaTM Architecture for XML Binding (JAXB) \u5f15\u7528\u5b9e\u73b0 v2.2.11 \u751f\u6210\u7684
// \u8bf7\u8bbf\u95ee <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// \u5728\u91cd\u65b0\u7f16\u8bd1\u6e90\u6a21\u5f0f\u65f6, \u5bf9\u6b64\u6587\u4ef6\u7684\u6240\u6709\u4fee\u6539\u90fd\u5c06\u4e22\u5931\u3002
// \u751f\u6210\u65f6\u95f4: 2022.04.15 \u65f6\u95f4 04:14:14 PM CST 
//


package org.springframework.oxm.jaxb.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.springframework.oxm.jaxb.test package. 
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

    private final static QName _Flight_QNAME = new QName("http://samples.springframework.org/flight", "flight");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.springframework.oxm.jaxb.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Flights }
     * 
     */
    public Flights createFlights() {
        return new Flights();
    }

    /**
     * Create an instance of {@link FlightType }
     * 
     */
    public FlightType createFlightType() {
        return new FlightType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://samples.springframework.org/flight", name = "flight")
    public JAXBElement<FlightType> createFlight(FlightType value) {
        return new JAXBElement<FlightType>(_Flight_QNAME, FlightType.class, null, value);
    }

}
