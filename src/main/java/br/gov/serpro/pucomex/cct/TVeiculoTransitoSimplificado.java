
package br.gov.serpro.pucomex.cct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TVeiculoTransitoSimplificado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TVeiculoTransitoSimplificado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="placa" type="{http://www.pucomex.serpro.gov.br/cct}PlacaVeiculo"/>
 *         &lt;element name="lacres" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lacre" type="{http://www.pucomex.serpro.gov.br/cct}Lacre" maxOccurs="4"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TVeiculoTransitoSimplificado", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "placa",
    "lacres"
})
public class TVeiculoTransitoSimplificado {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
    protected String placa;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected TVeiculoTransitoSimplificado.Lacres lacres;

    /**
     * Obt�m o valor da propriedade placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define o valor da propriedade placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Obt�m o valor da propriedade lacres.
     * 
     * @return
     *     possible object is
     *     {@link TVeiculoTransitoSimplificado.Lacres }
     *     
     */
    public TVeiculoTransitoSimplificado.Lacres getLacres() {
        return lacres;
    }

    /**
     * Define o valor da propriedade lacres.
     * 
     * @param value
     *     allowed object is
     *     {@link TVeiculoTransitoSimplificado.Lacres }
     *     
     */
    public void setLacres(TVeiculoTransitoSimplificado.Lacres value) {
        this.lacres = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="lacre" type="{http://www.pucomex.serpro.gov.br/cct}Lacre" maxOccurs="4"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lacre"
    })
    public static class Lacres {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected List<String> lacre;

        /**
         * Gets the value of the lacre property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lacre property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLacre().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLacre() {
            if (lacre == null) {
                lacre = new ArrayList<String>();
            }
            return this.lacre;
        }

    }

}
