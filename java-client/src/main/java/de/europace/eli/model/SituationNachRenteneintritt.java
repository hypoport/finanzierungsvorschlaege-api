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
import java.time.LocalDate;

/**
 * SituationNachRenteneintritt
 */

public class SituationNachRenteneintritt {
  @JsonProperty("gesetzlicheRenteMonatlich")
  private BigDecimal gesetzlicheRenteMonatlich = null;

  @JsonProperty("privateRenteMonatlich")
  private BigDecimal privateRenteMonatlich = null;

  @JsonProperty("rentenBeginn")
  private LocalDate rentenBeginn = null;

  @JsonProperty("sonstigesEinkommenMonatlich")
  private BigDecimal sonstigesEinkommenMonatlich = null;

  public SituationNachRenteneintritt gesetzlicheRenteMonatlich(BigDecimal gesetzlicheRenteMonatlich) {
    this.gesetzlicheRenteMonatlich = gesetzlicheRenteMonatlich;
    return this;
  }

   /**
   * Get gesetzlicheRenteMonatlich
   * @return gesetzlicheRenteMonatlich
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getGesetzlicheRenteMonatlich() {
    return gesetzlicheRenteMonatlich;
  }

  public void setGesetzlicheRenteMonatlich(BigDecimal gesetzlicheRenteMonatlich) {
    this.gesetzlicheRenteMonatlich = gesetzlicheRenteMonatlich;
  }

  public SituationNachRenteneintritt privateRenteMonatlich(BigDecimal privateRenteMonatlich) {
    this.privateRenteMonatlich = privateRenteMonatlich;
    return this;
  }

   /**
   * Get privateRenteMonatlich
   * @return privateRenteMonatlich
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPrivateRenteMonatlich() {
    return privateRenteMonatlich;
  }

  public void setPrivateRenteMonatlich(BigDecimal privateRenteMonatlich) {
    this.privateRenteMonatlich = privateRenteMonatlich;
  }

  public SituationNachRenteneintritt rentenBeginn(LocalDate rentenBeginn) {
    this.rentenBeginn = rentenBeginn;
    return this;
  }

   /**
   * Get rentenBeginn
   * @return rentenBeginn
  **/
  @ApiModelProperty(value = "")
  public LocalDate getRentenBeginn() {
    return rentenBeginn;
  }

  public void setRentenBeginn(LocalDate rentenBeginn) {
    this.rentenBeginn = rentenBeginn;
  }

  public SituationNachRenteneintritt sonstigesEinkommenMonatlich(BigDecimal sonstigesEinkommenMonatlich) {
    this.sonstigesEinkommenMonatlich = sonstigesEinkommenMonatlich;
    return this;
  }

   /**
   * Get sonstigesEinkommenMonatlich
   * @return sonstigesEinkommenMonatlich
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSonstigesEinkommenMonatlich() {
    return sonstigesEinkommenMonatlich;
  }

  public void setSonstigesEinkommenMonatlich(BigDecimal sonstigesEinkommenMonatlich) {
    this.sonstigesEinkommenMonatlich = sonstigesEinkommenMonatlich;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SituationNachRenteneintritt situationNachRenteneintritt = (SituationNachRenteneintritt) o;
    return Objects.equals(this.gesetzlicheRenteMonatlich, situationNachRenteneintritt.gesetzlicheRenteMonatlich) &&
        Objects.equals(this.privateRenteMonatlich, situationNachRenteneintritt.privateRenteMonatlich) &&
        Objects.equals(this.rentenBeginn, situationNachRenteneintritt.rentenBeginn) &&
        Objects.equals(this.sonstigesEinkommenMonatlich, situationNachRenteneintritt.sonstigesEinkommenMonatlich);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gesetzlicheRenteMonatlich, privateRenteMonatlich, rentenBeginn, sonstigesEinkommenMonatlich);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SituationNachRenteneintritt {\n");
    
    sb.append("    gesetzlicheRenteMonatlich: ").append(toIndentedString(gesetzlicheRenteMonatlich)).append("\n");
    sb.append("    privateRenteMonatlich: ").append(toIndentedString(privateRenteMonatlich)).append("\n");
    sb.append("    rentenBeginn: ").append(toIndentedString(rentenBeginn)).append("\n");
    sb.append("    sonstigesEinkommenMonatlich: ").append(toIndentedString(sonstigesEinkommenMonatlich)).append("\n");
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

