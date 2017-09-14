/*
 * Ergebnislisten API
 * Ein Service um eine Ergebnisliste mit Finanzierungsvorschlägen zu ermitteln.
 *
 * OpenAPI spec version: 1.0
 * Contact: helpdesk@europace2.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.europace.eli.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import de.europace.eli.model.ZinsBindung;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * NachrangigesExternesDarlehen
 */

public class NachrangigesExternesDarlehen {
  @JsonProperty("darlehensBetrag")
  private BigDecimal darlehensBetrag = null;

  @JsonProperty("darlehensGeber")
  private String darlehensGeber = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("rateMonatlich")
  private BigDecimal rateMonatlich = null;

  /**
   * Gets or Sets typ
   */
  public enum TypEnum {
    ARBEITGEBERDARLEHEN("ARBEITGEBERDARLEHEN"),
    
    BAUSPARDARLEHEN("BAUSPARDARLEHEN"),
    
    OEFFENTLICHES_DARLEHEN("OEFFENTLICHES_DARLEHEN"),
    
    RATENKREDIT("RATENKREDIT");

    private String value;

    TypEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypEnum fromValue(String text) {
      for (TypEnum b : TypEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("typ")
  private TypEnum typ = null;

  @JsonProperty("zinsBindung")
  private ZinsBindung zinsBindung = null;

  public NachrangigesExternesDarlehen darlehensBetrag(BigDecimal darlehensBetrag) {
    this.darlehensBetrag = darlehensBetrag;
    return this;
  }

   /**
   * Get darlehensBetrag
   * @return darlehensBetrag
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDarlehensBetrag() {
    return darlehensBetrag;
  }

  public void setDarlehensBetrag(BigDecimal darlehensBetrag) {
    this.darlehensBetrag = darlehensBetrag;
  }

  public NachrangigesExternesDarlehen darlehensGeber(String darlehensGeber) {
    this.darlehensGeber = darlehensGeber;
    return this;
  }

   /**
   * Der Name des externen Darlehensgebers (Firmierung). Es gibt keine entsprechende Beziehung zu einem Partner auf der Europace-Plattform.
   * @return darlehensGeber
  **/
  @ApiModelProperty(value = "Der Name des externen Darlehensgebers (Firmierung). Es gibt keine entsprechende Beziehung zu einem Partner auf der Europace-Plattform.")
  public String getDarlehensGeber() {
    return darlehensGeber;
  }

  public void setDarlehensGeber(String darlehensGeber) {
    this.darlehensGeber = darlehensGeber;
  }

  public NachrangigesExternesDarlehen id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NachrangigesExternesDarlehen rateMonatlich(BigDecimal rateMonatlich) {
    this.rateMonatlich = rateMonatlich;
    return this;
  }

   /**
   * Get rateMonatlich
   * @return rateMonatlich
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRateMonatlich() {
    return rateMonatlich;
  }

  public void setRateMonatlich(BigDecimal rateMonatlich) {
    this.rateMonatlich = rateMonatlich;
  }

  public NachrangigesExternesDarlehen typ(TypEnum typ) {
    this.typ = typ;
    return this;
  }

   /**
   * Get typ
   * @return typ
  **/
  @ApiModelProperty(value = "")
  public TypEnum getTyp() {
    return typ;
  }

  public void setTyp(TypEnum typ) {
    this.typ = typ;
  }

  public NachrangigesExternesDarlehen zinsBindung(ZinsBindung zinsBindung) {
    this.zinsBindung = zinsBindung;
    return this;
  }

   /**
   * Get zinsBindung
   * @return zinsBindung
  **/
  @ApiModelProperty(value = "")
  public ZinsBindung getZinsBindung() {
    return zinsBindung;
  }

  public void setZinsBindung(ZinsBindung zinsBindung) {
    this.zinsBindung = zinsBindung;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NachrangigesExternesDarlehen nachrangigesExternesDarlehen = (NachrangigesExternesDarlehen) o;
    return Objects.equals(this.darlehensBetrag, nachrangigesExternesDarlehen.darlehensBetrag) &&
        Objects.equals(this.darlehensGeber, nachrangigesExternesDarlehen.darlehensGeber) &&
        Objects.equals(this.id, nachrangigesExternesDarlehen.id) &&
        Objects.equals(this.rateMonatlich, nachrangigesExternesDarlehen.rateMonatlich) &&
        Objects.equals(this.typ, nachrangigesExternesDarlehen.typ) &&
        Objects.equals(this.zinsBindung, nachrangigesExternesDarlehen.zinsBindung);
  }

  @Override
  public int hashCode() {
    return Objects.hash(darlehensBetrag, darlehensGeber, id, rateMonatlich, typ, zinsBindung);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NachrangigesExternesDarlehen {\n");
    
    sb.append("    darlehensBetrag: ").append(toIndentedString(darlehensBetrag)).append("\n");
    sb.append("    darlehensGeber: ").append(toIndentedString(darlehensGeber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rateMonatlich: ").append(toIndentedString(rateMonatlich)).append("\n");
    sb.append("    typ: ").append(toIndentedString(typ)).append("\n");
    sb.append("    zinsBindung: ").append(toIndentedString(zinsBindung)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

