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

/**
 * EinnahmenMonatlich
 */

public class EinnahmenMonatlich {
  @JsonProperty("einnahmenMonatlich")
  private BigDecimal einnahmenMonatlich = null;

  public EinnahmenMonatlich einnahmenMonatlich(BigDecimal einnahmenMonatlich) {
    this.einnahmenMonatlich = einnahmenMonatlich;
    return this;
  }

   /**
   * Get einnahmenMonatlich
   * @return einnahmenMonatlich
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getEinnahmenMonatlich() {
    return einnahmenMonatlich;
  }

  public void setEinnahmenMonatlich(BigDecimal einnahmenMonatlich) {
    this.einnahmenMonatlich = einnahmenMonatlich;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EinnahmenMonatlich einnahmenMonatlich = (EinnahmenMonatlich) o;
    return Objects.equals(this.einnahmenMonatlich, einnahmenMonatlich.einnahmenMonatlich);
  }

  @Override
  public int hashCode() {
    return Objects.hash(einnahmenMonatlich);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EinnahmenMonatlich {\n");
    
    sb.append("    einnahmenMonatlich: ").append(toIndentedString(einnahmenMonatlich)).append("\n");
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

