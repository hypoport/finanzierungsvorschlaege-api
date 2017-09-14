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
import de.europace.eli.model.TilgungsWunsch;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * AnnuitaetenDarlehensWunsch
 */

public class AnnuitaetenDarlehensWunsch {
  @JsonProperty("bereitstellungsZinsFreieZeitInMonaten")
  private Integer bereitstellungsZinsFreieZeitInMonaten = null;

  @JsonProperty("darlehensBetrag")
  private BigDecimal darlehensBetrag = null;

  @JsonProperty("provision")
  private BigDecimal provision = null;

  @JsonProperty("sondertilgungOptionalJaehrlich")
  private BigDecimal sondertilgungOptionalJaehrlich = null;

  @JsonProperty("tilgungsWunsch")
  private TilgungsWunsch tilgungsWunsch = null;

  @JsonProperty("zinsBindungInJahren")
  private Integer zinsBindungInJahren = null;

  public AnnuitaetenDarlehensWunsch bereitstellungsZinsFreieZeitInMonaten(Integer bereitstellungsZinsFreieZeitInMonaten) {
    this.bereitstellungsZinsFreieZeitInMonaten = bereitstellungsZinsFreieZeitInMonaten;
    return this;
  }

   /**
   * Get bereitstellungsZinsFreieZeitInMonaten
   * @return bereitstellungsZinsFreieZeitInMonaten
  **/
  @ApiModelProperty(value = "")
  public Integer getBereitstellungsZinsFreieZeitInMonaten() {
    return bereitstellungsZinsFreieZeitInMonaten;
  }

  public void setBereitstellungsZinsFreieZeitInMonaten(Integer bereitstellungsZinsFreieZeitInMonaten) {
    this.bereitstellungsZinsFreieZeitInMonaten = bereitstellungsZinsFreieZeitInMonaten;
  }

  public AnnuitaetenDarlehensWunsch darlehensBetrag(BigDecimal darlehensBetrag) {
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

  public AnnuitaetenDarlehensWunsch provision(BigDecimal provision) {
    this.provision = provision;
    return this;
  }

   /**
   * Get provision
   * @return provision
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getProvision() {
    return provision;
  }

  public void setProvision(BigDecimal provision) {
    this.provision = provision;
  }

  public AnnuitaetenDarlehensWunsch sondertilgungOptionalJaehrlich(BigDecimal sondertilgungOptionalJaehrlich) {
    this.sondertilgungOptionalJaehrlich = sondertilgungOptionalJaehrlich;
    return this;
  }

   /**
   * Get sondertilgungOptionalJaehrlich
   * @return sondertilgungOptionalJaehrlich
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSondertilgungOptionalJaehrlich() {
    return sondertilgungOptionalJaehrlich;
  }

  public void setSondertilgungOptionalJaehrlich(BigDecimal sondertilgungOptionalJaehrlich) {
    this.sondertilgungOptionalJaehrlich = sondertilgungOptionalJaehrlich;
  }

  public AnnuitaetenDarlehensWunsch tilgungsWunsch(TilgungsWunsch tilgungsWunsch) {
    this.tilgungsWunsch = tilgungsWunsch;
    return this;
  }

   /**
   * Get tilgungsWunsch
   * @return tilgungsWunsch
  **/
  @ApiModelProperty(required = true, value = "")
  public TilgungsWunsch getTilgungsWunsch() {
    return tilgungsWunsch;
  }

  public void setTilgungsWunsch(TilgungsWunsch tilgungsWunsch) {
    this.tilgungsWunsch = tilgungsWunsch;
  }

  public AnnuitaetenDarlehensWunsch zinsBindungInJahren(Integer zinsBindungInJahren) {
    this.zinsBindungInJahren = zinsBindungInJahren;
    return this;
  }

   /**
   * Get zinsBindungInJahren
   * @return zinsBindungInJahren
  **/
  @ApiModelProperty(value = "")
  public Integer getZinsBindungInJahren() {
    return zinsBindungInJahren;
  }

  public void setZinsBindungInJahren(Integer zinsBindungInJahren) {
    this.zinsBindungInJahren = zinsBindungInJahren;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnuitaetenDarlehensWunsch annuitaetenDarlehensWunsch = (AnnuitaetenDarlehensWunsch) o;
    return Objects.equals(this.bereitstellungsZinsFreieZeitInMonaten, annuitaetenDarlehensWunsch.bereitstellungsZinsFreieZeitInMonaten) &&
        Objects.equals(this.darlehensBetrag, annuitaetenDarlehensWunsch.darlehensBetrag) &&
        Objects.equals(this.provision, annuitaetenDarlehensWunsch.provision) &&
        Objects.equals(this.sondertilgungOptionalJaehrlich, annuitaetenDarlehensWunsch.sondertilgungOptionalJaehrlich) &&
        Objects.equals(this.tilgungsWunsch, annuitaetenDarlehensWunsch.tilgungsWunsch) &&
        Objects.equals(this.zinsBindungInJahren, annuitaetenDarlehensWunsch.zinsBindungInJahren);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bereitstellungsZinsFreieZeitInMonaten, darlehensBetrag, provision, sondertilgungOptionalJaehrlich, tilgungsWunsch, zinsBindungInJahren);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnuitaetenDarlehensWunsch {\n");
    
    sb.append("    bereitstellungsZinsFreieZeitInMonaten: ").append(toIndentedString(bereitstellungsZinsFreieZeitInMonaten)).append("\n");
    sb.append("    darlehensBetrag: ").append(toIndentedString(darlehensBetrag)).append("\n");
    sb.append("    provision: ").append(toIndentedString(provision)).append("\n");
    sb.append("    sondertilgungOptionalJaehrlich: ").append(toIndentedString(sondertilgungOptionalJaehrlich)).append("\n");
    sb.append("    tilgungsWunsch: ").append(toIndentedString(tilgungsWunsch)).append("\n");
    sb.append("    zinsBindungInJahren: ").append(toIndentedString(zinsBindungInJahren)).append("\n");
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

