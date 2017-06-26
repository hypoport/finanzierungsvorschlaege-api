/*
 * Ergebnislisten API
 * Ein Service um eine Ergebnisliste mit Finanzierungsvorschlägen zu ermitteln.
 *
 * OpenAPI spec version: 0.1
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.LocalDate;

/**
 * ZinsBindung
 */

public class ZinsBindung {
  @JsonProperty("endetAm")
  private LocalDate endetAm = null;

  @JsonProperty("jahre")
  private Integer jahre = null;

  @JsonProperty("monate")
  private Integer monate = null;

  @JsonProperty("restschuldNachZinsBindungsEnde")
  private BigDecimal restschuldNachZinsBindungsEnde = null;

  public ZinsBindung endetAm(LocalDate endetAm) {
    this.endetAm = endetAm;
    return this;
  }

   /**
   * Get endetAm
   * @return endetAm
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getEndetAm() {
    return endetAm;
  }

  public void setEndetAm(LocalDate endetAm) {
    this.endetAm = endetAm;
  }

  public ZinsBindung jahre(Integer jahre) {
    this.jahre = jahre;
    return this;
  }

   /**
   * Get jahre
   * @return jahre
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getJahre() {
    return jahre;
  }

  public void setJahre(Integer jahre) {
    this.jahre = jahre;
  }

  public ZinsBindung monate(Integer monate) {
    this.monate = monate;
    return this;
  }

   /**
   * Get monate
   * @return monate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMonate() {
    return monate;
  }

  public void setMonate(Integer monate) {
    this.monate = monate;
  }

  public ZinsBindung restschuldNachZinsBindungsEnde(BigDecimal restschuldNachZinsBindungsEnde) {
    this.restschuldNachZinsBindungsEnde = restschuldNachZinsBindungsEnde;
    return this;
  }

   /**
   * Get restschuldNachZinsBindungsEnde
   * @return restschuldNachZinsBindungsEnde
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getRestschuldNachZinsBindungsEnde() {
    return restschuldNachZinsBindungsEnde;
  }

  public void setRestschuldNachZinsBindungsEnde(BigDecimal restschuldNachZinsBindungsEnde) {
    this.restschuldNachZinsBindungsEnde = restschuldNachZinsBindungsEnde;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZinsBindung zinsBindung = (ZinsBindung) o;
    return Objects.equals(this.endetAm, zinsBindung.endetAm) &&
        Objects.equals(this.jahre, zinsBindung.jahre) &&
        Objects.equals(this.monate, zinsBindung.monate) &&
        Objects.equals(this.restschuldNachZinsBindungsEnde, zinsBindung.restschuldNachZinsBindungsEnde);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endetAm, jahre, monate, restschuldNachZinsBindungsEnde);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZinsBindung {\n");
    
    sb.append("    endetAm: ").append(toIndentedString(endetAm)).append("\n");
    sb.append("    jahre: ").append(toIndentedString(jahre)).append("\n");
    sb.append("    monate: ").append(toIndentedString(monate)).append("\n");
    sb.append("    restschuldNachZinsBindungsEnde: ").append(toIndentedString(restschuldNachZinsBindungsEnde)).append("\n");
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

