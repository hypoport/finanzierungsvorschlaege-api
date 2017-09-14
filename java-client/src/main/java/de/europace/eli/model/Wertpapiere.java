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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * Wertpapiere
 */

public class Wertpapiere {
  @JsonProperty("aktuellerWert")
  private BigDecimal aktuellerWert = null;

  @JsonProperty("dividendenJaehrlich")
  private BigDecimal dividendenJaehrlich = null;

  @JsonProperty("ertrag")
  private BigDecimal ertrag = null;

  @JsonProperty("maximalAufzuloesenderWert")
  private BigDecimal maximalAufzuloesenderWert = null;

  /**
   * Gets or Sets vermoegensEinsatz
   */
  public enum VermoegensEinsatzEnum {
    KEIN_EINSATZ("KEIN_EINSATZ"),
    
    ABTRETEN("ABTRETEN"),
    
    AUFLOESEN("AUFLOESEN");

    private String value;

    VermoegensEinsatzEnum(String value) {
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
    public static VermoegensEinsatzEnum fromValue(String text) {
      for (VermoegensEinsatzEnum b : VermoegensEinsatzEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("vermoegensEinsatz")
  private VermoegensEinsatzEnum vermoegensEinsatz = null;

  @JsonProperty("zukuenftigeEinnahmen")
  private BigDecimal zukuenftigeEinnahmen = null;

  public Wertpapiere aktuellerWert(BigDecimal aktuellerWert) {
    this.aktuellerWert = aktuellerWert;
    return this;
  }

   /**
   * Get aktuellerWert
   * @return aktuellerWert
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAktuellerWert() {
    return aktuellerWert;
  }

  public void setAktuellerWert(BigDecimal aktuellerWert) {
    this.aktuellerWert = aktuellerWert;
  }

  public Wertpapiere dividendenJaehrlich(BigDecimal dividendenJaehrlich) {
    this.dividendenJaehrlich = dividendenJaehrlich;
    return this;
  }

   /**
   * Get dividendenJaehrlich
   * @return dividendenJaehrlich
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDividendenJaehrlich() {
    return dividendenJaehrlich;
  }

  public void setDividendenJaehrlich(BigDecimal dividendenJaehrlich) {
    this.dividendenJaehrlich = dividendenJaehrlich;
  }

  public Wertpapiere ertrag(BigDecimal ertrag) {
    this.ertrag = ertrag;
    return this;
  }

   /**
   * Get ertrag
   * @return ertrag
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getErtrag() {
    return ertrag;
  }

  public void setErtrag(BigDecimal ertrag) {
    this.ertrag = ertrag;
  }

  public Wertpapiere maximalAufzuloesenderWert(BigDecimal maximalAufzuloesenderWert) {
    this.maximalAufzuloesenderWert = maximalAufzuloesenderWert;
    return this;
  }

   /**
   * Get maximalAufzuloesenderWert
   * @return maximalAufzuloesenderWert
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMaximalAufzuloesenderWert() {
    return maximalAufzuloesenderWert;
  }

  public void setMaximalAufzuloesenderWert(BigDecimal maximalAufzuloesenderWert) {
    this.maximalAufzuloesenderWert = maximalAufzuloesenderWert;
  }

  public Wertpapiere vermoegensEinsatz(VermoegensEinsatzEnum vermoegensEinsatz) {
    this.vermoegensEinsatz = vermoegensEinsatz;
    return this;
  }

   /**
   * Get vermoegensEinsatz
   * @return vermoegensEinsatz
  **/
  @ApiModelProperty(value = "")
  public VermoegensEinsatzEnum getVermoegensEinsatz() {
    return vermoegensEinsatz;
  }

  public void setVermoegensEinsatz(VermoegensEinsatzEnum vermoegensEinsatz) {
    this.vermoegensEinsatz = vermoegensEinsatz;
  }

  public Wertpapiere zukuenftigeEinnahmen(BigDecimal zukuenftigeEinnahmen) {
    this.zukuenftigeEinnahmen = zukuenftigeEinnahmen;
    return this;
  }

   /**
   * Get zukuenftigeEinnahmen
   * @return zukuenftigeEinnahmen
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getZukuenftigeEinnahmen() {
    return zukuenftigeEinnahmen;
  }

  public void setZukuenftigeEinnahmen(BigDecimal zukuenftigeEinnahmen) {
    this.zukuenftigeEinnahmen = zukuenftigeEinnahmen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wertpapiere wertpapiere = (Wertpapiere) o;
    return Objects.equals(this.aktuellerWert, wertpapiere.aktuellerWert) &&
        Objects.equals(this.dividendenJaehrlich, wertpapiere.dividendenJaehrlich) &&
        Objects.equals(this.ertrag, wertpapiere.ertrag) &&
        Objects.equals(this.maximalAufzuloesenderWert, wertpapiere.maximalAufzuloesenderWert) &&
        Objects.equals(this.vermoegensEinsatz, wertpapiere.vermoegensEinsatz) &&
        Objects.equals(this.zukuenftigeEinnahmen, wertpapiere.zukuenftigeEinnahmen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aktuellerWert, dividendenJaehrlich, ertrag, maximalAufzuloesenderWert, vermoegensEinsatz, zukuenftigeEinnahmen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wertpapiere {\n");
    
    sb.append("    aktuellerWert: ").append(toIndentedString(aktuellerWert)).append("\n");
    sb.append("    dividendenJaehrlich: ").append(toIndentedString(dividendenJaehrlich)).append("\n");
    sb.append("    ertrag: ").append(toIndentedString(ertrag)).append("\n");
    sb.append("    maximalAufzuloesenderWert: ").append(toIndentedString(maximalAufzuloesenderWert)).append("\n");
    sb.append("    vermoegensEinsatz: ").append(toIndentedString(vermoegensEinsatz)).append("\n");
    sb.append("    zukuenftigeEinnahmen: ").append(toIndentedString(zukuenftigeEinnahmen)).append("\n");
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

