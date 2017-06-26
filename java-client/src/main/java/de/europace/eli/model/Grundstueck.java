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
import de.europace.eli.model.Flaeche;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Grundstueck
 */

public class Grundstueck {
  @JsonProperty("groesse")
  private Flaeche groesse = null;

  /**
   * Gets or Sets grundstuecksArt
   */
  public enum GrundstuecksArtEnum {
    UNBEBAUTES_WOHNGRUNDSTUECK("UNBEBAUTES_WOHNGRUNDSTUECK"),
    
    UNBEBAUTES_MISCHGRUNDSTUECK("UNBEBAUTES_MISCHGRUNDSTUECK"),
    
    UNBEBAUTES_GEWERBEGRUNDSTUECK("UNBEBAUTES_GEWERBEGRUNDSTUECK"),
    
    LANDWIRTSCHAFTLICHES_GRUNDSTUECK("LANDWIRTSCHAFTLICHES_GRUNDSTUECK"),
    
    SONSTIGES_GRUNDSTUECK("SONSTIGES_GRUNDSTUECK");

    private String value;

    GrundstuecksArtEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrundstuecksArtEnum fromValue(String text) {
      for (GrundstuecksArtEnum b : GrundstuecksArtEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("grundstuecksArt")
  private GrundstuecksArtEnum grundstuecksArt = null;

  public Grundstueck groesse(Flaeche groesse) {
    this.groesse = groesse;
    return this;
  }

   /**
   * Get groesse
   * @return groesse
  **/
  @ApiModelProperty(example = "null", value = "")
  public Flaeche getGroesse() {
    return groesse;
  }

  public void setGroesse(Flaeche groesse) {
    this.groesse = groesse;
  }

  public Grundstueck grundstuecksArt(GrundstuecksArtEnum grundstuecksArt) {
    this.grundstuecksArt = grundstuecksArt;
    return this;
  }

   /**
   * Get grundstuecksArt
   * @return grundstuecksArt
  **/
  @ApiModelProperty(example = "null", value = "")
  public GrundstuecksArtEnum getGrundstuecksArt() {
    return grundstuecksArt;
  }

  public void setGrundstuecksArt(GrundstuecksArtEnum grundstuecksArt) {
    this.grundstuecksArt = grundstuecksArt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Grundstueck grundstueck = (Grundstueck) o;
    return Objects.equals(this.groesse, grundstueck.groesse) &&
        Objects.equals(this.grundstuecksArt, grundstueck.grundstuecksArt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groesse, grundstuecksArt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Grundstueck {\n");
    
    sb.append("    groesse: ").append(toIndentedString(groesse)).append("\n");
    sb.append("    grundstuecksArt: ").append(toIndentedString(grundstuecksArt)).append("\n");
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

