
package br.gov.serpro.pucomex.cct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TransitoSimplificadoRecepcao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransitoSimplificadoRecepcao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="veiculoFerroviario">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="prefixoTrem" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica15"/>
 *                     &lt;element name="quantidadeVagoes" type="{http://www.pucomex.serpro.gov.br/cct}QuantidadeVagoes"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="veiculoRodoviario">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;element name="cpfCondutor" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/>
 *                       &lt;sequence>
 *                         &lt;element name="documentoCondutorEstrangeiro" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica15"/>
 *                         &lt;element name="nomeCondutorEstrangeiro" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/>
 *                       &lt;/sequence>
 *                     &lt;/choice>
 *                     &lt;element name="veiculos">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="veiculo" type="{http://www.pucomex.serpro.gov.br/cct}TVeiculoTransitoSimplificado" maxOccurs="4"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitoSimplificadoRecepcao", namespace = "http://www.pucomex.serpro.gov.br/cct", propOrder = {
    "veiculoFerroviario",
    "veiculoRodoviario"
})
public class TransitoSimplificadoRecepcao {

    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected TransitoSimplificadoRecepcao.VeiculoFerroviario veiculoFerroviario;
    @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
    protected TransitoSimplificadoRecepcao.VeiculoRodoviario veiculoRodoviario;

    /**
     * Obt�m o valor da propriedade veiculoFerroviario.
     * 
     * @return
     *     possible object is
     *     {@link TransitoSimplificadoRecepcao.VeiculoFerroviario }
     *     
     */
    public TransitoSimplificadoRecepcao.VeiculoFerroviario getVeiculoFerroviario() {
        return veiculoFerroviario;
    }

    /**
     * Define o valor da propriedade veiculoFerroviario.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitoSimplificadoRecepcao.VeiculoFerroviario }
     *     
     */
    public void setVeiculoFerroviario(TransitoSimplificadoRecepcao.VeiculoFerroviario value) {
        this.veiculoFerroviario = value;
    }

    /**
     * Obt�m o valor da propriedade veiculoRodoviario.
     * 
     * @return
     *     possible object is
     *     {@link TransitoSimplificadoRecepcao.VeiculoRodoviario }
     *     
     */
    public TransitoSimplificadoRecepcao.VeiculoRodoviario getVeiculoRodoviario() {
        return veiculoRodoviario;
    }

    /**
     * Define o valor da propriedade veiculoRodoviario.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitoSimplificadoRecepcao.VeiculoRodoviario }
     *     
     */
    public void setVeiculoRodoviario(TransitoSimplificadoRecepcao.VeiculoRodoviario value) {
        this.veiculoRodoviario = value;
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
     *         &lt;element name="prefixoTrem" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica15"/>
     *         &lt;element name="quantidadeVagoes" type="{http://www.pucomex.serpro.gov.br/cct}QuantidadeVagoes"/>
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
        "prefixoTrem",
        "quantidadeVagoes"
    })
    public static class VeiculoFerroviario {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected String prefixoTrem;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected BigInteger quantidadeVagoes;

        /**
         * Obt�m o valor da propriedade prefixoTrem.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrefixoTrem() {
            return prefixoTrem;
        }

        /**
         * Define o valor da propriedade prefixoTrem.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrefixoTrem(String value) {
            this.prefixoTrem = value;
        }

        /**
         * Obt�m o valor da propriedade quantidadeVagoes.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantidadeVagoes() {
            return quantidadeVagoes;
        }

        /**
         * Define o valor da propriedade quantidadeVagoes.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantidadeVagoes(BigInteger value) {
            this.quantidadeVagoes = value;
        }

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
     *         &lt;choice>
     *           &lt;element name="cpfCondutor" type="{http://www.pucomex.serpro.gov.br/cct}CPF"/>
     *           &lt;sequence>
     *             &lt;element name="documentoCondutorEstrangeiro" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica15"/>
     *             &lt;element name="nomeCondutorEstrangeiro" type="{http://www.pucomex.serpro.gov.br/cct}StringBasica60"/>
     *           &lt;/sequence>
     *         &lt;/choice>
     *         &lt;element name="veiculos">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="veiculo" type="{http://www.pucomex.serpro.gov.br/cct}TVeiculoTransitoSimplificado" maxOccurs="4"/>
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
    @XmlType(name = "", propOrder = {
        "cpfCondutor",
        "documentoCondutorEstrangeiro",
        "nomeCondutorEstrangeiro",
        "veiculos"
    })
    public static class VeiculoRodoviario {

        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
        protected String cpfCondutor;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
        protected String documentoCondutorEstrangeiro;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct")
        protected String nomeCondutorEstrangeiro;
        @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
        protected TransitoSimplificadoRecepcao.VeiculoRodoviario.Veiculos veiculos;

        /**
         * Obt�m o valor da propriedade cpfCondutor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpfCondutor() {
            return cpfCondutor;
        }

        /**
         * Define o valor da propriedade cpfCondutor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpfCondutor(String value) {
            this.cpfCondutor = value;
        }

        /**
         * Obt�m o valor da propriedade documentoCondutorEstrangeiro.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentoCondutorEstrangeiro() {
            return documentoCondutorEstrangeiro;
        }

        /**
         * Define o valor da propriedade documentoCondutorEstrangeiro.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentoCondutorEstrangeiro(String value) {
            this.documentoCondutorEstrangeiro = value;
        }

        /**
         * Obt�m o valor da propriedade nomeCondutorEstrangeiro.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeCondutorEstrangeiro() {
            return nomeCondutorEstrangeiro;
        }

        /**
         * Define o valor da propriedade nomeCondutorEstrangeiro.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeCondutorEstrangeiro(String value) {
            this.nomeCondutorEstrangeiro = value;
        }

        /**
         * Obt�m o valor da propriedade veiculos.
         * 
         * @return
         *     possible object is
         *     {@link TransitoSimplificadoRecepcao.VeiculoRodoviario.Veiculos }
         *     
         */
        public TransitoSimplificadoRecepcao.VeiculoRodoviario.Veiculos getVeiculos() {
            return veiculos;
        }

        /**
         * Define o valor da propriedade veiculos.
         * 
         * @param value
         *     allowed object is
         *     {@link TransitoSimplificadoRecepcao.VeiculoRodoviario.Veiculos }
         *     
         */
        public void setVeiculos(TransitoSimplificadoRecepcao.VeiculoRodoviario.Veiculos value) {
            this.veiculos = value;
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
         *         &lt;element name="veiculo" type="{http://www.pucomex.serpro.gov.br/cct}TVeiculoTransitoSimplificado" maxOccurs="4"/>
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
            "veiculo"
        })
        public static class Veiculos {

            @XmlElement(namespace = "http://www.pucomex.serpro.gov.br/cct", required = true)
            protected List<TVeiculoTransitoSimplificado> veiculo;

            /**
             * Gets the value of the veiculo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the veiculo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVeiculo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TVeiculoTransitoSimplificado }
             * 
             * 
             */
            public List<TVeiculoTransitoSimplificado> getVeiculo() {
                if (veiculo == null) {
                    veiculo = new ArrayList<TVeiculoTransitoSimplificado>();
                }
                return this.veiculo;
            }

        }

    }

}
