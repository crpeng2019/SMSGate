//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.29 at 02:56:01 PM CEST 
//


package es.rickyepoderi.wbxml.bind.drmrel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "oDdPlay",
    "oDdDisplay",
    "oDdExecute",
    "oDdPrint"
})
@XmlRootElement(name = "permission", namespace="http://odrl.net/1.1/ODRL-EX")
public class OExPermission {

    @XmlElement(name = "play", namespace="http://odrl.net/1.1/ODRL-DD")
    protected ODdPlay oDdPlay;
    @XmlElement(name = "display", namespace="http://odrl.net/1.1/ODRL-DD")
    protected ODdDisplay oDdDisplay;
    @XmlElement(name = "execute", namespace="http://odrl.net/1.1/ODRL-DD")
    protected ODdExecute oDdExecute;
    @XmlElement(name = "print", namespace="http://odrl.net/1.1/ODRL-DD")
    protected ODdPrint oDdPrint;

    /**
     * Gets the value of the oDdPlay property.
     * 
     * @return
     *     possible object is
     *     {@link ODdPlay }
     *     
     */
    public ODdPlay getODdPlay() {
        return oDdPlay;
    }

    /**
     * Sets the value of the oDdPlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODdPlay }
     *     
     */
    public void setODdPlay(ODdPlay value) {
        this.oDdPlay = value;
    }

    /**
     * Gets the value of the oDdDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link ODdDisplay }
     *     
     */
    public ODdDisplay getODdDisplay() {
        return oDdDisplay;
    }

    /**
     * Sets the value of the oDdDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODdDisplay }
     *     
     */
    public void setODdDisplay(ODdDisplay value) {
        this.oDdDisplay = value;
    }

    /**
     * Gets the value of the oDdExecute property.
     * 
     * @return
     *     possible object is
     *     {@link ODdExecute }
     *     
     */
    public ODdExecute getODdExecute() {
        return oDdExecute;
    }

    /**
     * Sets the value of the oDdExecute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODdExecute }
     *     
     */
    public void setODdExecute(ODdExecute value) {
        this.oDdExecute = value;
    }

    /**
     * Gets the value of the oDdPrint property.
     * 
     * @return
     *     possible object is
     *     {@link ODdPrint }
     *     
     */
    public ODdPrint getODdPrint() {
        return oDdPrint;
    }

    /**
     * Sets the value of the oDdPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODdPrint }
     *     
     */
    public void setODdPrint(ODdPrint value) {
        this.oDdPrint = value;
    }

}