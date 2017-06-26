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
import de.europace.eli.model.Jahreszahl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * Erbbaurecht
 */

public class Erbbaurecht {
  @JsonProperty("erbbauzinsJaehrlich")
  private BigDecimal erbbauzinsJaehrlich = null;

  /**
   * Gets or Sets grundstuecksEigentuemer
   */
  public enum GrundstuecksEigentuemerEnum {
    ANDERE("ANDERE"),
    
    OEFFENTLICH_KIRCHLICH("OEFFENTLICH_KIRCHLICH");

    private String value;

    GrundstuecksEigentuemerEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrundstuecksEigentuemerEnum fromValue(String text) {
      for (GrundstuecksEigentuemerEnum b : GrundstuecksEigentuemerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("grundstuecksEigentuemer")
  private GrundstuecksEigentuemerEnum grundstuecksEigentuemer = null;

  @JsonProperty("laufzeitBisJahr")
  private Jahreszahl laufzeitBisJahr = null;

  public Erbbaurecht erbbauzinsJaehrlich(BigDecimal erbbauzinsJaehrlich) {
    this.erbbauzinsJaehrlich = erbbauzinsJaehrlich;
    return this;
  }

   /**
   * Get erbbauzinsJaehrlich
   * @return erbbauzinsJaehrlich
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getErbbauzinsJaehrlich() {
    return erbbauzinsJaehrlich;
  }

  public void setErbbauzinsJaehrlich(BigDecimal erbbauzinsJaehrlich) {
    this.erbbauzinsJaehrlich = erbbauzinsJaehrlich;
  }

  public Erbbaurecht grundstuecksEigentuemer(GrundstuecksEigentuemerEnum grundstuecksEigentuemer) {
    this.grundstuecksEigentuemer = grundstuecksEigentuemer;
    return this;
  }

   /**
   * Get grundstuecksEigentuemer
   * @return grundstuecksEigentuemer
  **/
  @ApiModelProperty(example = "null", value = "")
  public GrundstuecksEigentuemerEnum getGrundstuecksEigentuemer() {
    return grundstuecksEigentuemer;
  }

  public void setGrundstuecksEigentuemer(GrundstuecksEigentuemerEnum grundstuecksEigentuemer) {
    this.grundstuecksEigentuemer = grundstuecksEigentuemer;
  }

  public Erbbaurecht laufzeitBisJahr(Jahreszahl laufzeitBisJahr) {
    this.laufzeitBisJahr = laufzeitBisJahr;
    return this;
  }

   /**
   * Get laufzeitBisJahr
   * @return laufzeitBisJahr
  **/
  @ApiModelProperty(example = "null", value = "")
  public Jahreszahl getLaufzeitBisJahr() {
    return laufzeitBisJahr;
  }

  public void setLaufzeitBisJahr(Jahreszahl laufzeitBisJahr) {
    this.laufzeitBisJahr = laufzeitBisJahr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Erbbaurecht erbbaurecht = (Erbbaurecht) o;
    return Objects.equals(this.erbbauzinsJaehrlich, erbbaurecht.erbbauzinsJaehrlich) &&
        Objects.equals(this.grundstuecksEigentuemer, erbbaurecht.grundstuecksEigentuemer) &&
        Objects.equals(this.laufzeitBisJahr, erbbaurecht.laufzeitBisJahr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(erbbauzinsJaehrlich, grundstuecksEigentuemer, laufzeitBisJahr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Erbbaurecht {\n");
    
    sb.append("    erbbauzinsJaehrlich: ").append(toIndentedString(erbbauzinsJaehrlich)).append("\n");
    sb.append("    grundstuecksEigentuemer: ").append(toIndentedString(grundstuecksEigentuemer)).append("\n");
    sb.append("    laufzeitBisJahr: ").append(toIndentedString(laufzeitBisJahr)).append("\n");
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

