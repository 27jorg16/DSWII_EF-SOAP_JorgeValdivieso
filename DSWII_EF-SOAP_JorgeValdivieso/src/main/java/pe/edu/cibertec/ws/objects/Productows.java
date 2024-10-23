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
 * <p>Clase Java para productows complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="productows"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productoId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombreProducto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcionProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precioProducto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="stockProducto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productows", propOrder = {
    "productoId",
    "nombreProducto",
    "descripcionProducto",
    "precioProducto",
    "stockProducto"
})
public class Productows {

    protected int productoId;
    @XmlElement(required = true)
    protected String nombreProducto;
    protected String descripcionProducto;
    protected double precioProducto;
    protected int stockProducto;

    /**
     * Obtiene el valor de la propiedad productoId.
     * 
     */
    public int getProductoId() {
        return productoId;
    }

    /**
     * Define el valor de la propiedad productoId.
     * 
     */
    public void setProductoId(int value) {
        this.productoId = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Define el valor de la propiedad nombreProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProducto(String value) {
        this.nombreProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    /**
     * Define el valor de la propiedad descripcionProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionProducto(String value) {
        this.descripcionProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad precioProducto.
     * 
     */
    public double getPrecioProducto() {
        return precioProducto;
    }

    /**
     * Define el valor de la propiedad precioProducto.
     * 
     */
    public void setPrecioProducto(double value) {
        this.precioProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad stockProducto.
     * 
     */
    public int getStockProducto() {
        return stockProducto;
    }

    /**
     * Define el valor de la propiedad stockProducto.
     * 
     */
    public void setStockProducto(int value) {
        this.stockProducto = value;
    }

}
