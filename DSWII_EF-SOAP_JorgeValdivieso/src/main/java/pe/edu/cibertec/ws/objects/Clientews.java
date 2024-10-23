//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.23 a las 12:01:31 AM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clientews complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clientews"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clienteId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombreCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="correoCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telefonoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccionCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientews", propOrder = {
    "clienteId",
    "nombreCliente",
    "correoCliente",
    "telefonoCliente",
    "direccionCliente"
})
public class Clientews {

    protected int clienteId;
    @XmlElement(required = true)
    protected String nombreCliente;
    @XmlElement(required = true)
    protected String correoCliente;
    protected String telefonoCliente;
    @XmlElement(required = true)
    protected String direccionCliente;

    /**
     * Obtiene el valor de la propiedad clienteId.
     * 
     */
    public int getClienteId() {
        return clienteId;
    }

    /**
     * Define el valor de la propiedad clienteId.
     * 
     */
    public void setClienteId(int value) {
        this.clienteId = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Define el valor de la propiedad nombreCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCliente(String value) {
        this.nombreCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad correoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoCliente() {
        return correoCliente;
    }

    /**
     * Define el valor de la propiedad correoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoCliente(String value) {
        this.correoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    /**
     * Define el valor de la propiedad telefonoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoCliente(String value) {
        this.telefonoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionCliente() {
        return direccionCliente;
    }

    /**
     * Define el valor de la propiedad direccionCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionCliente(String value) {
        this.direccionCliente = value;
    }

}
