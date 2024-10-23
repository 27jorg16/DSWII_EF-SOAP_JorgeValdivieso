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
 * <p>Clase Java para proveedorws complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="proveedorws"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="proveedorId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombreProveedor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telefonoProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correoProveedor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="direccionProveedor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proveedorws", propOrder = {
    "proveedorId",
    "nombreProveedor",
    "telefonoProveedor",
    "correoProveedor",
    "direccionProveedor"
})
public class Proveedorws {

    protected int proveedorId;
    @XmlElement(required = true)
    protected String nombreProveedor;
    protected String telefonoProveedor;
    @XmlElement(required = true)
    protected String correoProveedor;
    @XmlElement(required = true)
    protected String direccionProveedor;

    /**
     * Obtiene el valor de la propiedad proveedorId.
     * 
     */
    public int getProveedorId() {
        return proveedorId;
    }

    /**
     * Define el valor de la propiedad proveedorId.
     * 
     */
    public void setProveedorId(int value) {
        this.proveedorId = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    /**
     * Define el valor de la propiedad nombreProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProveedor(String value) {
        this.nombreProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    /**
     * Define el valor de la propiedad telefonoProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoProveedor(String value) {
        this.telefonoProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad correoProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoProveedor() {
        return correoProveedor;
    }

    /**
     * Define el valor de la propiedad correoProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoProveedor(String value) {
        this.correoProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionProveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    /**
     * Define el valor de la propiedad direccionProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionProveedor(String value) {
        this.direccionProveedor = value;
    }

}
