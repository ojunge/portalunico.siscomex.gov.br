
package br.gov.serpro.pucomex.cct;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;choice>
 *           &lt;element name="cnpj" type="{http://www.pucomex.serpro.gov.br/cct}CNPJ"/>
 *           &lt;element name="cpf" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/>
 *           &lt;element name="nomeEstrangeiro" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/>
 *         &lt;/choice>
 *         &lt;element name="viaTransporte" type="{http://www.pucomex.serpro.gov.br/cct}ViaTransporte" minOccurs="0"/>
 *         &lt;element name="baldeacaoOuTransbordo" type="{http://www.pucomex.serpro.gov.br/cct}SimNao" minOccurs="0"/>
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
    "cnpj",
    "cpf",
    "nomeEstrangeiro",
    "viaTransporte",
    "baldeacaoOuTransbordo"
})
@XmlRootElement(name = "recebedor")
public class Recebedor {

    protected String cnpj;
    protected String cpf;
    protected String nomeEstrangeiro;
    protected BigInteger viaTransporte;
    protected String baldeacaoOuTransbordo;

    /**
     * Obt�m o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpj(String value) {
        this.cnpj = value;
    }

    /**
     * Obt�m o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Obt�m o valor da propriedade nomeEstrangeiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEstrangeiro() {
        return nomeEstrangeiro;
    }

    /**
     * Define o valor da propriedade nomeEstrangeiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEstrangeiro(String value) {
        this.nomeEstrangeiro = value;
    }

    /**
     * Obt�m o valor da propriedade viaTransporte.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getViaTransporte() {
        return viaTransporte;
    }

    /**
     * Define o valor da propriedade viaTransporte.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setViaTransporte(BigInteger value) {
        this.viaTransporte = value;
    }

    /**
     * Obt�m o valor da propriedade baldeacaoOuTransbordo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaldeacaoOuTransbordo() {
        return baldeacaoOuTransbordo;
    }

    /**
     * Define o valor da propriedade baldeacaoOuTransbordo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaldeacaoOuTransbordo(String value) {
        this.baldeacaoOuTransbordo = value;
    }

}
